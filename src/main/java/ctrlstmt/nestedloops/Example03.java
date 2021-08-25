package ctrlstmt.nestedloops;
/*
Modify above program (18) to accept a range i.e. two numbers and print tables of numbers within the
	range.
	Input: 3
	Output:
	3	4	5	6
	6	8	10	12
	9	12	15	18
	12	16	20	24
	15	20	25	30
	18	24	30	36
	21	28	35	42
	24	32	40	48
	27	36	45	54
	30	40	50	60

 */
public class Example03 {
    public static void main(String[] args) {
        printTableOfNo(3);
    }
    private static void printTableOfNo(int range) {
        System.out.println(range);
        for (int i = range; i <= 10; ++i){
            System.out.println(range*i);
        }
    }
}
