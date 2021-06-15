import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void should_return_0_with_empty_string() throws NegativeNumberException {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void should_return_correct_value_for_single_parameter() throws NegativeNumberException {
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(5, stringCalculator.add("5"));
        assertEquals(199, stringCalculator.add("199"));
    }

    @Test
    void should_return_correct_value_for_two_parameters() throws NegativeNumberException {
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void should_return_correct_value_for_unknown_amount_of_parameters() throws NegativeNumberException {
        assertEquals(10, stringCalculator.add("1,2,3,4"));
        assertEquals(20, stringCalculator.add("1,5,8,1,5"));
    }

    @Test
    void can_handle_new_line_as_delimiter() throws NegativeNumberException {
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    void can_define_custom_delimiter() throws NegativeNumberException {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test
    void throws_exception_with_negative_numbers() {
        assertThrows(NegativeNumberException.class, () -> stringCalculator.add("2,-3,4"));
    }

    @Test
    void should_display_negative_number_when_exception_thrown() {
        NegativeNumberException exception = assertThrows(NegativeNumberException.class,
                () -> stringCalculator.add("2,-3,4"));

        assertEquals("negatives not allowed: [-3]", exception.getMessage());
    }

    @Test
    void should_display_all_negative_numbers_when_exception_thrown() {
        NegativeNumberException exception = assertThrows(NegativeNumberException.class,
                () -> stringCalculator.add("2,-3,-4,5,-6"));

        assertEquals("negatives not allowed: [-3, -4, -6]", exception.getMessage());
    }
}
