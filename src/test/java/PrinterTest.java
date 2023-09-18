import com.codebase.Printer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer(500,350);
    }
    @Test
    public void hasSheets(){
        assertEquals(500,printer.getSheetsAvailable());
    }
    @Test
    public void hasToner(){
        assertEquals(350, printer.getTonerAvailable());
    }
    @Test
    public void canPrint(){
        printer.print(50,2);
        assertEquals(400, printer.getSheetsAvailable());
    }
    @Test
    public void reducesToner(){
        printer.print(50,2);
        assertEquals(250, printer.getTonerAvailable());
    }

}
