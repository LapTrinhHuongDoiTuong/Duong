package tuan4;
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số: ");
		int n = sc.nextInt(),
			dem = 0;
		if (n < 2)
			System.out.println(n + " 5không phải là số nguyên tố");
		else
			for (int i = 2; i <= Math.sqrt(n); i++)
				if (n % i == 0) {
					dem++;
					System.out.println(n + " không phải là số nguyên tố");
					break;
				}
		if (dem == 0) 
			System.out.println(n + " là số nguyên tố");
	}
}
