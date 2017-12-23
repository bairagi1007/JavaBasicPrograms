// Def: An Armstrong number is an integer such that the sum of the power of its digits is equal to the number itself.
//  For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371. 
//   9 is an Armstrong number since 9*1= 9.

import java.util.Scanner;
public class Armstrong1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean r=isArmstrong(n);
				if(r)
					System.out.println("Given num is Armstrong");
				else
					System.out.println("Given num is not Armstrong");
	}
	static int countDigit(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	static int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	static boolean isAmstrong(int x)
	{
		int nd=countDigit(x);
		int t=x;
		int sum=0;
		while(t>0)
		{
			int r=t%10;
			sum=sum+ pow(r ,nd);
			t=t/10;
		}
		if(sum==x)
			return true;
		else
			return false;
	}

}