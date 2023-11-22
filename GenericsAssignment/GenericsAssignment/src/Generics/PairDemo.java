package Generics;

import java.util.Date;
public class PairDemo 
{
     public static void main(String[] args) {
         pair<String,String> object1 = new pair<String,String>("0","Time");
            System.out.println(object1.getObj1()+" , "+object1.getObj2());

            Date objc=new Date();
            pair<String,java.util.Date> object2 = new pair<String,java.util.Date>("Today is ",objc);
            System.out.println(object2.getObj1()+""+object2.getObj2());
        }
    }
    class pair<K,V>{
        private K obj1;
        private V obj2;
        
        public pair(K obj1,V obj2){
            this.obj1=obj1;
            this.obj2=obj2;
        }
        public K getObj1() {
            return obj1;
        }
        public V getObj2() {
            return obj2;
        }
    }

 