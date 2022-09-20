import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculaterTest {

    Calculater calculater;

    @Before
    public void before(){
        calculater = new Calculater();
    };

    @Test
    public void add() {
        assertEquals(3, calculater.add(2, 1));
    }

    @Test
   public void subtract() {
        assertEquals(1, calculater.subtract(2,1));
    }

    @Test
    public void multiply() {
        assertEquals(2, calculater.multiply(2,1));
    }

    @Test
   public void divide() {
        assertEquals(2,calculater.divide(2,1), 0.0);
    }
}