package ctrlstmt.loops;
/*
Check whether given number is numeric palindrome or not
Input: 9362
Output: 9362 is not a numeric palindrome
Input: 36963
Output: 36963 is a numeric palindrome
 */
public class Example05 {
    public static void main(String[] args) {
        int value = 36963;
        boolean bRet = isNumberPalindrome(value);
        if (bRet == true) {
            System.out.println("Given number " + value + " is palindrome");
        } else {
            System.out.println("Given number " + value + " is not palindrome");
        }
    }

    private static boolean isNumberPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }
}
