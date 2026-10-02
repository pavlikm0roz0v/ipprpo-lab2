public class Palindrome {
    public static void main(String[] args) {
        String word = "шалаш";
        System.out.println(word + " — палиндром? " + isPalindrome(word));
    }

    public static boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}