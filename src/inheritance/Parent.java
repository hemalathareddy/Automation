package inheritance;

public class Parent {
	
	int j;
	
	/*Parent(int j)
	{
		this.j=j;
		System.out.println("parent paremetrized construct called");
		System.out.println("paremetrized construct value intizialized j"+j);
	}*/
	
	Parent()
	{
		System.out.println("deafult parent construct called");
		j=11;
		System.out.println("deafult parent construct value intizialized j"+j);
	}
	void parentMethod()
	{
		
		System.out.println("parent method called");
		System.out.println("print j"+j);
	}
	

}
