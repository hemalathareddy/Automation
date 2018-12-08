package collecprog;
import java.util.*;
public class TreeSetProg {
//Treeset is Homogeneous and comparable
//Default sorting order
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TreeSet t= new TreeSet();
	t.add("A");
	t.add("B");
	t.add("c");
	t.add("Z");
	System.out.println("Treeset values ="+t);
	TreeSetProg obj=new TreeSetProg();
	obj.stringbuffercomparable();
	}
	
//java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
// java.lang.stringbuffer extends java.lang.abstractstringbuilder implements java.io.serilizable ,java.lang.charsequence
//Since string buffer class doesnot implement comparable interface  so getting exception
	void stringbuffercomparable()
	{
		
		TreeSet t= new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));	
		t.add(new StringBuffer("C"));
	}
		// java.lang.string extends java.lang.object implements java.io.serializable  ,java.lang.comparable,java.lang.charsequence

}
