package _24_08_2023;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number of elements");
		double[] []arr=new double[scan.nextInt()][scan.nextInt()];//4 and 5 lengths;
		System.out.println("Enter the number of elements");
		
		for(int i =0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			arr[i][j]=scan.nextDouble();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}

}
