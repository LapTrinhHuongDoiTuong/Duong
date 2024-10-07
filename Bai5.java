package tuan4;
import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 2 số a và b: ");
		int a = sc.nextInt(),
			b = sc.nextInt();
		int ucln, bcnn;
		//Tìm ước chung lớn nhất theo kiểu thông thường
		if (a == 0 || b == 0) {
			ucln = a + b;
			System.out.printf("Ước chung lớn nhất của %d và %d là %d", a, b, ucln);
		}
		else {
			int s1 = a,
					s2 = b;
			while (s1 != s2) {
				if (s1 > s2)
					s1 = s1 - s2;
				else
					s2 = s2 - s1;
			}
			ucln = s1;
			System.out.printf("Ước chung lớn nhất của %d và %d là %d", a, b, ucln);
			System.out.println("");
		}
		
		//Tìm ước chung lớn nhất theo Euclid
		int ss1 = a,
			ss2 = b,
			r;
		while (ss2 != 0) {
			r = ss1 % ss2;
			ss1 = ss2;
			ss2 = r;
		}
		int uncln = ss1; 
		System.out.printf("Ước chung lớn nhất của %d và %d là %d", a, b, ucln);
		System.out.println("");
		
		//Tìm bội chung nhỏ nhất 
		bcnn = (a * b) / ucln;
		System.out.printf("Bội chung nhỏ nhất của %d và %d là %d", a, b, bcnn);
	}
}
