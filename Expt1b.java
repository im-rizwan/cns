public class Expt1b {
    static char[] table = new char[26];

    static String prepareText(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]", "") + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        input = input.replaceAll("J", "I");
        return input;
    }

    static void generateTable(String key) {
        key = prepareText(key);
        int i = 0;
        for (char c : key.toCharArray()) {
            if (new String(table).indexOf(c) < 0 && c != 'J') {
                table[i++] = c;
            }
        }
    }

    static String encrypt(String plaintext) {
        plaintext = prepareText(plaintext);
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i += 2) {
            char a = plaintext.charAt(i);
            char b = plaintext.charAt(i + 1);
        }
        return ciphertext;
    }

    public static void main(String[] args) {
        String key = "CSE";
        String plaintext = "Jayakarthik.jk";
        generateTable(key);

    }
}
