package inheritance;
/***
 * Abstract class is declared with Abstract keyword
 * Abstract class can not be inherited
 * Abstract class may or may not have abstract methods
 * Abstract methods can not be declared as  static
 * we can not declare field members and constructors as static
 * we can not create an object for abstract class
 * abstract class are inherited using extends keyword
 * 
 * 
 * @author hemalatha.e
 *
 */
public  class ChildAbstarct extends AbstractEx{

	void b()
	{
		System.out.println("b method implementation");
	}
	
	void c()
	{}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstarct obj=new ChildAbstarct();
		System.out.println("b method implementation"+obj.j);
		obj.b();
	}

}
