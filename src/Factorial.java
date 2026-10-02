public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Факториал " + n + " = " + factorialRecursive(n));
    }
    
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}