package ctrlstmt.nestedloops;

/*
Print Pascal Triangle
	       1
         1   1
       1   2   1
     1   3   3   1
   1   4   6   4   1


Each term in the Pascal triangle is a binomial coefficient.
            n!
	   -------------
  	    r! × n − r!
     Where n is row number and r is column number.

 */
public class Example10 {
    public static void main(String[] args) {
        displayPascalTriangle(5);
    }

    private static void displayPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            printNchar(n - i + 1, ' ');
            printRowPascalTriangle(i);
        }
    }

    private static void printRowPascalTriangle(int row) {
        for (int col = 0; col <= row; col++) {
            int value = binomialCoefficient(row, col);
            System.out.print("\t" + value + "\t");


        }
    }

    private static int binomialCoefficient(int n, int r) {
        int bc;
        int rowFact = factorial(n);
        int colFact = factorial(r);
        int ncrFact = factorial(n - r);

        bc = rowFact / (colFact * ncrFact);
        return bc;
    }

    private static int factorial(int n) {
        int f = 1;
        while (n > 0) {
            f *= n;
            --n;
        }
        return f;
    }

    private static void printNchar(int n, char ch) {
        while (n > 0) {
            System.out.print("\t" + ch);
            n--;
        }
    }
}
