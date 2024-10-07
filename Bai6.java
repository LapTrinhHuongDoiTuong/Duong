package tuan5;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào số phần tử");
		n = sc.nextInt();
		int[] arr = new int[n + 100];
		for (int i = 0; i < n; i++) {
			System.out.printf("A[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		
		n = Them(arr, n, 100, 1);
		inDS(arr, n);
		n = Xoa(arr, n, 1);
		inDS(arr, n);
		sc.close();
	}
	
	public static int Them(int a[], int n, int x, int vt) {
		if (vt == n - 1) {
			a[n] = vt;
			n++;
			return n;
		} else {
			for (int i = n; i > vt; i--) {
				a[i] = a[i - 1];
			}
			a[vt] = x;
			n++;
		}
		return n;
	}
	
	public static int Xoa(int a[], int n, int vt) {
		if (vt == n - 1) {
			a[vt] = 0;
			n--;
			return n;
		} else {
			for (int i = vt; i < n; i++) {
				a[i] = a[i + 1];
			}
			n--;
		}
		return n;
			
	}
	
	public static void inDS(int a[], int n) {
		System.out.println("");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
