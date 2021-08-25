package ctrlstmt.loops;
/*
Write a program to accept a number and print all factors excluding the number
	Input: 24
	Output: all factors: 1, 2, 3, 4, 6, 8, 12
 */
public class Example08 {
    public static void main(String[] args) {
        printFactorsOfNumber(24);
    }

    private static void printFactorsOfNumber(int num) {
        System.out.print("All factors of given number : "  );
        for(int i = 1; i <= num; ++i){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
