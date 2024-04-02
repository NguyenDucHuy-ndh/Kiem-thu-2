import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testCountDigitsWithZero() {
        assertEquals(1, Main.countDigits(0));
    }

    @Test
    public void testCountDigitsWithPositive() {
        assertEquals(1, Main.countDigits(5));
        assertEquals(2, Main.countDigits(23));
    }

    @Test
    public void testCountDigitsWithNegative() {
        assertEquals(1, Main.countDigits(-7));
        assertEquals(2, Main.countDigits(-65));
        assertEquals(3, Main.countDigits(-152));
    }

}