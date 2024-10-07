import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao 3 so a, b, c: ");
	double  a = sc.nextDouble(),
			b = sc.nextDouble(),
			c = sc.nextDouble();
	double x1, x2;
	if (a == 0) {
		x1 = -c / b;
		System.out.println("Phương trình có 1 nghiệm: " + x1);
	}
	else {
		
		double denta = Math.sqrt(b * b - 4 * a * c);
			if (denta < 0) 
				System.out.println("Phương trình vô nghiệm");
			else
				if (denta == 0) {
					x1 = -b / (2 * a);
					System.out.println("Phương trình có 1 nghiệm kép: " + x1);
				}
				else {
					x1 = (-b + Math.sqrt(denta) / (2 * a));
					x2 = (-b - Math.sqrt(denta) / (2 * a));
					System.out.println("Phương trình có 2 nghiệm là " + x1 + " và " + x2);
				}
			}
	
	}
}
