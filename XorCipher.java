package encryption;

public class XorCipher implements EncryptionAlgorithm {

    @Override
    public byte[] encrypt(byte[] data, byte[] key) {
        byte[] out = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            out[i] = (byte) (data[i] ^ key[i % key.length]);
        }
        return out;
    }

    @Override
    public byte[] decrypt(byte[] data, byte[] key) {
        return encrypt(data, key);
    }
}
