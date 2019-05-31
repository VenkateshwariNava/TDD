
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;



public  class FizzBizztest {


   private final FizzBizz fizzbizz = new FizzBizz();
 
   @Test
   public void returnsNumber() throws Exception {
	   assertEquals("Fizz", fizzbizz.say(3));
	   assertEquals("Buzz", fizzbizz.say(5));
	   assertEquals("Fizz Buzz", fizzbizz.say(15));
   }
 
   
}