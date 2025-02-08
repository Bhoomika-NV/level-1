import java.util.Scanner;

public class PrimeNumberUsingRecursion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int isPrime=findPrime(num,num/2);
	if(isPrime==1)
		System.out.println("It is prime");
	else
		System.out.println("Not a prime");
}

private static int findPrime(int num, int i) {
	if(num<=1)
		return 0;
	if(num%i==0)
		return 0;
	if(i==1)
		return 1;
	return findPrime(num,i-1);
}
}
