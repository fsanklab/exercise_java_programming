package ch02;
import java.util.Scanner;

public class Num_04 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c, middle;
		System.out.print("정수 3개 입력>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		// 1. a가 중간값인 경우
		if ((a>b && a<c) || (a>c && a<b))
			middle = a;
		// 2. b가 중간값인 경우
		else if ((b>a && b<c)||(b>c&&b<a))
			middle=b;
		// 3. c가 중간값인 경우
		else
			middle=c;
		System.out.println("중간 값은 "+middle);
		
		scanner.close();
	}
}
