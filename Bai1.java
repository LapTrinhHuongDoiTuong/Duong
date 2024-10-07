package tuan4;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int tong;
		tong = 0;
		int n;
		System.out.println("Nhap vao 1 so: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++)
			tong = tong + i;
		System.out.printf("Vay tong tu 1 den %d = %d", n, tong);
	}
}
