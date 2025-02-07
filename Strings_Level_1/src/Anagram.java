//tow string having same charachters and same number of characters also;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two strings");
		String a=sc.nextLine();
		String b= sc.nextLine();
		if(a.length()==b.length())
		{
			char[]arr1=a.toLowerCase().toCharArray();
			char[]arr2=b.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<=arr1.length-1;i++)
			{
			if(arr1[i]==arr2[i])
			{
				System.out.println("The string are anagrams");
				return;
			}
			else
				System.out.println("The strings are not anagrams");
			}
			
		}
		else
			System.out.println("The string are not anagrams");
	}
	

}
