package ctrlstmt.nestedloops;

/*
Print following patterns
5	4	3	2	1
5	4	3	2
5	4	3
5	4
5
 */
public class Example14 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 1, j = 5 ; i <= n; ++i, --j) {
            System.out.println();
            printNoStartToEnd(n, i);
            printNChars(n-j, '-');
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
