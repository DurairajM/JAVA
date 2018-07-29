import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ct = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 1) {
		    System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
				ct += 1;
			}
			else {
				n = (3 * n + 1) / 2;
				ct += 1;
			}
		}
		System.out.println(ct);
		in.close();
	}
}