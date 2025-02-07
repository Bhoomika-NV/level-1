
public class MaxOfEachRow {
public static void main(String[] args) {
	int [][]arr = {{2,3,4},{5,6,7},{9,8,7,4},{8,9,43,2}};
	System.out.println("Lets get the row count :");
	int rowCount=0;
	for(int i =0;i< arr.length;i++) {
		for(int j=0;j<arr[i].length;j++)
		{
		}
		rowCount++;
	}
	System.out.println(rowCount +" is the number of rows");
	findMaxElement(rowCount , arr);
}

private static void findMaxElement(int rowCount, int[][] arr) {
	int i =0;
	int max = 0;
	int result[]= new int[rowCount];
	while(i<rowCount) {
		for(int j=0;j<arr[i].length;j++)
		{
//			if(arr[i][j]>max) {
//				max= arr[i][j];
//			}
			max=Math.max(arr[i][j], max);
		}
		result[i]=max;
		max=0;
		i++;
	}
	printArray(result);
	
}

private static void printArray(int[] result) {
	System.out.println("Below is the list of largest numbr of each row");
	for(int i=0;i<=result.length-1;i++)
	{
		System.out.print(result[i]+" , ");
	}
	
}
}
