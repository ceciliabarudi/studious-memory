import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    void fail() {
        StringCalculator stringCalculator = new StringCalculator();
        String value = stringCalculator.callForAction();
        assertEquals("Food", value);
    }

    @Test
    void it_should_not_fail() {
        assertTrue(true);
    }
}
