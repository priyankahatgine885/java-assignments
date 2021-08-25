package ctrlstmt.loops;
/*
Write a program to print a table of given numbers.
    Input: 9
    Output:
     9 x 1 = 9
     9 x 2 = 18
     9 x 3 = 27
     9 x 4 = 36
     9 x 5 = 45
     9 x 5 = 54
     9 x 7 = 63
     9 x 8 = 72
     9 x 9 = 81
     9 x 10 = 90
 */
public class Example02 {
    public static void main(String[] args) {
        printTableOfGivenTime(9);
    }

    private static void printTableOfGivenTime(int num) {
        for (int i = 1; i <= 10; ++i){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
