//Finding first non repeated character;
import java.util.Scanner;

public class Programe10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str="gpprogramming";
		char []arr=str.toCharArray();
		boolean repeate= true;
		for(char i:arr)
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.println("The first non repeating char is "+i);
				repeate=false;
				return;
			}
		}
		if(true)
			System.out.println("There is no  non repeating char");
				
	}
}