import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.*;
public class FileTests {
    @Test
    public void testFiles() throws IOException{
        ArrayList<File> output = new ArrayList<File>();
        output.add(new File("fileTesting/test.txt"));
        assertEquals(output, FileExample.getFiles(new File("fileTesting/")));
    }
}
