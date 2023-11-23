import java.security.MessageDigest;

// SHA-1
public class sha1 {

    static String toHex(byte[] bytes) {
        String result = "";
        for (byte b : bytes) {
            result += String.format("%02X", b);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        String input = "Anna University";
        md.update(input.getBytes());
        byte[] hash = md.digest();
        System.out.println(String.format("SHA('%s') = %s", input, toHex(hash)));
    }
}

// Output
// SHA('Anna University') = 275A1E38B121FA6F977738BBEF9B73D3931C69A6