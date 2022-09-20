import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }
    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takeDrink() {
        assertEquals(90,waterBottle.takeDrink());
    }

    @Test
    public void drinkAll() {
        assertEquals(0, waterBottle.drinkAll());
    }

    @Test
    public void fillBottle() {
        assertEquals(100,waterBottle.fillBottle());
    }


}
