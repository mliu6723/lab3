
import static org.junit.Assert.*;
import org.junit.*;
public class LinkedListTests {
    @Test
    public void testAppendPrepend(){
        LinkedList ex = new LinkedList();
        ex.append(9);
        ex.append(8);
        ex.append(6);
        assertEquals("9 8 6 ", ex.toString());
    }

    @Test
    public void testLength(){
        LinkedList ex = new LinkedList();
        ex.append(9);
        ex.append(8);
        assertEquals(2, ex.length());
    }
    
}
