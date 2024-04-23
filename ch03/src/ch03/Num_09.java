package ch03;
import java.util.Scanner;

public class Num_09 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int arr2D[][] = new int[4][4];
		
		for (int i=0;i<arr2D.length;i++) {
			for (int j=0;j<arr2D[i].length;j++) {
				arr2D[i][j]=(int)(Math.random()*10+1);
				System.out.print(arr2D[i][j] + "\t");
			}
			System.out.println(); 
		}
		
		scanner.close();
	}
}
 