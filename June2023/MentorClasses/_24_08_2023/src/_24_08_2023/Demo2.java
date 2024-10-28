package _24_08_2023;

public class Demo2 {
	
		public int sumOfDigitsRisedToTheirPower(int n,int count)
		{
			int sum=0;
			while(n!=0)
			{
			int rem=n%10;
			int res=(int)Math.pow(rem, count);
			sum=res+sum;
			n=n/10;
			}
			System.out.println(sum);
			return sum;
		}
	}



