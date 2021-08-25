package ctrlstmt.loops;
/*
Write a program to accept integer values of base and index and calculate power of base to index.
	Input:
	base: 2
	index: 5
	Output: 32
	Input:
	base: 8
	index: 3
	Output: 512

 */
public class Example11 {
    public static void main(String[] args) {
       long power = getPowerOfBaseToIndex(2, 5);
        System.out.println(power);
    }

    private static long getPowerOfBaseToIndex(int base, int index) {
        long power = 1;
        for (int i = 1; i <= index; ++i){
            power = power * base;
        }
        return power;
    }
}
