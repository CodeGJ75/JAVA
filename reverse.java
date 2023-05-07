// prints the reverse of a string inputted by user

import java.util.*;
public class reverse{
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a word:");
		String s=ob.nextLine();
		rever(s);
	}

	public static void rever(String str){
		String n="";
		for(int i=0;i<str.length();i++) {
			n=str.charAt(i)+n;
		}
		System.out.println(n);
	}
}
