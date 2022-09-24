

public class Calculations {
    public static void main(String[] args) {
        integerCalculations();
        doubleCalculations();
    }

    public static void integerCalculations() {
        int x = 1, m = 2, c = 3;
        int y = m * x + c;
        int yDivm = y / m;
        int yRemm = y % m;
        System.out.println("Integer Arithmetic");
        System.out.println("y=" + y + " m=" + m);
        System.out.println("y divided by m=" + yDivm);
        System.out.println("y remainder m=" + yRemm);
    }

    public static void doubleCalculations() {
        double x = 1, m = 2, c = 3;
        double y = m * x + c;
        double yDivm = y / m;
        double yRemm = y % m;
        double ySqrt = Math.sqrt(y);
        int ySqrtInt = (int) ySqrt;
        double yPow3 = Math.pow(y, 3);
        System.out.println("Double Arithmetic");
        System.out.println("y=" + y + " m=" + m);
        System.out.println("y divided by m=" + yDivm);
        System.out.println("y remainder m=" + yRemm);
        System.out.println("square root y=" + ySqrt);
        System.out.println("square root of y to integer=" + ySqrtInt);
        System.out.println("y to the power of 3=" + yPow3);
    }
}
