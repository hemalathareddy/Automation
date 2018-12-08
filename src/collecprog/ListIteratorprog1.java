package collecprog;
import java.util.*;
public class ListIteratorprog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("Apple");
		l.add("Samsung");
		l.add("LG");
		l.add("Sansui");
		l.add("MI");
		l.add("Samsung");
		l.add("Apple");
		l.add("Samsung");
		
		System.out.println(l);

		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s= (String)itr.next();
			if(s.equals("Samsung"))
				itr.set("LG");
			else if(s.equals("MI"))
				itr.remove();
			else if(s.equals("Sansui"))
				itr.add("Nokia");
			else if(s.equals(null))
				itr.add("oppa");
		}
System.out.println(l);
	}

}
