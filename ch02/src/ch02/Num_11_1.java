package ch02;
import java.util.Scanner;

public class Num_11_1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int month;
		String season;
		System.out.print("달을 입력하세요(1~12)>>");
		month = scanner.nextInt();
		
		if (month>=3 && month <=5)
			season="봄";
		else if (month>=6 && month<=8)
			season="여름";
		else if (month>=9 && month<= 11)
			season="가을";
		else if (month==12 || month == 1 || month == 2)
			season="겨울";
		else
			season="잘못입력";
		
		System.out.println(season);
		
		scanner.close();
	}
}
