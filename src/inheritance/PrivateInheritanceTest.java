package inheritance;

public class PrivateInheritanceTest {
	
	private int j;
	int k=11;
	PrivateInheritanceTest()
	{
		this.j=10;
		System.out.println("parent constructor   access"+j+k);
	}
	
    private void  test()
    {
	System.out.println("private method access"+j+k);
    }
   }
