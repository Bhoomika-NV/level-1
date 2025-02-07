//Program to the sort the characters of the
//array in alphabetical order

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		String s1=scan.nextLine();
		char []arr=s1.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(new String(arr));
		
	}

}
