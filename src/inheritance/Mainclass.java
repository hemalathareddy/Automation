package inheritance;

public class Mainclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=new AbstractEx1()
				{
			@Override
			int add(int a ,int b)
			{
				
				return a+b;
			}
				}.add(10,20);
				
System.out.print(result);
	}
	}


