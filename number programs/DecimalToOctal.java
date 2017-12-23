// Write a program to convert DECIMAL to OCTAL?
import java.util.*;
public class Dectooct 
{
public static void main(String[] args)
{
	System.out.println("enter the decimal number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String oct="";
	while(n>0)
	{
	int r=n%8;
	oct= r + oct;
	n=n/8;
	}
	System.out.println("Octal Equivalent:" + oct);
}
}