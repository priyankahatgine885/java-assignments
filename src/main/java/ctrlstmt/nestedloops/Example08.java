package ctrlstmt.nestedloops;
/*
Write a program to display First 5 prime numbers after a given number.
	Input: 7
	Output: 11 13 17 19 23

 */
public class Example08 {
    public static void main(String[] args) {
        printFirstFiveNoAfterGivenNo(7);
    }
    private static void printFirstFiveNoAfterGivenNo(int num) {
        int count, j, n=0, i=num;
        while(n<5)
        {
            j=1;
            count=0;
            while(j<=i)
            {
                if(i%j==0)
                    count++;
                j++;
            }
            if(count==2)
            {
                System.out.printf("%d ",i);
                n++;
            }
            i++;
        }
    }
}
