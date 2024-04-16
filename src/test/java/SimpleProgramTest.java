import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.SimpleProgram;
public class SimpleProgramTest {

    @Test
    public void testSumOfEvenNumbers_WithZero() {
        assertEquals(0, SimpleProgram.sumOfEvenNumbers(0));
    }

    @Test
    public void testSumOfEvenNumbers_WithPositiveNumber() {
        assertEquals(12, SimpleProgram.sumOfEvenNumbers(6)); // 2 + 4 + 6 = 12
    }

    @Test
    public void testSumOfEvenNumbers_WithNegativeNumber() {
        assertEquals(0, SimpleProgram.sumOfEvenNumbers(-5)); // No even numbers
    }

    @Test
    public void testSumOfEvenNumbers_WithLargeNumber() {
        assertEquals(62750, SimpleProgram.sumOfEvenNumbers(500)); // Sum of even numbers from 0 to 500
    }
}
