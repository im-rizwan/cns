import javax.crypto.*;

// DES Algorithm
public class DES {
    public static void main(String[] args) throws Exception {

        String plaintext = "Anna University";
        // initialize
        KeyGenerator generator = KeyGenerator.getInstance("DES");
        SecretKey key = generator.generateKey();
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
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
// Encrypted: ???I??h?B.????
// Decrypted: Anna University