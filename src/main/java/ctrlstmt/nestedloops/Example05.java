package ctrlstmt.nestedloops;
/*
Write a program to display
Twin Prime numbers between 1 to 100
 */
public class Example05 {
    public static void main(String[] args) {
        printTwinPrime(100);
    }

    private static void printTwinPrime(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        System.out.println("Twin prime numbers from 1 to 100 are :");
        for (int i = 2; i <= n - 2; i++) {

            if (prime[i] == true &&
                    prime[i + 2] == true)
                System.out.print(" (" + i + ", " +
                        (i + 2) + ")");
        }

    }
}
