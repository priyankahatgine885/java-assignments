package ctrlstmt.loops;
/*
Write a program to accept a number and print unique pairs of numbers such that multiplication of the pair is given number
	Input: 24
	Output:
	1 * 24 = 24
	2 * 12 = 24
	3 * 8 = 24
	4 * 6 = 24
 */
public class Example09 {
    public static void main(String[] args) {
        printUniquePairsOfNumber(24);
    }

    private static void printUniquePairsOfNumber(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + "*" + num / i + "=" + num);
            }
        }
    }
}
