import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    Printer printer = new Printer();

    @Test
    public void PrinterTest() {
        assertEquals("Cześć Maciek",printer.welcome("Maciek"));
        assertEquals("CześćOksana", printer.welcome("Oksana"));
    }
}