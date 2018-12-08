package collecprog;

public class Comparablenotes {
	
	//Java.lang
	//only one method compareto()
	//return type is int
		//obj1.compareto(obj2)
		//if obj1>obj2 -ve
		//if obj1<obj2 +ve
		//if obj1==obj2 0
		//if obj1.compareto(null)
	//comparable is for natural sorting order
	//comparator is used for customized sorting order


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A".compareTo("B"));
		System.out.println("B".compareTo("A"));
		System.out.println("A".compareTo("A"));
		//Exception in thread "main" java.lang.NullPointerException
//which element we are trying to add will be obj1 and already inserted will be obj2
		System.out.println("A".compareTo(null));

	}
	
}
