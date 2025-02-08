
public class LinearSearch 
{  
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
}

