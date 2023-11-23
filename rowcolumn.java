public class rowcolumn {
    public static void main(String args[]) {
        String plaintext = "Security Laboratory";
        String s = "";
        int start = 0;
        for (int i = 0; i < plaintext.length(); i++) {
            if (plaintext.charAt(i) == ' ') {
                s = s + plaintext.substring(start, i);
                start = i + 1;
            }
        }
        s = s + plaintext.substring(start);
        System.out.println("Plaintext: " + s);
        System.out.print("Ciphertext: ");
        // end of space deletion
        int k = s.length();
        int l = 0;
        int col = 4;
        int row = s.length() / col;
        char ch[][] = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (l < k) {
                    ch[i][j] = s.charAt(l);
                    l++;
                } else {
                    ch[i][j] = '#';
                }
            }
        }
        // arranged in matrix
        char trans[][] = new char[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i] = ch[i][j];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(trans[i][j]);
            }
        }
        System.out.println();
    }
}

// Output
// Plaintext: SecurityLaboratory
// Ciphertext: SrLreiaactbtuyoo
