package ch02;
import java.util.Scanner;

public class Num_03 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int won;
		System.out.print("금액을 입력하시오>>");
		won = scanner.nextInt();
		
		System.out.println("오만원권 "+won/50000+"매");
		won%=50000;
		System.out.println("만원권 "+won/10000+"매");
		won%=10000;
		System.out.println("천원권 "+won/1000+"매");
		won%=1000;
		System.out.println("백원권 "+won/100+"개");
		won%=100;
		System.out.println("오십원 "+won/50+"개");
		won%=50;
		System.out.println("십원 "+won/10+"개");
		won%=10;
		System.out.println("일원 "+won+"개"); 		
		
		scanner.close();
	}
}
