package ctrlstmt.nestedloops;

/*
Print following pattern
1
1	2
1	2	3
1	2	3	4
1	2	3	4 	5

 */
public class Example11 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; ++i) {
            System.out.println();
            printNoStartToEnd(1, n - (n - i));
            printNChars(n - i, '-');
        }
    }

    private static void printNoStartToEnd(int start, int end) {
        while (start <= end) {
            System.out.print(start + " ");
            ++start;
        }
    }

    private static void printNChars(int n, char ch) {
        while (n > 0) {
            System.out.print(ch + " ");
            --n;
        }
    }
}
