package inheritance;

public class Child  extends Parent{

	Child() {
		super();
		System.out.println("suoer member"+super.j);
		super.parentMethod();
		// TODO Auto-generated constructor stub
	}
	int j;
	
	void test()
	{
		
		System.out.println("child method");
		j=10;
		System.out.println("child method j value" +super.j);
	}
	
	public static void main(String args[])
	{
		
		Child obj=new Child();
		obj.test();
		System.out.println("child memeber j value" +obj.j);
		obj.parentMethod();
		
		Parent obj1=new Child();
		obj1.parentMethod();
		System.out.println("parent  member j value" +obj1.j);
	
	}

}
