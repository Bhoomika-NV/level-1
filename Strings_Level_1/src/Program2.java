
public class Program2 {
	public static void main(String[] args) {
		String a="bhoomika";
		int sizea= a.length();
		String b="nellikatte";
		int sizeb=b.length();
		
		String c="jaava";
		int length= c.length();
		
		String fletter=c.substring(0,1).toUpperCase();
		String Lletter=c.substring(length-1,length).toUpperCase();
		String remaining3=c.substring(1,length-1);
		  System.out.println(fletter+remaining3+Lletter);
		  System.out.println(length);
		
		
		String firstletter1=a.substring(0,1).toUpperCase();
		String remaining1=a.substring(1,sizea-1);
		String lastLetter1=a.substring(sizea-1 ,sizea).toUpperCase();
		
		
		
		String firstletter2= b.substring(0,1).toUpperCase();
		String remaining2=b.substring(1,sizeb-1);
		String lastLetter2=b.substring(sizeb-1,sizeb).toUpperCase();
		
		String str1= firstletter1+remaining1+lastLetter1;
		String str2= firstletter2+remaining2+lastLetter2;
		
		System.out.println(str1 +" "+ str2);
		
		 
		
	}

}
