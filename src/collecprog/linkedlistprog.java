package collecprog;
import java.util.*;

public class linkedlistprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l= new LinkedList();
		l.add(1);
		l.add(2);
		l.add("AA");
		l.addFirst(0);
		l.add(3,3);
		l.addLast("B");
		System.out.println(l);

		l.set(4, "4");
		l.removeLast();
		System.out.println(l);
		LinkedList l1=new LinkedList();
		ArrayList a1=new ArrayList(20);
		System.out.println(l.size());
		Vector<Integer> v=new Vector(20);
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(v.capacity());
		for(int i:v)
		{
			System.out.println(i);		}
	}

}
