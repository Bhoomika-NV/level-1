import java.util.Scanner;

public class FirstFiveNaturalNUmbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n ");
	int n = sc.nextInt();
	printNumbers(n);
	float l= 456678988F;
	System.out.println(l);
 }
public static int printNumbers(int n) {
	if(n==0) {
		return 0;
	}
	System.out.println(n);
	return printNumbers(n-1);
}

}
