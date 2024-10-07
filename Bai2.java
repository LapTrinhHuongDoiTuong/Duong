package tuan5;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Nhập vào số lượng phần tử mảng: ");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", (i + 1));
			a[i] = sc.nextInt();
			b[i] = a[i];
		}

		for (int i = 0; i < n; i++) 
			a[i] = b[n - i - 1];
		System.out.println("Mảng a sau khi thực hiện đảo ngược: ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
