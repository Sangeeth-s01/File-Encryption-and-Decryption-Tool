package filehandler;

import encryption.EncryptionAlgorithm;
import keymanagement.KeyGenerator;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class FileManager {

    private static final int CHUNK_SIZE = 4096;

    public static void encrypt(
            File input,
            File output,
            EncryptionAlgorithm algorithm,
            String password
    ) throws Exception {

        byte[] salt = KeyGenerator.generateSalt();
        byte[] key = KeyGenerator.deriveKey(password, salt);

        Queue<byte[]> queue = new LinkedList<>();

        try (InputStream in = new BufferedInputStream(new FileInputStream(input))) {
            byte[] buffer;
            int read;
            while ((read = in.read(buffer = new byte[CHUNK_SIZE])) != -1) {
                byte[] block = new byte[read];
                System.arraycopy(buffer, 0, block, 0, read);
                queue.add(block);
            }
        }

        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(output))) {
            out.write(salt); // 

            while (!queue.isEmpty()) {
                byte[] enc = algorithm.encrypt(queue.poll(), key);
                out.write(enc);
            }
        }
    }

    public static void decrypt(
            File input,
            File output,
            EncryptionAlgorithm algorithm,
            String password
    ) throws Exception {

        try (InputStream in = new BufferedInputStream(new FileInputStream(input))) {

            byte[] salt = new byte[16];
            if (in.read(salt) != 16) {
                throw new SecurityException("Invalid encrypted file format");
            }

            byte[] key = KeyGenerator.deriveKey(password, salt);

            try (OutputStream out = new BufferedOutputStream(new FileOutputStream(output))) {
                byte[] buffer;
                int read;
                while ((read = in.read(buffer = new byte[CHUNK_SIZE])) != -1) {
                    byte[] block = new byte[read];
                    System.arraycopy(buffer, 0, block, 0, read);
                    out.write(algorithm.decrypt(block, key));
                }
            }
        }
    }
}
