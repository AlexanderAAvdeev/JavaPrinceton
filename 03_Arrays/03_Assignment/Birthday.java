public class Birthday {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]); // number of days
        int trials = Integer.parseInt(args[1]); // number of trials
        int[] times = new int[days + 2]; // number of times i people entered the room
        boolean[] hasBirthday = new boolean[days];


        for (int i = 0; i < trials; i++) {
            for (int k = 0; k < days; k++) { // reset birthday
                hasBirthday[k] = false;
            }
            for (int j = 0; j < days; j++) {

                int d = (int) ((days - 1) * Math.random());
                if (hasBirthday[d] == false) {
                    hasBirthday[d] = true;
                    continue;
                }
                else if (hasBirthday[d] == true) {
                    times[j]++; // number of times i people entered the room +1
                    break;
                }
            }
        }


        int m = 0;
        double frac = 0;
        double count = 0;

        //Print a table that summarizes the results
        // (the count i, the number of times that exactly i people enter the room,
        // and the fraction of times that i or fewer people enter the room)
        // for each possible value of i from 1 until the fraction reaches (or exceeds) 50%.
        while (frac <= 0.5) {
            count += times[m];
            frac = count / trials;
            int countint = (int) count;
            System.out.println(m + 1 + "   " + countint + "   " + frac);
            m++;
        }
    }
}
