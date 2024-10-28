package _24_08_2023;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=scan.nextInt();
		 int original=n;
		 
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
	     Demo2 d2 = new Demo2();
		int result=d2.sumOfDigitsRisedToTheirPower(original, count);
		if(result==original)
		{
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		
		
		 
	}
	
	}
}
