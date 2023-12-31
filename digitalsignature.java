import java.security.*;

// Digital Signature Algorithm (DSA) 
public class digitalsignature {
    public static void main(String[] args) throws Exception {
        String plaintext = "Anna University";
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        Signature signature = Signature.getInstance("SHA256withDSA");
        signature.initSign(privateKey);
        signature.update(plaintext.getBytes());
        byte[] signatureBytes = signature.sign();
        System.out.println("Signature: " + new String(signatureBytes));
    }
}

// Output
// Signature: 0<☻∟V/ ?wX?Q??z#?*?,?a?HOZ?8?☻∟/d'??{g?H??)??E-?Y?.UKY??^H