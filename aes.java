import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

// AES Algorithm
public class aes {

    static SecretKeySpec getKey(byte[] key) throws Exception {
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        key = Arrays.copyOf(sha.digest(key), 16);
        return new SecretKeySpec(key, "AES");
    }

    public static void main(String[] args) throws Exception {

        // initialization
        String plaintext = "Anna University";
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKeySpec key = getKey("www.annauniv.edu".getBytes());

        // encryption
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(plaintext.getBytes());

        // decryption
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = cipher.doFinal(encrypted);

        // display output
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Encrypted: " + new String(encrypted));
        System.out.println("Decrypted: " + new String(decrypted));
    }
}

// Output
// Plaintext: Anna University
// Encrypted: kF?.??e?????j(l?
// Decrypted: Anna University