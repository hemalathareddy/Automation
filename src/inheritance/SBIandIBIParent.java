package inheritance;

public class SBIandIBIParent {

	static {
		
		System.out.println("SBI parent");
	}
	{
		
		System.out.println("IBI parent");
	}
	SBIandIBIParent()
	{
		
		System.out.println("constructor parent");
	}
	
	SBIandIBIParent(int j)
	{
		
		System.out.println("parametrized constructor parent"+j);
	}

}
