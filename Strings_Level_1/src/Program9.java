//removing the duplicates approach 2

import java.util.Scanner;
public class Program9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr="Programming";
		System.out.println(arr);
		//char []arr=s1.toCharArray();
		StringBuilder sb1= new StringBuilder();
		for(int i=0;i<arr.length();i++)
		{
			boolean repeated= false;
			for(int j=i+1;j<arr.length();j++)
			{
				if(arr.charAt(i)==arr.charAt(j))
				{
					repeated=true;
					break;
				}
			}
			if(repeated!=true)
			{
				sb1.append(arr.charAt(i));
			}
		}
		System.out.println(sb1);
	}

}
