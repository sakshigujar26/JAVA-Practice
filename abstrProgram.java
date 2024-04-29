abstract class MyClass{
	abstract void calculate(double x);
}
class Sub1 extends MyClass{
	void calculate(double x){
		System.out.println("Square= "+(x*x));
		}
		}
		
	class Sub2 extends MyClass{
		void calculate(double x){
		System.out.println("square root = "+ Math.sqrt(x));
		}
		}
	class Sub3 extends MyClass{
		void calculate(double x){
		System.out.println("cube = " +(x*x*x));
		}
	}
	class different {
	public static void main(String args[]){
		Sub1 obj1 = new Sub1();
		Sub2 obj2 = new Sub2();
		Sub3 obj3 = new Sub3();
	        obj1.calculate(5.0);
	        obj2.calculate(9.0);
	        obj3.calculate(3.0);
	       }
	       }





	
