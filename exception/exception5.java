package exception;

public class exception5 {  
		   void checkAge(int age){  
			if(age<18)  
			   throw new ArithmeticException("Not Eligible for voting");  
			else  
			   System.out.println("Eligible for voting");  
		   }  
		   public static void main(String args[]){  
			   exception5 obj = new exception5();
			obj.checkAge(13);  
			System.out.println("End Of Program");  
		   }  
		}
		