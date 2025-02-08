import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		String originalString="GeeksGeeks";//this is immutable string;
		String stringToBeInserted ="For";
		int index=6;
		System.out.println("originalString :"+ originalString);
		System.out.println("String to be inserted :"+stringToBeInserted);
		System.out.println("String to be inserted at index :"+index);
		Program1logic pg1= new Program1logic();
		String modified=pg1.insertString(originalString, stringToBeInserted, index);
		System.out.println("Modified String is "+ modified);
	}

}
