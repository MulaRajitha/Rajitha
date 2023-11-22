package OOPsAssignment;

 class Employee{
	public void salary(int a, int b) {
		System.out.println("SALARY");
	}
}
 class Manager extends Employee{
	 public void salary(int sal, int inc)
	 {
		 System.out.println("Manager Salary: "+(sal+inc));
	 }
 }
 class Labour extends Employee{
	 public void salary(int s, int i) {
		 System.out.println("Labour Salary:"+(s+i));
	 }
 }
 public class Organization{
	 public static void main(String[] args)
	 {
		 Employee emp1=new Manager();
		 emp1.salary(50000,1500);
		 Employee emp2=new Labour();
		 emp2.salary(3000,200);	 
	 }
 }
