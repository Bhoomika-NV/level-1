//Given two strings S1 and S2, The task is to find if S1 is a substring of S2.
//If yes, return the index of the first occurrence, else return -1

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String main="codewithkodnest";
		String sub="code";
		System.out.println(findingsub(main,sub));
		System.out.println(findingsub2(main,sub));
		System.out.println(findingsub3(main,sub));

		
	}
	//Approach 1
	static boolean findingsub(String main,String sub)
	{
		return main.matches(".*"+sub+".*");
	}
	//Approach 2
	static boolean findingsub2(String main , String sub)
	{
		
		return main.contains(sub);
	}
//Approach 3
	static boolean findingsub3(String main,String sub)
	{
	 return main.indexOf(sub)!= -1;
			

	}
	
}