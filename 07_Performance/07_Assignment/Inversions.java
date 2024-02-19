public class Inversions {
    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        // build sorted array of length n.
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        // iterating the array and inversions until numbers match
        long inversionsRemaining = k;
        int firstIndex = 0;
        int lastIndex = n - 1;
        while (inversionsRemaining > 0 && firstIndex <= lastIndex) {
            if (lastIndex != firstIndex) {
                int temp = a[lastIndex];
                a[lastIndex] = a[lastIndex - 1];
                a[lastIndex - 1] = temp;
                inversionsRemaining--;
                lastIndex--;
            }
            else {
                firstIndex++;
                lastIndex = n - 1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] a = generate(n, k);
        for (int i = 0; i < n; i++) {
            StdOut.print(a[i] + " ");
        }
    }
}
