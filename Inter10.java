// Encryptable.java
public interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

// AES.java
public class AES implements Encryptable {
    @Override
    public String encrypt(String data) {
        // implementation for AES encryption
    }

    @Override
    public String decrypt(String encryptedData) {
        // implementation for AES decryption
    }
}

// RSA.java
public class RSA implements Encryptable {
    @Override
    public String encrypt(String data) {
        // implementation for RSA encryption
    }

    @Override
    public String decrypt(String encryptedData) {
        // implementation for RSA decryption
    }
}
