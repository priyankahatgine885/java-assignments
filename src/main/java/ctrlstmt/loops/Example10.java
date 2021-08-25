package ctrlstmt.loops;
/*
Write a program to accept a number and print its prime factors.
	Input: 180
	Output: 180 = 2 * 2 * 3 * 3 * 5
 */
public class Example10 {
    public static void main(String[] args) {
        printPrimeFactors(180);
    }

    private static void printPrimeFactors(int num) {
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 2)
            System.out.print(num);
    }
}
