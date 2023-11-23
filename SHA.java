import java.security.MessageDigest;

// SHA-1
public class SHA {

    static String toHex(byte[] bytes) {
        String result = "";
        for (byte b : bytes) {
            result += String.format("%02X", b);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        String input = "Jayakarthik.jk";
        md.update(input.getBytes());
        byte[] hash = md.digest();
        System.out.println(String.format("SHA('%s') = %s", input, toHex(hash)));
    }
}

// Output
// SHA('Jayakarthik.jk') = DF5AAE2546FA74AD15BCACA634AF2AD5B8A00E00