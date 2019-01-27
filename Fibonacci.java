

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
			int f = 1;
			for(int i = 2; i <= n; i++)
				f = iterativeFibonacci(i-1) + iterativeFibonacci(i-2); 
			return f;
		}
	}

	public int recursiveFibonacci(int n)
	{
		if(n < 2)
			return n;	
		return iterativeFibonacci(n-1) + iterativeFibonacci(n-2); // ineffiecient because it creates a tree down and duplicates many.
	}


	
}


// 0,1,1,2,3,5,8,13,21,34,55...