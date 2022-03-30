import java.util.Scanner;

public class IntPlusArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("10자리 이하의 정수 입력 : ");
		int num = s.nextInt();
		int D = num;
		int i, j, k, value;
		int sumNum = 0;
		for(i=1;i<=10;i++)	{
			D /= 10;
			if(D==0) {
				break;
			}
		}
		int IntArray[] = new int[i];
		for(j=IntArray.length-1;j>=0;j--)	{
			value = num%10;
			num = num/10;
			IntArray[j] = value;
			System.out.println(IntArray[j]);
		}
		
		for(k=0;k<IntArray.length;k++)	{
			sumNum += IntArray[k];
			if(k==IntArray.length-1)	{
				System.out.print(IntArray[k]+"=");
			}else {
				System.out.print(IntArray[k]+"+");
			}
			
		}
		
		System.out.print(sumNum);
		
	}

}
