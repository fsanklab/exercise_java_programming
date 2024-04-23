package ch03;

public class Num_12 {
	public static void main(String args[]) {
		int n, sum=0;
		for (int i=0;i<args.length;i++) {
			try {
				n = Integer.parseInt(args[i]);
				sum += n;
			}
			catch (NumberFormatException e) {
				continue;
			}
		}
		System.out.println(sum);
	}
}
 