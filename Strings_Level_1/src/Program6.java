//reversing the each words in the sentence;
public class Program6 {
	public static void main(String[] args) {

	String s="java is platform independent";
	System.out.println(s);
	String []s1=s.split(" ");
	String rev="";
	for(int i=0;i<s1.length;i++)
	{
		String word=s1[i];
		char wa[]=word.toCharArray();
		char rwa[]=new char[wa.length];
		int j=rwa.length-1;
		for(int k=0;k<wa.length;k++)
		{
			rwa[j]=wa[k];
			j--;
		}
		String revword=new String(rwa);
		rev=rev+revword+" ";
	}
	System.out.println(rev);
}
}
