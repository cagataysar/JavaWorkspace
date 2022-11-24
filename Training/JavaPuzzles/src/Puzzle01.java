public class Puzzle01 {
    public static void main (String[] args) {
        System.out.println("IsOdd:" + isOdd(5));
        System.out.println("IsOdd:" + isOdd(10));
        System.out.println("IsOdd:" + isOdd(- 5));
        System.out.println("IsOdd:" + isOdd(- 10));
    }

    public static boolean isOdd (int number) {
        return (number & 1) != 0;
    }

//     not works for negative numbers!

//     public static boolean isOdd(int number) {
//     return number % 2 == 1;
//     }
}
