import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 3 so a, b, c: ");
		double  a = sc.nextDouble(),
				b = sc.nextDouble(),
				c = sc.nextDouble();
		double Min = a;
		if (Min >= b)
			Min = b;
		if (Min >= c)
			Min = c;
		System.out.println("Vây số nhỏ nhất trong ba số là: " + Min);
	}
}
