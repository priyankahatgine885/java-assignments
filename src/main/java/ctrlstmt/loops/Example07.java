package ctrlstmt.loops;
/*
Write a program to find the factorial of a given number.
	Input: 5
	Output: 1 * 2 * 3 * 4 * 5 = 120

 */
public class Example07 {
    public static void main(String[] args) {
       int num = getTheFactorialNumber(5);
        System.out.println(num);
    }

    private static int getTheFactorialNumber(int num) {
        int mult = 1;
        for (int i = 1; i <= num; ++i){
            mult = mult * i;
        }
        return mult;
    }
}
