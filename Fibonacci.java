

public class Fibonacci extends Practice1Test
{
	public int fibonacci (int n, String type)
	{
		if (type.equals("iterative")){
			return iterativeFibonacci(n);
		}
		else if (type.equals("recursive")) {
			return recursiveFibonacci(n);
		}
		else {
			return 1;
		}
	}

	public int iterativeFibonacci(int n){
		if (n < 2)
		{
			return n;
		}
		else {
			int f = 0;
			int j = 1;
			int g = 1;
			for(int i = 2; i <= n; i++)
			{
				j = f + g;
				f = g;
				g = j;
			}	
			return g;
		}
	}

	public int recursiveFibonacci(int n)
	{
		if(n < 2)
			return n;	// base case for recursion
		return recursiveFibonacci(n-1) + recursiveFibonacci(n-2); // ineffiecient because it creates a tree down and duplicates many.
	}
}

// 0,1,1,2,3,5,8,13,21,34,55...