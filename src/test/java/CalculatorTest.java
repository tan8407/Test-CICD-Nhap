import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        // Test xem 2 + 3 có bằng 5 không
        assertEquals(5, calc.add(2, 3), "Phép cộng đang bị sai!");
    }
}