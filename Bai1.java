import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		System.out.println("Nhap vao 1 so: ");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		if (num == 0)
			System.out.printf("%f la so khong", num);
		else
			if (num < 0)
				System.out.printf("%f la so am", num);
			else
				System.out.printf("%f la so duong", num);
	}
}
