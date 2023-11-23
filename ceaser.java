// ceaser cipher
public class ceaser {
    static String encode(String plaintext, int offset) {
        String ciphertext = "";
        for (char ch : plaintext.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    ciphertext += (char) ((ch + offset - 'A') % 26 + 'A');
                } else {
                    ciphertext += (char) ((ch + offset - 'a') % 26 + 'a');
                }
            } else {
                ciphertext += ch;
            }
        }
        return ciphertext;
    }

    static String decode(String ciphertext, int offset) {
        return encode(ciphertext, 26 - offset);
    }

    public static void main(String[] args) {
        String plaintext = "Anna University";
        int offset = 3;
        String ciphertext = encode(plaintext, offset);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);
        System.out.println("Decoded: " + decode(ciphertext, offset));
    }
}

// Output
// Plaintext: Anna University
// Ciphertext: Dqqd Xqlyhuvlwb
// Decoded: Anna University