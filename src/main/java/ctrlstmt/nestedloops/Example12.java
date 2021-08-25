package ctrlstmt.nestedloops;

/*
Print following pattern
5
5	4
5	4	3
5	4	3	2
5	4	3	2	1
 */
public class Example12 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = n, j = 1; i >= 1; --i, ++j) {
            System.out.println();
            printNoStartToEnd(n, n-(n-i));
            printNChars(n - j, '-');
        }
    }

    private static void printNoStartToEnd(int start, int end) {
        while (start >= end) {
            System.out.print(start + " ");
            --start;
        }
    }

    private static void printNChars(int n, char ch) {
        while (n > 0) {
            System.out.print(ch + " ");
            --n;
        }
    }
}
