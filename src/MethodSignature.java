
public class MethodSignature {

	
	void m1()
	{System.out.println("Defaiult signature");}
	void m1(int i)
	{System.out.println("m1 int signature"+i);}
	void m2(String s)
	{System.out.println("m2 string signature");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSignature m=new MethodSignature();
		m.m1();
		m.m1(1);
		m.m2("");
		//m.m1(20.5);
		m.m1('a');
	}

}
