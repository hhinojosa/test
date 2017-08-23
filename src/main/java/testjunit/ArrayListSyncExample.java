package testjunit;


import java.util.ArrayList;

public class ArrayListSyncExample {
	
	public static void main(String args[]) {
		ArrayList<String> al1=new ArrayList<String>();
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1+s2);
		s1 = "C#";
		System.out.println(s1+s2);
			
	}
}
