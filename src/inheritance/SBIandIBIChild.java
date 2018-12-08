package inheritance;

public class SBIandIBIChild extends SBIandIBIParent {
	{
		System.out.println("IIB child");
	}
	static 
	{
		
		System.out.println("SIB child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIandIBIParent obj=new SBIandIBIParent();
		SBIandIBIParent obj1=new SBIandIBIParent(10);
		
		SBIandIBIChild obj2=new SBIandIBIChild();
	}

}
