package array.list.test;
import java.util.*;

public class Test_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Rose");
		al.add("Lily");
		al.add("Jasmine");
		al.add("Marigold");
		for(Object s: al) {
			System.out.println(s);
		}
		al.remove(2);
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob +" ");
		}
		
	}

}
