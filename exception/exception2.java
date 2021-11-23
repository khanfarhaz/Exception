package exception;

public class exception2 {  
	   public static void main(String args[]) throws IOException
	   {
	    FileInputStream fis = null;
	            fis = new FileInputStream("C:/myfile.txt"); 
	    int k; 
	 
	    //read contents of the file
	     while(( k = fis.read() ) != -1) 
	    { 
	        System.out.print((char)k); 
	    } 
	    //close the file
	    fis.close();    
	   }
	}


