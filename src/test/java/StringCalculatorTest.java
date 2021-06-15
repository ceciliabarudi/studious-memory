import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    void should_return_0_with_empty_string() {
        StringCalculator stringCalculator = new StringCalculator();
        int value = stringCalculator.add("");
        assertEquals(0, value);
    }

    @Test
    void should_return_correct_value_for_single_parameter() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(5, stringCalculator.add("5"));
        assertEquals(199, stringCalculator.add("199"));
    }
}
