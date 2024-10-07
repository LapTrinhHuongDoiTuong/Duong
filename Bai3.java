package tuan5;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Nhập vào số lượng phần tử: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("A[%d] = ", (i + 1));
			a[i] = sc.nextInt();
			
		}
		
		int temp;
		
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + "  ");
	}
}
