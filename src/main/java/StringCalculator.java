public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) return 0;

        String delimiters = "[,\n]";
        if (input.startsWith("//")) {
            delimiters = input.substring(2,3);
            input = input.substring(4);
        }
        String[] numbers = input.split(delimiters);

        int sum = 0;
        for (int i=0; i<numbers.length; ++i) {
            sum += Integer.parseInt(numbers[i]);
        }

        return sum;
    }
}
