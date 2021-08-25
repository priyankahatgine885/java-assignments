package ctrlstmt.nestedloops;

/*
Write a program to find sin, cos, exp of a given number using taylor series.
 */
public class Example18 {
    public static void main(String[] args) {
        double x = 30;
        int n = 4;
        sin(degreesToRadian(x), n);
    }

    private static void sin(double x, int n) {
        double sum = 0;
        double currentTerm = 0.0;
        for (int j = 0; j <= n; j++) {
            currentTerm = getPower(-1, j) * getPower(x, (2 * j) + 1) / getFactorial((2 * j) + 1);
            sum = sum + currentTerm;
        }
        System.out.println("sin(" + x + ")=" + sum);
    }

    private static double degreesToRadian(double degree) {
        return degree * 3.14159 / 180;
    }

    private static int getFactorial(int No) {
        int result = 1;
        while (No > 0) {
            result *= No;
            No--;
        }
        return result;
    }

    private static double getPower(double base, int power) {
        double result = base;
        for (int i = 1; i < power; i++) {
            result = result * base;
        }
        return result;
    }
}
