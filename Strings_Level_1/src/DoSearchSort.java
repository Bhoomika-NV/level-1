
public class DoSearchSort {
	public static  void findingName(String Lname , Student arr[])
	   {
		   for(int i=0;i<arr.length;i++) {
		   if(arr[i].name.equalsIgnoreCase(Lname))
		   		{
			 System.out.println("Name found at the index "+i);
			 return ;
		   		}
		   }
		   System.out.println("Name not found ");
		  // return false;
	   }
	
	
	static void findingLkey(int Lkey , Student arr[])
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(Lkey==arr[mid].id)
			{
				System.out.println("id Found at the index "+mid);
				return;
			}
			else if(Lkey<arr[mid].id) {
				high=mid-1;}
			else {
				low=mid+1;}
		}
		System.out.println("Id did not found");
		//return false;
		
		

	}
	static void sortingTech(Student arr[])
	{
		int min;
		int pos;
		Student help;
		for(int i=0;i<arr.length;i++)
		{
			min=arr[i].id;
			pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].id<min)
				{
					min=arr[j].id;
					pos=j;
				}
			}
			help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
			
		}
		System.out.println("Sorted array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("|"+arr[i].id+"|"+arr[i].marks+"|"+arr[i].name+"|");

		}
		
	}
	
	public static void bubbleSort(Student []arr)
	{
		Student help;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j].id>arr[j+1].id)
				{
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
		System.out.println("Sorted array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("|"+arr[i].id+"|"+arr[i].marks+"|"+arr[i].name+"|");

		}
	}
    public static void insertionSort(Student arr[])
    {
    	Student item;
    	for(int i=1;i<arr.length;i++)
    	{
    		item=arr[i];
    		int j=i-1;
    		while(j>=0 && arr[j].id > item.id)
    		{
    			arr[j+1]=arr[j];
    			j--;
    		}
    		arr[j+1]=item;
    	}
    	System.out.println("Sorted array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("|"+arr[i].id+"|"+arr[i].marks+"|"+arr[i].name+"|");

		}
    }
    


}
