
public class Program4 {
	public static void main(String[] args) {
		String s="Bhoomika";
		char []arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(arr[i]!=' ') {
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=' ';
					}
				}
				System.out.println(arr[i]+"--->>"+count);
			}
		}
		
		}

	}


