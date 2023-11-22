package lambdaExpressons;
import java.util.*;
interface RemoveOdds {
	public int removeOdds(String str);

}

public class RemoveDup{
	public ArrayList<String> removeOddLen(ArrayList<String>empList){
		ArrayList<String> li=new ArrayList<String>();
		
		Predicate <String> emp=(p)->{
			if(Math.floorMod(p.length(),2)==0)
				return true;
			else
				return false;
		};
		
		empList.stream().filter(emp).forEach(p->li.add(p));
		return li;
	}
	public static void main(String[] args) {
		ArrayList<String>empList=new ArrayList<String>();
		empList.add("Pravalika");
		empList.add("Pammi");
		empList.add("Ram");
		empList.add("Ankitha");
		empList.add("Sowmya");
		
		RemoveDup r=new RemoveDup();
		System.out.println(remove.removeOddLen(empList));
	}
}