// Write a program to display the HALLOW BOX with stars?

class Box1 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println ("enter value of n");
		int n = sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0||j==0||i==n-1||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

// Output: 
// enter value of n 7
// * ***** *
// *    	 *
// *    	 *
// *     	 *
// *    	 *
// *    	 *
// * ***** *