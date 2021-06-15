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
    void should_return_1_for_1() {
        StringCalculator stringCalculator = new StringCalculator();
        int value = stringCalculator.add("1");
        assertEquals(1, value);
    }
}
