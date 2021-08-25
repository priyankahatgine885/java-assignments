package ctrlstmt.loops;
/*
Reverse the number
Input: 9362
Output: 2639
 */
public class Example04 {
    public static void main(String[] args) {
        getReverseNumber(9362);
    }

    private static void getReverseNumber(int num) {
        int digit;
        if(num < 0){
            num = -num;
        }
        System.out.print("Reverse number : ");
        while (num != 0){
            digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
    }
}
