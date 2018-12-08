package collecprog;
import java.io.Serializable;
import java.util.*;

public class arraylistprog {
	
	public static void main(String[] args)
	{
		arraylistprog obj=new arraylistprog();
		ArrayList l= new ArrayList();
		l.add("A");
		l.add(10);
		l.add(null);
		l.add(true);
		l.add("A");
		System.out.println(l);
		l.remove(4);
		l.add("B");
		LinkedList m=new LinkedList();
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(m instanceof RandomAccess);
		obj.ArrayAsList();
		obj.ArrayListInnerInitilization();
		obj.ncopies();
		obj.arrayListSize();
}
	
	// Initilization using Arrays.aslist
	//ArrayList<Type> obj = new ArrayList<Type>(
   // Arrays.asList(Object o1, Object o2, Object o3, ....so on));
void arrayListSize()
{
	ArrayList l= new ArrayList(20);
	boolean value2=l.add(1);
    l.add(2);
    l.add(3);
    Object value=l.set(1, "element");
    Object value1=l.get(0);
    l.add(4);
    Object value4=l.remove(3);
    Object value3=l.getClass();
    int value5=l.indexOf(1);
    l.add(4);
    l.add(4);
    l.add(4);
    int value6=l.lastIndexOf(4);
    ArrayList<String> al=new ArrayList(Arrays.asList("Apple","Orange","Banana"));
    ArrayList<String> a=new ArrayList<String>(){{add("num");}};
    ArrayList<String> newa=new ArrayList<>();
    l.addAll(al);
     boolean value7=   l.addAll(1,al);
	System.out.println("array size="+l.size());
	System.out.println("array elements="+l);
	System.out.println("previous array elements="+value);
	System.out.println(" array elements="+value1);
	System.out.println(" array elements="+value2);
	System.out.println(" array elements="+value3);
	System.out.println(" array elements="+value4);
	System.out.println(" array elements="+value5);
	System.out.println(" array elements="+value6);
	System.out.println(" array elements="+value7);
	System.out.println(" array elements="+l.contains("Apple"));
	System.out.println(" array elements="+l.isEmpty());
	for(int i=0;i<l.size();i++)
	{
		System.out.println(" array elements="+l.get(i));
	}
  for(Object item : l)
  {
	  System.out.println(" array elements="+item);
	  
  }
  System.out.println(" array elements="+l.isEmpty());
}


//Initilization using Arrays.aslist
	//ArrayList<Type> obj = new ArrayList<Type>(
// Arrays.asList(Object o1, Object o2, Object o3, ....so on));


  void ArrayAsList()
  { 
	  ArrayList<String> al=new ArrayList(Arrays.asList("Apple","Orange","Banana"));
	  System.out.println("Arrays items="+al);
	  
  }
  
 // Anonymous inner class method to initialize ArrayList
  //ArrayList<T> obj = new ArrayList<T>(){{
 // add(Object o1);
 // add(Object o2);
//  }};


  void ArrayListInnerInitilization()
  {
	  ArrayList<String> obj=new ArrayList<String>(){{
		  add("AP");
		  add("TN");
		  add("TG");
		  add("KN");
		  
		  
	  }};
	  System.out.println("List Items="+obj);
	  
  }
  
  //collection.ncopies
  void ncopies()
  {
	  
	   ArrayList obj=new ArrayList(Collections.nCopies(10, 5));
	   System.out.println("ncopies values="+obj);
	   ArrayList newobj=new ArrayList(Collections.nCopies(5,"Apple"));
	   System.out.println("ncopies values="+newobj);
  }
  
  
  
 }