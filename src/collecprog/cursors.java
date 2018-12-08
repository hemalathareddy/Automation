package collecprog;
import java.util.*;

public class cursors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a=new ArrayList();
		for(int i=0;i<10;i++)
		{
			a.add(i);
						
		}
		System.out.println(a);
// Iterating using ITERATOR		
		Iterator cur=a.iterator();
		while(cur.hasNext())
		{
			Integer itr=(Integer)cur.next();
			if(itr%2==0)
				System.out.println(itr);
			else 
				cur.remove();
		}
		System.out.println("Iterating using ITERATOR"+a);
		
	
//Iterating through Enumeration	
	Enumeration e=Collections.enumeration(a);
	while(e.hasMoreElements())
	{
		System.out.println("Iterating through Enumeration"+e.nextElement());
	}
	
	ListIterator obj= a.listIterator();
	while(obj.hasNext())	 
	{
		
		System.out.println("Iterating through ListIterator"+obj.next());
		
	}
	
	//Advanced FORLOOP
	
	for(Object num : a)
	{
		System.out.println("Advanced FORLOOP"+num);
	}
	
	//Using While loop using array.get and array.size
	int count=0;
	while(a.size() > count)
	{
		
		System.out.println("using LOOP"+a.get(count));	
		count++;
	}
	
	}
}
