package lambdaExpressons;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class LowertoUpper {

	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("pravalika");
		a.add("raghu rAm");
		a.add("MAHESH babu");
		a.add("jai ChanDra");
		
		List<String> l= new ArrayList<String>();
		Consumer <String> c=x->l.add(x.toUpperCase());
		for(String s:a) {
			c.accept(s);
			
		}
		System.out.println(l);
	}
}
