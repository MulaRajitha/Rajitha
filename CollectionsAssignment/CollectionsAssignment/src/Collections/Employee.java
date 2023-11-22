package Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

 

public class Employee {

 

        private int id;
        private String name;
        private String Department;
        private int Salary;

 

        public Employee(int id, String name, String Department, int Salary) {

 

            this.id=id;
            this.name=name;
            this.Department=Department;
            this.Salary=Salary;
        }

 

        public int getId() {
            return id;
        }

 

        public String getname() {
            return name;
        }

 

        public String getDepartment() {
            return Department;
        }

 

        public int getSalary() {
            return Salary;
        }
    }
    class idComparator implements Comparator<Employee>{
        public int compare(Employee e1,Employee e2) {
            return e1.getId()-e2.getId();
        }
    }

    class nameComparator implements Comparator<Employee>{
        public int compare(Employee e1,Employee e2) {
            return e1.getname().compareTo(e2.getname());
        }
    }

    class depComparator implements Comparator<Employee>{
        public int compare(Employee e1,Employee e2) {
            return e1.getDepartment().compareTo(e2.getDepartment());
        }
    }


    class salComparator implements Comparator<Employee>{
        public int compare(Employee e1,Employee e2) {
            return e1.getSalary()-e2.getSalary();
        }
    }
     class EmployeeDetails{
        public static void main(String[] args) {

 

            Employee e1=(new Employee(18401,"Gracely","IT",35000));
            Employee e2=(new Employee(18489,"Akhila","MT",32000));
            Employee e3=(new Employee(18490,"Sravani","KT",29000));
            Employee e4=(new Employee(18407,"Snehitha","IT",28000));
            Employee e5=(new Employee(18402,"Mahi","HT",40000));
            Employee e6=(new Employee(18403,"Niha","IT",31000));
            Employee e7=(new Employee(18404,"Prathima","ST",20000));
            Employee e8=(new Employee(18405,"Divya","MT",27000));
            Employee e9=(new Employee(18406,"Usha","DT",26000));
            Employee e10=(new Employee(18407,"Kavya","CT",45000));

 

            Set<Employee> ts1;

 

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1. Id 2. Name, 3.Department, 4.Salary ");
            int n=sc.nextInt();
            sc.close();

 

            if(n==1) {
                ts1=new TreeSet<>(new idComparator());
            }
            else if(n==2) {
                ts1=new TreeSet<>(new nameComparator());
            }
            else if(n==3) {
                ts1=new TreeSet<>(new depComparator());
            }
            else {
                ts1=new TreeSet<>(new salComparator());
            }
            ts1.add(e1);
            ts1.add(e2);
            ts1.add(e3);
            ts1.add(e4);
            ts1.add(e5);
            ts1.add(e6);
            ts1.add(e7);
            ts1.add(e8);
            ts1.add(e9);
            ts1.add(e10);

 

            for(Employee e:ts1) {
                System.out.println(e.getId()+" "+e.getname()+" "+e.getDepartment()+" "+e.getSalary());
            }
        }
    }