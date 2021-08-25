package ctrlstmt.nestedloops;
/*
5	4	3	2	1
4	3	2	1
3	2	1
2	1
1
 */
public class Example16 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 1, j = n; i <= n; ++i, --j) {
            System.out.println();
            printNoStartToEnd(j, 1);
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
