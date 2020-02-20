public class Practice {
    public static double intDivideToReal (int a, int b) throws ArithmeticException {
        try {
            double c = a /b;
            return c;
        } catch(ArithmeticException ae) {
            throw new Error("Error in intDivideToReal: Attempted to divide by zero");
        }
    }

    public static void main(String[] args) {
        intDivideToReal(2, 0);
    }
    public static String comp(int a, int b) {
        if(a == b) {
            return String.format("%d = %d", a, b);
        } else if(a < b) {
            return String.format("%d < %d", a, b);
        } else {
            return String.format("%d > %d", a, b);
        }
    }
}
