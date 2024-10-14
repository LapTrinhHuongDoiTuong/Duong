package bai2;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên: ");
		int n = sc.nextInt();
		sinhVien[] dsSinhVien = new sinhVien[n];
		
		for (int i = 0; i < n; i++) {
			dsSinhVien[i] = new sinhVien();
			dsSinhVien[i].Nhap();
		}
		
		System.out.println("Danh sách sinh viên ban đầu: ");
		
		for (int i = 0; i < n; i++) {
			dsSinhVien[i].Xuat();
		}
		
		System.out.println("");
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (dsSinhVien[i].dtb < dsSinhVien[j].dtb) {
					sinhVien tmp = new sinhVien();
					tmp = dsSinhVien[i];
					dsSinhVien[i] = dsSinhVien[j];
					dsSinhVien[j] = tmp;
				}
			} 
		}
		
		
		System.out.println("Danh sách sinh viên sau khi sắp xếp giảm dần theo điểm: ");
		for (int i = 0; i < n; i++) {
			dsSinhVien[i].Xuat();
		}
		
		
	}
}
