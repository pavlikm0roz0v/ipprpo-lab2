public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Факториал " + n + " = " + factorialIterative(n));
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}