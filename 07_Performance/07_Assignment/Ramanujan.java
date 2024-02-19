public class Ramanujan {

    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        // Compute the cube root of n and round up to the nearest integer
        long nCubeRoot = (long) (Math.ceil(Math.cbrt(n)));
        // Initialize a count and a variable to keep track of the second cube in the sum
        int countCubs = 0;
        long cubeSecond = 0;
        // Iterate over all possible values of the first cube in the sum
        for (long i = nCubeRoot; i > 1 && countCubs != 2; i--) {
            // Compute the cube root of n - i^3 and round up to the nearest integer.
            // This gives us the highest possible value for the second cube in the current pair.
            long temp = (long) (Math.ceil(Math.cbrt(n - i * i * i)));
            if (temp < 0) continue;
            if (i <= cubeSecond) break;
            else {
                if (temp * temp * temp + i * i * i == n) {
                    countCubs++;
                    cubeSecond = temp;
                }
            }
        }
        return (countCubs == 2);
    }

    // takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        StdOut.println(isRamanujan(n));
    }
}


