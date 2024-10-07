package tuan4;
import java.util.Scanner;
public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 số: ");
		int num = sc.nextInt();
		
		//Đếm số
		int x = num, dem = 0;
		while (x != 0) {
			x = x / 10;
			dem++;
		}
		
		int kt = 0;
		for (int i = 1; i <= dem / 2; i++) {
			int vt = (int)Math.pow(10, dem - i);
			int vp = (int)Math.pow(10,  i);
			int s1 = num / vt,
				s2 = num % vp;
			if (s1 != s2) {
				kt = 1;
				System.out.printf("%d không phải là số đối xứng", num);
				break;
			}
		}
		if (kt == 0)
			System.out.printf("%d là số dối xứng", num);
	}
}
