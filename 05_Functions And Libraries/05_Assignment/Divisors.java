public class Divisors {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("gcd" + "(" + a + ", " + b + ")" + " = " + gcd(a, b));
        System.out.println("lcm" + "(" + a + ", " + b + ")" + " = " + lcm(a, b));
        System.out.println(
                "areRelativePrime" + "(" + a + ", " + b + ")" + " = " + areRelativelyPrime(a, b));
        System.out.println("totient" + "(" + a + ")" + " = " + totient(a));
        System.out.println("totient" + "(" + b + ")" + " = " + totient(b));
    }

    public static int gcd(int a, int b) {
        int divisorA = Math.abs(a);
        int divisorB = Math.abs(b);
        while (divisorB != 0) {
            int temp = divisorA;
            divisorA = divisorB;
            divisorB = temp % divisorA;

        }
        return divisorA;
    }

    public static int lcm(int a, int b) {
        int multiplyA = Math.abs(a);
        int multiplyB = Math.abs(b);
        int gcdNum = gcd(a, b);
        if (gcdNum == 0) {
            return 0;
        }
        else {
            return multiplyA / gcd(a, b) * multiplyB;
        }
    }

    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static int totient(int n) {
        int resultT = 0;
        for (int i = 1; i <= n; i++) {
            if (areRelativelyPrime(i, n)) {
                resultT++;
            }
        }
        return resultT;
    }
}

