package tuan2;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so 1: ");

        int s1 = sc.nextInt();

        System.out.println("Nhap vao so 2: ");

        int s2 = sc.nextInt();

        int tong = s1 + s2;

        System.out.println("Tong = "+ tong);

        int hieu = s1 - s2;

        System.out.println("Hieu = "+ hieu);

        int tich = s1 * s2;

        System.out.println("Tich = "+ tich);

        double thuong = s1 * 1.0 / s2;

        System.out.println("Thuong = "+ thuong);

        int du = s1 % s2;

        System.out.println("So du = "+ du);


	}
}
