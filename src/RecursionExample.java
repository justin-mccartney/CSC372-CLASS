public class RecursionExample {
    public static void main(String[] args) {
        int number = 10;
        long factorial = factorial(number);
        System.out.println("Factorial of " + number + ": " + factorial);
    }

    private static long factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}