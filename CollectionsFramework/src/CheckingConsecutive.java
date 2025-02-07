import java.util.Scanner;

public class CheckingConsecutive {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int n=s.nextInt();
	System.out.println(countConsecutive1s(n));
	System.out.println("The binary form of "+n +" is "+convertDecimalToBinary(n));
}
static int countConsecutive1s(int n) {
//	if(((n) & (n<<1)) !=0) {
//		return true;
//	}
//	else {
//		return false;
//	}
	int count =0;
	while(n>0) {
		n=n & (n<<1);
		count++;
	}
	return count;
}

public static String convertDecimalToBinary(int n) {
	String bina="";
	while(n!=0) {
	int rem=n%2;
	bina= rem+ bina;
	n=n/2;
	}
	return bina;
}
}
