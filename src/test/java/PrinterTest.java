import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){

        printer = new Printer(100,100);

}

    @Test
   public void copySheet() {
        assertEquals(90,printer.copySheet(10,1));
    }

    @Test
    public void reduceToner() {
        printer.reduceToner(1);
        assertEquals(99, printer.getToner());
    }
}