package javaassignment;
import java.util.*;

   public class Results {
       public static void main(String[] args) {

           int subone,subtwo,subthree;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter subject1 marks: ");
           subone=sc.nextInt();
           System.out.println("Enter subject2 marks: ");
           subtwo=sc.nextInt();
           System.out.println("Enter subject3 marks: ");
           subthree=sc.nextInt();

System.out.println(" subject1: "+subone);
System.out.println(" subject2: "+subtwo);
System.out.println(" subject3: "+subthree);


if((subone>60)&&(subtwo>60)&&(subthree>60)) {

System.out.println("Passed");

}

else if((subone>60&&subtwo>60)||(subtwo>60&&subthree>60)||(subone>60&&subthree>60)) {

System.out.println("Promoted");

 

}

else if((subone>60||subtwo>60||subthree>60)){

System.out.println("Failed");

}

else

{

System.out.println("Failed");

}

}

 

 

 

}

 

 