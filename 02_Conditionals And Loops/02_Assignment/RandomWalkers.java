public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0, y = 0, i = 0, steps = 0;
        for (int j = 1; j <= trials; j++) {
            x = y = i = 0;
            while ((Math.abs(x) + Math.abs(y)) < r) {
                double rnd = Math.random();
                i++;
                if (rnd >= 0 && rnd < 0.25) {
                    x = x + 1;
                }
                else if (rnd >= 0.25 && rnd < 0.5) {
                    x = x - 1;
                }
                else if (rnd >= 0.5 && rnd < 0.75) {
                    y = y + 1;
                }
                else if (rnd >= 0.75 && rnd < 1) {
                    y = y - 1;
                }
            }
            steps = steps + i;
        }
        double avgsteps = (double) steps / trials;
        System.out.println("average number of steps = " + avgsteps);
    }
}
