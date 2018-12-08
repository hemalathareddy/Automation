package collecprog;
import java.util.*;
public class ListIteratorProg {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("E");
		l.add("F");
		l.add("I");
		l.add("J");
		l.add("K");
		l.add("L");
		
		ListIterator itr=l.listIterator();
		System.out.println(l);
		while(itr.hasNext())
		{ int count=0;
			if(itr.next().equals("A"))
			{
			itr.add("B");
			System.out.println(itr.nextIndex());
			}
		    if(itr.hasNext() && itr.next().equals("E") )
			{
				System.out.println(itr.nextIndex());
			itr.remove();
			}
			 if(itr.hasNext() && itr.next().equals("F"))
			{
				System.out.println(itr.nextIndex());
			itr.add("G");
			itr.add("H");
			
			}
			
			 System.out.println(count);
		System.out.println(l);	
		}
		

	}

}
