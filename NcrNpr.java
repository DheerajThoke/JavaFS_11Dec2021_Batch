package ncrnpr;

public class NcrNpr
{
	public static int factorial(int n)
	{
        int i=1;
        int fact=1;
		
		for(i=1;i<=n;i++)
	       fact=fact*i;
	        return fact;
	}

	public static int ncr(int n,int r) 
	{
		int combination = factorial(n)/(factorial(n-r)*factorial(r));
		return combination;
	}
	
	public static int npr(int n,int r) 
	{
		int permutation = factorial(n)/factorial(n-r);
		return permutation;
	}

	public static void main(String[] args) 
	{
		System.out.println(ncr(5,2));
		System.out.println(npr(5,2));		

	}

}
