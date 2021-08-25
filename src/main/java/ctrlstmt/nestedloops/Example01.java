package ctrlstmt.nestedloops;

/*
Print following pattern
	* * * * *
	* * * * *
	* * * * *
	* * * * *
	* * * * *

 */
public class Example01 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; ++i) {
            System.out.println();
            printNChars(n, '*');
        }
    }

    private static void printNChars(int n, char ch) {
        for (int i = 1; i <= n; ++i){
            System.out.print(ch + " ");
        }
    }
}
