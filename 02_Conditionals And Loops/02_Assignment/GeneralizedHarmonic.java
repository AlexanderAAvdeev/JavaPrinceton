public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        Double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double H = (1 / Math.pow(i, r));
            sum = sum + H;
        }
        System.out.println(sum);

    }
}
