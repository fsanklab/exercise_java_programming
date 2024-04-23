package ch03;
import java.util.Scanner;

public class Num_08 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n =scanner.nextInt();
		int arr[] = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i] = (int)(Math.random()*100+1);
			System.out.print(arr[i] + " ");
			if (i%10==9)
				System.out.println();
		}
		
		scanner.close();
	}
}
 