//reversing the string with preserving the white spaces;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		//Scanner scan= new Scanner(System.in);
		String str="Java is platform independent";
		System.out.println(str);
		char[]arr=str.toCharArray();
		char[]rev= new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				rev[i]=arr[i];
			}
		}
		int j=rev.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				if(rev[j]==' ')
				{
					j--;
				}
				rev[j]=arr[i];
				j--;
			}
		}
		str= new String(rev);
		System.out.println(str);
	}

}
