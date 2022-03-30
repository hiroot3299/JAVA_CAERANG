import java.util.Scanner;
public class ArraySquared {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = s.nextInt();
		int array1 [][] = new int[n][n];
		int A = 1;
		
		for(int i=0;i<array1.length;i++)	{
			for(int j=0;j<array1[i].length;j++) {
				array1[i][j]=A;
				A++;
				System.out.print(array1[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
