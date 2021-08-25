package ctrlstmt.nestedloops;
/*
Write a program to display
Fibonacci primes between 1 to 1000
 */
public class Example06 {
    public static void main(String[] args) {
        printFibonacciPrimeNo(1000);
    }
    private static void printFibonacciPrimeNo( int range) {
       int num1 ,num2 = 1,  sum = 1;
        System.out.print("Fibonacci prime numbers from 1 to 1000 are : ");
        while (num2 <= range) {
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
            System.out.print(num1 + ",");
        }
    }
}
