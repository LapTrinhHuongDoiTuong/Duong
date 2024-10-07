package tuan5;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, sum = 0;
		do {
			System.out.println("Nhập vào số lượng phần tử của mảng: ");
			n = sc.nextInt();
		}
		while(n <= 0);
		
		int a[] = new int[n];
		System.out.println("Nhập giá trị cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập vào giá trị thứ " + (i + 1) + " ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		
		System.out.println("Vậy tổng giá trị các phần tử trong mảng = " + sum);
	}
}
