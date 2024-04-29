/*class demo{
	public static void main (String ...args){
		try {
		System.out.println(args[0]);
		
		}
		catch(Exception e){
		System.out.println("exception at line no.4");
		System.out.println(e);
		//System.out.println(e.String);
		System.out.println(e.getClass() );
		System.out.println(e.toString());
	//	System.out.println(e.notify());
		System.out.println(e.getCause());
		System.out.println(e.getLocalizedMessage());
	  System.out.println(e.getMessage());
	  System.out.println(e.hashCode());
	  System.out.println(e.getStackTrace());
	  System.out.println(e. getSuppressed() );
		}
		}
		}
		



class demo{ 
	public static void main (String[] args) { 
	int a=5; 
	int b=0; 
		try{ 
		System.out.println(a/b); 
		} 
	catch(Exception e){ 
		System.out.println("error occured at line 4"); 
	} 
	} 
} 

//program to print the exception information using toString() method 



class demo { 
	public static void main (String[] args) { 
	int a=5; 
	int b=0; 
		try{ 
		System.out.println(a/b); 
		} 
	catch(ArithmeticException e){ 
		System.out.println(e.toString()); 
	} 
	} 
} 



// Java Program to Demonstrate Exception is Thrown 
// How the runTime System Searches Call-Stack 
// to Find Appropriate Exception Handler 

// Class 
// ExceptionThrown 
class GFG { 

	// Method 1 
	// It throws the Exception(ArithmeticException). 
	// Appropriate Exception handler is not found 
	// within this method. 
	static int divideByZero(int a, int b) 
	{ 

		// this statement will cause ArithmeticException 
		// (/by zero) 
		int i = a / b; 

		return i; 
	} 

	// The runTime System searches the appropriate 
	// Exception handler in method also but couldn't have 
	// found. So looking forward on the call stack 
	static int computeDivision(int a, int b) 
	{ 

		int res = 0; 

		// Try block to check for exceptions 
		try { 

			res = divideByZero(a, b); 
		} 

		// Catch block to handle NumberFormatException 
		// exception Doesn't matches with 
		// ArithmeticException 
		catch (NumberFormatException ex) { 
			// Display message when exception occurs 
			System.out.println( 
				"NumberFormatException is occurred"); 
		} 
		return res; 
	} 

	// Method 2 
	// Found appropriate Exception handler. 
	// i.e. matching catch block. 
	public static void main(String args[]) 
	{ 

		int a = 1; 
		int b = 0; 

		// Try block to check for exceptions 
		try { 
			int i = computeDivision(a, b); 
		} 

		// Catch block to handle ArithmeticException 
		// exceptions 
		catch (ArithmeticException ex) { 

			// getMessage() will print description 
			// of exception(here / by zero) 
			System.out.println(ex.getMessage()); 
		} 
	} 
}
public static double squareRoot(double num1) {
    if (num1 < 0) {
        throw new IllegalArgumentException
        
        ("Cannot calculate square root of a negative number.");
    }
    for (double i = 0; i < num1; i++) {
        if (i * i == num1) {
            return i;
        }
    }
    throw new IllegalArgumentException("No exact square root found.");
}




class Calci {
    public static double Add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double Sub(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double Multiplication(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double Division(double num1, double num2) {
        try {
            if (num2 != 0) {
                double result = num1 / num2;
                return result;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return -1;
        }
    }

    public static double modulo(double num1, double num2) {
        try {
            if (num2 != 0) {
                double result = num1 % num2;
                return result;
            } else {
                throw new ArithmeticException("Modulo by zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return -1;
        }
    }

    // Other methods omitted for brevity

    public static void main(String args[]) {
        try {
            System.out.println(Add(2, 4));
            System.out.println(Sub(8, 4));
            System.out.println(Multiplication(4, 5));
            System.out.println(Division(8, 0d));
            System.out.println(modulo(8, 4));
            // Other method calls here
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


 
class Example{
  public static void main(String ...args){
  try{
    Thread.sleep(1000);
    System.out.println(args[0]);
    Thread.sleep(1000);
    }
  catch(Exception e){
  System.out.println("exception");
  }
  }
  }
  
  
  class Ex {
    public static void main(String args[]){
      System.out.println("open files");
      int n =0;
       System.out.println("n="+n);
       int a = 45/n;
       System.out.println("a="+a);
        System.out.println("close files");
        }
 }
  */
  
  class Ex {
    public static void main(String args[]){
    try{
    System.out.println("open files");
      int n =args.length;
       System.out.println("n="+n);
       int a = 45/n;
       System.out.println("a="+a);
      int b[]= {1,2,3};
      b[52]=90;
 }
 
  catch(ArrayIndexOutOfBoundsException| ArithmeticException e){
    System.out.println(e);
  }
  finally{
      System.out.println("close files");
  }
  }
  }
  
  

