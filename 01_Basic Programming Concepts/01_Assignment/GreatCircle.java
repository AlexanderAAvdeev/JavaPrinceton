public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double xr1 = Math.toRadians(x1);
        double xr2 = Math.toRadians(x2);
        double yr1 = Math.toRadians(y1);
        double yr2 = Math.toRadians(y2);
        double r = 6371.0;
        double distance = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((xr2 - xr1) / 2), 2) +
                                                              Math.cos(xr1) * Math.cos(xr2)
                                                                      * Math.pow(
                                                                      Math.sin((yr2 - yr1) / 2),
                                                                      2)));

        System.out.println(distance + " kilometers");
    }
}
