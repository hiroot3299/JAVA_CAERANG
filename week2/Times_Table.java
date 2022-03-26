import java.util.Scanner;

public class Times_Table {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true)	{
			int N = s.nextInt();
			
			if(N>9||N<1)	{
				break;
			}
			
			for(int i=1;i<10;i++) {
				int result = N * i;
				System.out.printf("%d * %d = %d\n", N, i, result);
			}
			
		}
	}
	
}
