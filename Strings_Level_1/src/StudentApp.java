import java.util.Scanner;

public class StudentApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length ");
	Student []arr=new Student[scan.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		
		System.out.print("Enter the id ==>> ");
		int id=scan.nextInt();
		System.out.print("Enter the marks ==>> ");
		int marks=scan.nextInt();
		System.out.print("Enter the name  ==>> ");
		String name= scan.next();
		System.out.println();
		arr[i]=new Student(id ,marks , name);
		
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(" "+arr[i].id+"|"+arr[i].marks+"|"+arr[i].name+"|");
	}
	
	
	System.out.println("Enter the name to be searched ");
	String Lname=scan.next();
	
	DoSearchSort.findingName(Lname , arr);
	System.out.println("want sorting-->> 'true' or 'fasle' ");
	
	boolean answer=scan.nextBoolean();
	if(answer==true )
	{   
		System.out.println("Enter the Choices    1.Bubble Sorting ");
		System.out.println("                     2.selection Sorting");
		System.out.println("                     2.Insertion Sorting");
		int choice = scan.nextInt();
		switch(choice)
		{
		case 1:DoSearchSort.bubbleSort(arr);
		         break;
		case 2:DoSearchSort.sortingTech(arr);
					break;
		case 3:DoSearchSort.insertionSort(arr);
				   break;
		}
		
	System.out.println("Enter the id to be searched");
	int Lkey=scan.nextInt();
	DoSearchSort.findingLkey(Lkey ,arr);
	
			}
}

}
