public class EvenNumber {
    public static void main(String[] args) {
        int number = 7;

        //баг (проверяем на нечётность вместо чётности)
        if (number % 2 == 1) {
            System.out.println(number + " — чётное");
        } else {
            System.out.println(number + " — нечётное");
        }
    }
}