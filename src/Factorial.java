public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Рекурсивно: " + n + "! = " + factorialRecursive(n));
        System.out.println("Итеративно: " + n + "! = " + factorialIterative(n));
    }

    //рекурсивная реализация
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    //итеративная реализация
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}