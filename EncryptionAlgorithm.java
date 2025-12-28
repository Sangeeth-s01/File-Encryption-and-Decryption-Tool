package encryption;

public interface EncryptionAlgorithm {
    byte[] encrypt(byte[] data, byte[] key) throws Exception;
    byte[] decrypt(byte[] data, byte[] key) throws Exception;
}
