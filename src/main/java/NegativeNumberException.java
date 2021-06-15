public class NegativeNumberException extends Exception {
    NegativeNumberException(int negative) {
        super("negatives not allowed: " + negative);
    }
}
