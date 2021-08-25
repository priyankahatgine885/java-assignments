package ctrlstmt.nestedloops;
/*
Write a program to print the tables of the numbers from 1 to 10.
 */
public class Example02 {
    public static void main(String[] args) {
        printTableOfNoStartToEnd(1, 10);
    }

    private static void printTableOfNoStartToEnd(int start, int end) {
        for (int i = start; i <= end; ++i){
            System.out.println(start+" * "+i+" = "+start*i);
        }
    }
}
