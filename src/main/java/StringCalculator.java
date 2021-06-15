public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) return 0;

        String[] numbers = input.split(",");

        if (numbers.length > 1) {
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }

        return Integer.parseInt(numbers[0]);
    }
}
