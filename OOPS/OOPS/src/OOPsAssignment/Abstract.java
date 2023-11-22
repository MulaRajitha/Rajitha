package OOPsAssignment;
abstract class Class1{
	void show() {
		
	}
}
class Class extends Class1{
	public void show() {
		System.out.println("show class");
	}
}
public abstract class Abstract {
	public static void main(String args[]) {
		Class ob=new Class();
				ob.show();
	}
}