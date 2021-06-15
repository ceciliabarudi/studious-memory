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

    @Test
    void should_return_correct_value_for_two_parameters() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void should_return_correct_value_for_unknown_amount_of_parameters() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.add("1,2,3,4"));
        assertEquals(20, stringCalculator.add("1,5,8,1,5"));
    }

    @Test
    void can_handle_new_line_as_delimiter() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }
}
