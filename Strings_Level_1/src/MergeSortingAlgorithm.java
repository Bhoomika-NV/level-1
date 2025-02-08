import java.util.ArrayList;

public class MergeSortingAlgorithm {
public static void main(String[] args) {
	int []arr = {5,3,9,1,2,7,8,6};
	int n=arr.length;
	System.out.println("before sorting..");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	mergeSort(arr,0,n-1);
	System.out.println();
	System.out.println("Aarray after sorting ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
	public static void merge(int arr[],int low ,int mid,int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left=low;
		int right = mid+1;
		while(left<= mid && right<= high) {
			if(arr[left]<=arr[right])
			{
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
			right++;
			}
		}
		while(left <= mid) {
			 
				temp.add(arr[left]);
				left++;
			 
		} 
		while(right<= high) {
			 
				temp.add(arr[right]);
				right++;
			 
		}
		for(int i=low;i<=high;i++) {
			arr[i]=temp.get(i-low);
		}
		
	}
	public static void mergeSort(int arr[],int low,int high) {
		if(low>=high)
			return;
		int mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
}

