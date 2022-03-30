import java.util.Scanner;
public class ArraySquaredPlus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = s.nextInt();
		int Squared[][] = new int[n][n];
		int A = 1;
		
		for(int i=0;i<Squared.length;i++)	{
			for(int j=0;j<Squared[i].length;j++) {
				Squared[i][j]=A;
				A++;
				System.out.print(Squared[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.print("X값을 입력하세요 : ");
		int x = s.nextInt();
		System.out.print("Y값을 입력하세요 : ");
		int y = s.nextInt();
		
		System.out.println(Squared[x][y]);
		
	}

}
