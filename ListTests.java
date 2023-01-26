import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests{
	@Test 
	public void testFilter() {
        ArrayList<String> input = new ArrayList<String>();
        ArrayList<String> output = new ArrayList<String>();
        
        input.add("HI");
        input.add("hello");
        input.add("HaLLO");
        input.add("apple");
        input.add("amazing");
        output.add("HaLLO");
        output.add("apple");
        output.add("amazing");
        StringChecker sc = new StringChecker(){
            public boolean checkString(String s){
                if(s.contains("a")){
                    return true;
                }
                return false;
            }
        };
        assertEquals(output, ListExamples.filter(input, sc));
	}
    @Test
    public void testMerge(){
        ArrayList<String> input = new ArrayList<String>();
        ArrayList<String> input2 = new ArrayList<String>();
        ArrayList<String> output = new ArrayList<String>();
        input.add("amazing");
        input.add("bool");
        input2.add("green");
        input2.add("yellow");
        output.add("amazing");
        output.add("bool");
        output.add("green");
        output.add("yellow");
        assertEquals(output, ListExamples.merge(input,input2));
    }
}
