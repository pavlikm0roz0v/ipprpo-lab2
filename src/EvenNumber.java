public class EvenNumber {
    public static void main(String[] args) {
        int[] numbers = {7, 10, 15, 22};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " — чётное");
            } else {
                System.out.println(number + " — нечётное");
            }
        }
    }
}