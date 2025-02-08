import java.util.Scanner;

public class Program3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any string ");
	String s=scan.nextLine();
	String str=" ";
	// in  order to capitalize the first and last letter of the string 
	//split the given string based on the blank regex
	//now create one array of char
	String []arr=s.split(" ");
	for(String i: arr)
	{
		int size=i.length();
		String fletter=i.substring(0,1).toUpperCase();
		String remaining=i.substring(1,size-1);
		String lLetter=i.substring(size-1,size).toUpperCase();
		str=str+fletter+remaining+lLetter+" ";	
	}
	System.out.println(str);
}
}
