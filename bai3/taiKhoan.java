package bai3;

import java.util.Scanner;

public class taiKhoan {
	public int soTaiKhoan;
	public String tenTaiKhoan;
	public double soDu;
	Scanner sc = new Scanner(System.in);
	
	public void taoTaiKhoan() {
		System.out.println("Nhập vào só tài khoản: ");
		soTaiKhoan = sc.nextInt();
		System.out.println("Nhập vào tên tài khoản: ");
		tenTaiKhoan = sc.nextLine();
		sc.nextLine();
		this.soDu = 0;
	}
	
	public void guiTien() {
		double soTien;
		System.out.println("Nhập vào số tiền muốn gửi: ");
		soTien = sc.nextDouble();
		this.soDu = this.soDu + soTien;
	}
	
	public void rutTien() {
		double soTien;
		do {
			System.out.println("Nhập vào số tiền muốn rút: ");
			soTien = sc.nextDouble();
			if (soTien > this.soDu)
				System.out.println("Số tiền nhập không hợp lệ");
		}
		while(soTien > this.soDu);
		this.soDu = this.soDu - soTien;
	}

	public void kiemTraSoDu() {
		System.out.println("Số tiền hiện tại của tài khoản là " + this.soDu);
	}
}

