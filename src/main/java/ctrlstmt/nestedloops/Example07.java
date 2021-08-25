package ctrlstmt.nestedloops;
/*
Write a program to display
Armstrong Numbers between 1 to 500

 */
public class Example07 {
    public static void main(String[] args) {
        printArmstrongNo(1, 500);
    }

    private static void printArmstrongNo(int start, int end) {
        int i=start,arm;
        System.out.println("Armstrong numbers between 1 to 500");
        while(i<end)
        {
            arm=armstrongOrNot(i);
            if(arm==i)
                System.out.println(i);
            i++;
        }
    }
    private static int armstrongOrNot(int num)
    {
        int i,a=0;
        while(num!=0)
        {
            i=num%10;
            a=a+(i*i*i);
            num/=10 ;
        }
        return a;
    }
}
