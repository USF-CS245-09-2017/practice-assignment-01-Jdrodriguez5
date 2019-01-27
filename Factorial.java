
public class Factorial extends Practice1Test 
{
	public int factorial (int n, String type)
	{
		if (type.equals("iterative")){
			return iterativeFactorial(n);
		}
		else if (type.equals("recursive")){
			return recursiveFactorial(n); // other recursiuve function
		}
		else {
			return 1;
		}
	}

	public int iterativeFactorial(int n) 
	{
		int f = 1;
		for(int i = n; i > 0; i--)
			f *= i;     // f = i * f
		return f;
	}

	public int recursiveFactorial(int n)
	{
		return n * iterativeFactorial(n-1);
	}
}
//recursion vs iteration... --> choose iteration!

