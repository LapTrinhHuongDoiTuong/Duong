package tuan4;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 số: ");
		int n = sc.nextInt();
		int gt = 1;
		for (int i = 1; i <= n; i++) 
			gt = gt * i;
		System.out.printf("Vậy giai thừa của %d = %d", n, gt);
	}
}
