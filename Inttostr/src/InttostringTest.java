import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public  class InttostringTest {


    @Test
    public void Enteringstringshouldreturn0() {
    	Inttostring tester = new Inttostring(); // Class is tested

        // assert statements
        assertEquals("1234", "1234",tester.say(1234));
        assertEquals("67", "67", tester.say(67));


        
    }
}