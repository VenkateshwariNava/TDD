

public class FizzBizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    int i; 
		    for (i=1; i<=100; i++) 
		    { 
		        
		        if (i%15 == 0)         
		           System.out.println("FizzBuzz\t");     
		          
		      
		        else if ((i%3) == 0)     
		        	 System.out.println("Fizz\t");                  
		          
		      
		        else if ((i%5) == 0)                        
		        	 System.out.println("Buzz\t");                  
		      
		        else             
		        	 System.out.println(i);                  
		  
		    } 
		  
		   
	}

}
