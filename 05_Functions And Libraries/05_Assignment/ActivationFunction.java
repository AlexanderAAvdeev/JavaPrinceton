public class ActivationFunction {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double resultH = heaviside(x);
        System.out.println("heviside " + "(" + x + ")" + " = " + resultH);
        double resultS = sigmoid(x);
        System.out.println("sigmoid " + "(" + x + ")" + " = " + resultS);
        double resultT = tanh(x);
        System.out.println("tanh " + "(" + x + ")" + " = " + resultT);
        double resultSoft = softsign(x);
        System.out.println("softsign " + "(" + x + ")" + " = " + resultSoft);
        double resultSQ = sqnl(x);
        System.out.println("sqnl " + "(" + x + ")" + " = " + resultSQ);
    }

    public static double heaviside(double x) {
        double H = 0;
        if (x < 0) H = 0;
        else if (x == 0) H = 0.5;
        else if (x > 0) H = 1;
        return H;
    }

    public static double sigmoid(double x) {
        double S = 1 / (1 + Math.exp(-x));
        return S;
    }

    public static double tanh(double x) {
        double T = (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
        return T;
    }

    public static double softsign(double x) {
        double Soft = x / (1 + Math.abs(x));
        return Soft;
    }

    public static double sqnl(double x) {
        double SQ = 0;
        if (x <= -2) SQ = -1;
        else if (x > -2 && x < 0) SQ = x + (x * x) / 4;
        else if (x >= 0 && x < 2) SQ = x - (x * x) / 4;
        else if (x >= 2) SQ = 1;
        return SQ;
    }
}
