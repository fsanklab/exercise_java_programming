package ch03;
import java.util.Scanner;

public class Num_07 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[10];
		double avg=0;
		
		System.out.print("랜덤한 정수들 : ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = (int)(Math.random()*10+1);
			System.out.print(numbers[i] + " ");
			avg+=numbers[i];
		}
		System.out.println();
		System.out.println("평균은 " + avg/(double)numbers.length);
		
		scanner.close();
	}
}
 