package lambdaExpressons;

import java.util.ArrayList;

public class TestDemo {

	public static void main(String[] args) {
		
	ArrayList<Orders>orderlist= new ArrayList<Orders>();
	
	orderlist.add(new Orders(101, 20000,"Accepted"));
	orderlist.add(new Orders(102, 45000,"Completed"));
	orderlist.add(new Orders(103, 25000,"Accepted"));
	
	orderlist.stream().filter(p->p.price>10000 && p.status =="Accepted").forEach(pr.id->System.out.println(pr.id));
	
		
	}
  }


