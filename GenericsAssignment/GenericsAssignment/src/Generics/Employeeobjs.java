package Generics;
import java.util.HashSet;
class Employee {
        private int id;
        private String name;
        private int salary;
        private String department;

        public Employee(int id, String name,int salary,String department) {
            super();
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.department=department;
        }
        public void displayDetails() {
            System.out.println("Id:"+id+"\n"+"Name:"+name+"\n"+"Salary:"+salary+"\n"+"Department:"+department);
        }
    }
        public class Employeeobjs{
          public static void main(String[] args) {
            Employee employee1=new Employee(546,"Pravalika",50000,"Mechanic");
            Employee employee2=new Employee(567,"Raj Kumar",40000,"Analyst");
            Employee employee3=new Employee(597,"Priyanka ",60000,"Developer");
            HashSet<Employee> hashSet=new HashSet<>();
            hashSet.add(employee1);
            hashSet.add(employee2);
            hashSet.add(employee3);
            hashSet.forEach(n -> n.displayDetails());
        }
}