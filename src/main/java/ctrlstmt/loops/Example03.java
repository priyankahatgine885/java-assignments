package ctrlstmt.loops;
/*
Write a program to accept a number and
Calculate sum of digits of integer
Input: 9362
Output: 2 + 6 + 3 + 9 = 20
 */
public class Example03 {
    public static void main(String[] args) {
       int sum = getSumOfDigits(9362);
        System.out.println(sum);
    }

    private static int getSumOfDigits(int num) {
       int sum = 0,digit;
       if(num < 0){
           num = - num;
       }
       while(num != 0){
           digit = num % 10;
           sum = sum + digit;
           num = num / 10;
       }
       return sum;
    }
}
