public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) return 0;

        String[] numbers = input.split(",");

        int sum = 0;
        for (int i=0; i<numbers.length; ++i) {
            sum += Integer.parseInt(numbers[i]);
        }

        return sum;
    }
}
