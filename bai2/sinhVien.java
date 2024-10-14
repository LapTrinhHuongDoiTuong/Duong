package bai2;

import java.util.Scanner;

public class sinhVien {
	Scanner sc = new Scanner(System.in);
	public String maSV, tenSV, ngaySinh;
	public double dtb;
	
	public void Nhap() {
		System.out.println("Nhập tên sinh viên: ");
		this.tenSV = sc.nextLine();
		System.out.println("Nhập mã sinh viên: ");
		this.maSV = sc.nextLine();
		System.out.println("Nhập ngày sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.println("Nhập điểm trung bình: ");
		this.dtb = sc.nextDouble();
		sc.nextLine();
	}
	
	public void Xuat() {
		System.out.println("Tên sinh viên: " + this.tenSV + ", mã sinh viên: " + this.maSV + ", ngày sinh: " + this.ngaySinh + ", điểm trung binh: " + this.dtb);
	}
}
