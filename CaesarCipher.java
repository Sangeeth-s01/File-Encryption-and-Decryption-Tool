package encryption;

public class CaesarCipher implements EncryptionAlgorithm {

    @Override
    public byte[] encrypt(byte[] data, byte[] key) {
        int shift = key[0];
        byte[] out = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            out[i] = (byte) (data[i] + shift);
        }
        return out;
    }

    @Override
    public byte[] decrypt(byte[] data, byte[] key) {
        int shift = key[0];
        byte[] out = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            out[i] = (byte) (data[i] - shift);
        }
        return out;
    }
}
