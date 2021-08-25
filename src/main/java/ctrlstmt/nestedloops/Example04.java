package ctrlstmt.nestedloops;
/*
Write a program to display
Prime numbers between 1 to 100
 */
public class Example04 {
    public static void main(String[] args) {
        printPrimeNo(1, 100);
    }

    private static void printPrimeNo(int start, int end) {
        String  primeNumbers = "";
        for (int i = 1; i <= end; ++i){
            int count=0;
            for (int num = i; num >=1 ; --num){
                if((i%num)==0){
                   count = count + 1;
                }
            }
            if(count == 2){
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}
