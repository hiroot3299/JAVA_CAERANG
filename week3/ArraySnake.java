import java.util.Scanner;

public class ArraySnake {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("За : ");
		int row = s.nextInt();
		System.out.print("ї­ : ");
		int column = s.nextInt();
		int array[][] = new int[row][column];
		int i,j,k,l;
		int N = 1;
		
		for(i=0;i<array.length;i++)	{
			if(i==0||i%2==0) {
				for(j=0;j<array[i].length;j++)	{
					array[i][j] = N;
					
					N++;
				}
				System.out.println();
			}else	{
				for(j=array[i].length-1;j>=0;j--)	{
					array[i][j] = N;
					
					N++;
				}
				System.out.println();
			}
			
			
		}
		
		for(k=0;k<array.length;k++)	{
			for(l=0;l<array[k].length;l++)	{
				System.out.print(array[k][l]+"\t");
			}
			System.out.println();
		}	
	}

}
