package ctrlstmt.nestedloops;
/*
Print following pattern
1	3	5	7	9
2	4	6	8
3	5	7
4	6
5
 */
public class Example17 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 1, j = i; i <= n; ++i, ++j) {
            System.out.println();
            printNoStartToEnd(j);
            printNChars(n - j, '-');
        }
    }

    private static void printNoStartToEnd(int start) {
        int k = 0;
        for (int i = start; i <= 10; ++i){
            System.out.print(i + k);
        }
    }

    private static void printNChars(int n, char ch) {
        while (n > 0) {
            System.out.print(ch + " ");
            --n;
        }
    }
}
