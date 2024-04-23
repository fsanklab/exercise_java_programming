package ch03;

public class Num_10 {
	public static void main(String args[]) {
		int arr[][] = new int[4][4];
		int flag[][] = new int [4][4];
		
		// flag 초기화 (0은 랜덤넘버 삽입 안함, 1은 랜덤넘버 삽입 함)
		for (int i=0;i<flag.length;i++)
			for (int j=0;j<flag[i].length;j++)
				flag[i][j]=0;
		
		// 랜덤넘버 발행 (10개만 발행, 나머지 6개는 초기화했던 0으로 둠)
		int x,y;
		for (int i=0;i<10;i++) {
			do {
				x=(int)(Math.random()*4);
				y=(int)(Math.random()*4);
			} while (flag[x][y]==1);
			arr[x][y]=(int)(Math.random()*10+1);
			flag[x][y]=1;			
		}
		
		// 배열 출력
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		}
	}
}
