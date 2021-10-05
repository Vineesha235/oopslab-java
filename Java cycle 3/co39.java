// Java program to demonstrate equals()
// method of HashSet

import java.util.*;

public class GFG {
	public static void main(String[] argv)
	{

		
		HashSet<String>
			arrset1 = new HashSet<String>();

		
		arrset1.add("A");
		arrset1.add("B");
		arrset1.add("C");
		arrset1.add("D");
		arrset1.add("E");

		
		System.out.println("First HashSet: "
						+ arrset1);

		
		HashSet<String>
			arrset2 = new HashSet<String>();

		
		arrset2.add("A");
		arrset2.add("B");
		arrset2.add("C");
		arrset2.add("D");
		arrset2.add("E");

		
		System.out.println("Second HashSet: "
						+ arrset2);

		
		boolean value
			= arrset1.equals(arrset2);

		
		System.out.println("Are both set equal: "
						+ value);
	}
}
