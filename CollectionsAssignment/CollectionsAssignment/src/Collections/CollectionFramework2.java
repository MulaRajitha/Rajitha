package Collections;
import java.util.*;
public class CollectionFramework2 {
	public static void main(String[] args) {
		HashSet <String> vehcile=new HashSet<String>();
		vehcile.add("car");
		vehcile.add("bus");
		vehcile.add("plane");
		vehcile.add("lorry");
		vehcile.add("bike");
		vehcile.add("scooty");
		vehcile.add("car");
		vehcile.add("scooty");
		vehcile.add("auto");
		Iterator<String> it=vehcile.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
