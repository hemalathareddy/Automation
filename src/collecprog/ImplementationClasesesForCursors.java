package collecprog;
import java.util.*;
public class ImplementationClasesesForCursors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
        Enumeration e=v.elements();
        Iterator i=v.iterator();
        ListIterator li=v.listIterator();
        System.out.println(e.getClass().getName());
        System.out.println(i.getClass().getName());
        System.out.println(li.getClass().getName());
	}

}
