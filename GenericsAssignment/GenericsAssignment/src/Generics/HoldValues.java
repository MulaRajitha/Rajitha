package Generics;
import java.util.HashMap;
public class HoldValues {
    public static void main(String[] args) {
            HashMap<Integer,Double> hm=new HashMap<>();
            hm.put(457, 2.54);
            hm.put(578, 8.46);
            hm.put(556, 63.43);
            hm.put(658, 25.82);
            hm.put(123, 50.34);
            hm.put(890, 7.28);
            hm.put(643, 78.8);
            hm.put(578, 45.28);
            hm.put(234, 92.8);
            hm.put(689, 49.80);

 

            hm.forEach((K,V) -> System.out.println(K +" "+V));
        }
}
