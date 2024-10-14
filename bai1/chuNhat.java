package bai1;

import java.util.Scanner;

public class chuNhat {
	public double cd, cr;
	Scanner sc = new Scanner(System.in);
	
	public void Nhap() {
		System.out.print("Nhập vào chiều dài và chiều rộng: ");
		this.cd = sc.nextDouble();
		this.cr = sc.nextDouble();
	}
	
	public double tinhChuVi() {
		return ((this.cd + this.cr) * 2);
	}
	public double tinhDienTich() {
		return (this.cd * this.cr);
	}
}
