import java.util.Arrays;
import java.util.Scanner;

public class program12 {
	//java program to replace the char with its occarence number

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
			
					char ch=s1.charAt(i);
					if(ch==target)
					{
						s1=s1.replaceFirst(String.valueOf(target),String.valueOf(count) );
						
						count++;
					}
			}
			System.out.println(s1);
		}
	}