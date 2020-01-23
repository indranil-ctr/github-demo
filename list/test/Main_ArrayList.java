package array.list.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class Main_ArrayList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an arraylist
		ArrayList<String> arraylist = new ArrayList<String>();

		// Adding elements
		arraylist.add("Rose");
		arraylist.add("Lilly");
		arraylist.add("Jasmine");
		arraylist.add("Rose");

		
		System.out.println();
		
		System.out.println(" Iterator");
		// Display elements
		Iterator iterator = arraylist.iterator();

		// Display elements
		while (iterator.hasNext()) {
			String element = iterator.next().toString();
			System.out.print(element + " ");
			
		}
		System.out.println();
		
		System.out.println("List Iterator");
		ListIterator<String> listiterator = arraylist.listIterator();

		while (listiterator.hasNext()) {
			String element = listiterator.next();
			
			if(listiterator.hasPrevious())
			{
				System.out.println("I have previous element");
				System.out.println(listiterator.previous());
				break;
			}
			
			System.out.print( element + " ");
		}


		System.out.println();
		System.out.println("For each loop");
		for(String element: arraylist)
		{
			System.out.print(element +" ");
		}

		System.out.println();
		System.out.println("Using Enumeration");
		Enumeration  enumeration = Collections.enumeration(arraylist);

		while (enumeration.hasMoreElements()) {
			String element = enumeration.nextElement().toString();
			System.out.print(element + " ");
		}

		
	}

}
