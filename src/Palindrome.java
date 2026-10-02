public class Palindrome {
    public static void main(String[] args) {
        String word = "Шалаш";
        System.out.println(word + " — палиндром? " + isPalindrome(word));
    }

    //улучшенная реализация (игнорирование регистров и пробелов)
    public static boolean isPalindrome(String text) {
        String cleaned = text.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}