import java.util.Scanner;
public class RowColumn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("행 : ");
		int row = s.nextInt();
		System.out.print("열 : ");
		int column = s.nextInt();
		int volume = row*column;
		int array1 [][] = new int[row][column];
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
