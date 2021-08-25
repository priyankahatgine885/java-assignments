package ctrlstmt.loops;

class Example13 {
    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        int result = printReverseNumber(value);
        System.out.println(result);
    }
    private static int printReverseNumber(int value){
        int reverse = 0;
        int digit = 0;
        while(value > 0){
            digit = value % 10;
            reverse = reverse * 10 + digit;
            value = value / 10;
        }
        return reverse;
    }
}