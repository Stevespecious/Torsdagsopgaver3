public class Fibonacci
{
	public static void main(String[] args)
	{
		fibonacci(0,1);
	}
	private static void fibonacci(int a, int b)
	{
		System.out.print(Integer.toString(a) + " ");
		if(a>1000)
		{
			return;
		}
		fibonacci(b, a+b);
	}
}