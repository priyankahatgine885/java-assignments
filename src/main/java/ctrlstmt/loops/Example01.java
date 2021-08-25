package ctrlstmt.loops;

import java.util.Scanner;

/*
Write a program to accept a character and a number, and print the character number times
   Input:
    Character: *
    Number: 6
   Output:
        ******

 */
public class Example01 {
    public static void main(String[] args) {
    printCharNumberTimes('*', 6);
    }
    public static void printCharNumberTimes(char ch, int number){
        for (int i = 1; i <= number; ++i){
            System.out.print(ch + " ");
        }

    }
}
