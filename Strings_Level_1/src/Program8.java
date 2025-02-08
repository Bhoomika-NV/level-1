//removing the duplicates in the word
import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1="codewithkodnest";
		System.out.println(s1);
		String s2="";
	//	StringBuilder sb1= new StringBuilder();
	A:for(int i=0;i<s1.length()-1;i++)
	{
		
		B:for(int j=0;j<s2.length()-1;j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
			continue A;
			}
		
		}
		 s2=s2+s1.charAt(i);
	}
	System.out.println(s2);
	}
}
