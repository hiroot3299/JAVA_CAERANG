import java.util.Scanner;

public class  Leap_year {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		int result = 0;
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			result = 1;
			
		}else	{
			result = 0;
			
		}
		
		System.out.println(result);
		
	}

}
