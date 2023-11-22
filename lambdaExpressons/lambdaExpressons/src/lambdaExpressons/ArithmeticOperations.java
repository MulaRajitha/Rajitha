package lambdaExpressons;
@FunctionalInterface
interface Arithmetic{
	int operation(int a, int b);
}
public class ArithmeticOperations {

	public static void main(String[] args) {
		
		Arithmetic add= (int a, int b)->(a+b);
				System.out.println("Addition of a and b: "+add.operation(150, 200));
				
		Arithmetic sub =(int a, int b)->(a-b);
		        System.out.println("Substraction of a and b: "+sub.operation(350, 200));
		
		Arithmetic mul =(int a, int b)->(a*b);
		        System.out.println("Multiplication of a and b: "+mul.operation(25, 10));
		
	    Arithmetic div =(int a, int b)->(a/b);
		        System.out.println("Division of a and b: "+div.operation(100, 25));
		
		}
	}


