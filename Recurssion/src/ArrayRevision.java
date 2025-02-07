import java.util.Scanner;

public class ArrayRevision {
public static void main(String[] args) {
	//BInary to Decimal Conversion
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the binary number");
	int bin=s.nextInt();
	
	System.out.println(binaryToDecimalConversion(bin));
	
}
public static int binaryToDecimalConversion(int bin) {
	int power=1;
	int deci=0;
	while(true) {
		if(bin==0) {
			break;
		}
		else {
			int rem = bin%10;
			 //deci+=rem*Math.pow(2,power);
			deci+=rem*power;
			 power*=2;
			 bin=bin/10;
		}
	}
	return deci;
}
}
