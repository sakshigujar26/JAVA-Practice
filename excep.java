class Sample{
	static void demo(){
	try{
	System.out.println("inside demo");
	throw new NullPointerException("Exception data");
	}
	catch(NullPointerException e){
	System.out.println(e);
	}}
	
	}
	class ThrowDemo{
	public static void main(String args[]){
	Sample.demo();
	}
	}
