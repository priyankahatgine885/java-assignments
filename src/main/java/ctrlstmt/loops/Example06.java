package ctrlstmt.loops;

import java.util.Scanner;

/*
Check whether it is Armstrong no. (when sum of cube of all digits of equals the number then the number is called as Armstrong number)
Example: 153
(1 * 1 * 1)+(5 * 5 * 5)+(3 * 3 * 3) = 1 + 125 + 27 = 153
Input: 936
Output: 936 is not an Armstrong number
Input: 153
Output: 153 is an Armstrong number

 */
public class Example06 {
    public static void main(String[] args) {
        int value = 153;
        boolean bRet = isNumberArmstrong(value);
        if (bRet == true) {
            System.out.println("Given number " + value + " is armstrong");
        } else {
            System.out.println("Given number " + value + " is not armstrong");
        }
    }

    private static boolean isNumberArmstrong(int value) {
        int temp, digits=0, last=0, sum=0;
        temp=value;

        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = value;
        while(temp>0)
        {

            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }

        if(value == sum) {
            return true;
        }else {
            return false;
        }
    }
}
