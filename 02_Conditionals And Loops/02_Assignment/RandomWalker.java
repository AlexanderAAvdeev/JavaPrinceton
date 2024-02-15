public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, i = 0;
        while ((Math.abs(x) + Math.abs(y)) < r) {
            System.out.println("(" + x + ", " + y + ")");
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
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + i);

    }
}
