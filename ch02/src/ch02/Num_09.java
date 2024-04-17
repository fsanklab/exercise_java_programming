package ch02;
import java.util.Scanner;

public class Num_09 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double x, y, radius, testX, testY;
		System.out.print("원의 중심과 반지름 입력>>");
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		radius = scanner.nextDouble();
		System.out.print("점 입력>>");
		testX = scanner.nextDouble();
		testY = scanner.nextDouble();
		
		if ((testX>=x-radius && testX<=x+radius)&&(testY>=y-radius&&testY<=y+radius))
			System.out.println("점 (" + testX + ", " + testY + ")는 원 안에 있다.");
		else
			System.out.println("점 (" + testX + ", " + testY + ")는 원 안에 있지 않다.");
		
		scanner.close();
	}
}
