import java.util.List;

public class NegativeNumberException extends Exception {
    NegativeNumberException(List<Integer> negative) {
        super("negatives not allowed: " + negative);
    }
}
