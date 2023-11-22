package Generics;
import java.util.ArrayList;
class Exchange<E>{
   ArrayList<E> arr = new ArrayList<>();
     public void swap(E a, E b) {
       arr.add(b);
       arr.add(a);
   }
}
       public class Elements {
            public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(0);
       arr.add(1);
       arr.add(2);
       arr.add(3);
      arr.add(4);
       arr.add(5);



       Exchange<Integer> e=new Exchange<>();
       for(int i=1;i<arr.size();i+=2) {
           e.swap(arr.get(i-1), arr.get(i));
       }
       for(Integer a:e.arr) {
           System.out.println(a);
       }
   }
}