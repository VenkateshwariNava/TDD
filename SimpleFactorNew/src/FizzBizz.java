public class FizzBizz {

	   public String say(int number) {
	       if (number % 15 == 0) {
	         
	           return "Fizz Buzz";
	       }
	       else if (number % 5 == 0){
	           
	           return "Buzz";
	       }
	       else if (number % 3 == 0) {
	           
	           return "Fizz";
	       }
	       
	       return String.valueOf(number);
	   }
	}

