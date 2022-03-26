import java.util.Scanner;

public class Fibonacci_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int n0 = 0;	
		int n1 = 1;
		int n2;
		
		for(int i=2;i<N;i++)	{
			n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
		}
		
		n2 = n0 + n1;
		System.out.printf("%d = %d + %d", n2, n0, n1);
		
	}

}
