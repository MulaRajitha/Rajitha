package lambdaExpressons;
import java.util.*;
import java.util.function.*;

public class String1stLetter{

    public static void main(String[] args) {
         List<String> l = new ArrayList<>();
            l.add("Pravalika");
            l.add("Sravya");
            l.add("Nagma");
            l.add("Awez");
            l.add("Raj");
            l.add("Kiran");

           
        // TODO Auto-generated method stub
        StringBuilder s = new StringBuilder();
        
        Consumer<String> c= a->s.append(a.charAt(0));        
        for(String s1 : l) {
        	
        	c.accept(s1);
        }
        System.out.print("The first letter of each String: "+s);
;
    }

 

}