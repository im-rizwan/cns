// Defi Hellman
public class Diffehellman {
    public static void main(String[] args) {
        int prime = 23;
        int primitiveRoot = 5;
        int alicePrivateKey = 4;
        int bobPrivateKey = 3;

        double aliceSends = Math.pow(primitiveRoot, alicePrivateKey) % prime;
        double bobComputes = Math.pow(aliceSends, bobPrivateKey) % prime;
        double bobSends = Math.pow(primitiveRoot, bobPrivateKey) % prime;
        double aliceComputes = Math.pow(bobSends, alicePrivateKey) % prime;
        double sharedSecretKey = Math.pow(primitiveRoot, (alicePrivateKey * bobPrivateKey)) % prime;

        System.out.println("Alice sends: " + aliceSends);
        System.out.println("Bob computes: " + bobComputes);
        System.out.println("Bob sends: " + bobSends);
        System.out.println("Alice computes: " + aliceComputes);
        System.out.println("Shared secret key: " + sharedSecretKey);
        if (aliceComputes == sharedSecretKey && bobComputes == sharedSecretKey) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }
}

// Output
// Alice sends: 4.0
// Bob computes: 18.0
// Bob sends: 10.0
// Alice computes: 18.0
// Shared secret key: 18.0
// Success