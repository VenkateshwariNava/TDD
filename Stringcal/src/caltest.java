	import static org.junit.Assert.assertEquals;
import org.junit.Test;

	public class caltest {
		
	    @Test 
	    public void A() {
	    	assertEquals(0, Cal.add(""));
	    }
	   
	    @Test 
	    public void x() {
	    	assertEquals(1, Cal.add("1"));
	    }
	    @Test 
	    public void y() {
	    	assertEquals(2, Cal.add("2"));
	    }
	    
	}   