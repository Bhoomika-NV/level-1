//java program to replace the char with its occarence number

import java.util.Arrays;
import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1="opentextbook";
		System.out.println("Enter the target character ");
		char target=scan.next().charAt(0);
		if(s1.indexOf(target)==-1)
		{
			System.out.println("The charcter is not present in the string");
			System.exit(0);
		}
		char[]arr=s1.toCharArray();
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
		
			if(arr[i]==target)
			{
				//count++;
				arr[i]=String.valueOf(count).charAt(0);
				count++;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}