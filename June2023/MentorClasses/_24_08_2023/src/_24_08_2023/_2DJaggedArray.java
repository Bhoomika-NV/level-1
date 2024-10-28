package _24_08_2023;

import java.util.Scanner;

public class _2DJaggedArray {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int [][][] arr=new int[scan.nextInt()][][];//4 and 5 lengths;
		System.out.println("enter"+arr.length+" number of elements ");
		
		for(int i =0;i<=arr.length-1;i++)
		{
			
			arr[i]=new int[scan.nextInt()][];//[];
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print("arr["+i+"]["+j+"]");
			arr[i][j]=new int [scan.nextInt()];
			}
		
		}
		System.out.println("Enter the contents");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print("arr["+i+"]["+j+"]"+"["+k+"]  =  ");
					arr[i][j][k]=scan.nextInt();
				}
		
			}
		
		}
		System.out.println("Array contents are ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
		System.out.println();
			}
		System.out.println();
		}
	}


}
