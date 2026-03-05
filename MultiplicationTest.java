import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    @Test
    public void testMultiply() {
        Multiplication calculator = new Multiplication();
        assertEquals(20, calculator.multiply(4, 5), "4 * 5 should be 20");
    }
}