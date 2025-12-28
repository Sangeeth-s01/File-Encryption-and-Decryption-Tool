package ui;

import encryption.*;
import filehandler.FileManager;
import util.Validator;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class ConsoleUI {

    private static final HashMap<Integer, EncryptionAlgorithm> algos = new HashMap<>();

    static {
        algos.put(1, new CaesarCipher());
        algos.put(2, new XorCipher());
        algos.put(3, new AESCipher());
    }

    public static void start() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Encrypt\n2. Decrypt");
        int mode = sc.nextInt();
        sc.nextLine();

        System.out.println("Algorithm: 1.Caesar 2.XOR 3.AES");
        int algo = sc.nextInt();
        sc.nextLine();

        System.out.print("Input file: ");
        File in = new File(sc.nextLine());
        Validator.validateFile(in);

        System.out.print("Output file: ");
        File out = new File(sc.nextLine());

        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (mode == 1) {
            FileManager.encrypt(in, out, algos.get(algo), pass);
        } else {
            FileManager.decrypt(in, out, algos.get(algo), pass);
        }

        System.out.println("Operation successful.");
    }
}
