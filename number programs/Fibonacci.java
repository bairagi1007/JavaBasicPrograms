// Def: a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.

class Fibonacci
{
	static int fib(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int m=sc.nextInt();
		int f=fib(m);
		System.out.println(f);
	}
}