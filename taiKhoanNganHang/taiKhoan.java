package taiKhoanNganHang;

import java.util.Scanner;

public class taiKhoan {
	private int soTaiKhoan;
	private String tenTaiKhoan;
	private double soDu;
	private String matKhau;
	private Scanner sc = new Scanner(System.in);
	
	public taiKhoan(int soTaiKhoan, String tenTaiKhoan, double soDu, String matKhau) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soDu = soDu;
		this.matKhau = matKhau;
	}
	
	public taiKhoan() {
		
	}
	
	public double getSoDu() {
		return this.soDu;
	}

	public void TaoTaiKhoan() {
		String checkMK;
		System.out.println("Nhập số tài khoản: ");
		this.soTaiKhoan = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập tên tài khoản: ");
		this.tenTaiKhoan = sc.nextLine();
		do {
			System.out.println("Nhập mật khẩu: ");
			this.matKhau = sc.nextLine();
			System.out.println("Nhập lại mật khẩu để xác nhận: ");
			checkMK = sc.nextLine();
			if(!checkMK.equals(this.matKhau))
				System.out.println("Mật khẩu không trùng khớp vui lòng thử lại!!!");
		}
		while (!checkMK.equals(this.matKhau));
		System.out.println("Vì mới tạo tài khoản nên số dư của quý khác là 0");
	}
	
	public void guiTien() {
		double soTien;
		do {
			System.out.println("Nhập vào số tiền muốn gửi: ");
			soTien = sc.nextDouble();
			if (soTien <= 0) 
				System.out.println("Số tiền nhập không hợp lệ!");
		}
		while(soTien <= 0);
		this.soDu = this.soDu + soTien;
	}
	
	public void rutTien() {
		double soTien;
		do {
			System.out.println("Nhập vào số tiền muốn rút: ");
			soTien = sc.nextDouble();
			if (soTien > this.soDu || soTien <= 0)
				System.out.println("Số tiền nhập không hợp lệ");
		}
		while(soTien > this.soDu || soTien <= 0);
		this.soDu = this.soDu - soTien;
	}

	public void kiemTraSoDu() {
		System.out.println("Số tiền hiện tại của tài khoản là " + this.soDu);
	}
	
	public void doiMatKhau() {
		String mkm, check, check_mkm;
		System.out.println("Thực hiện đổi mật khẩu!!!");
		String MKcu = this.matKhau;
		sc.nextLine();
		do {
			System.out.print("Nhập vào mật khẩu cũ: ");
			check = sc.nextLine();
			if (check.equals(this.matKhau)) {
				do {
					System.out.print("Nhập mật khẩu mới: ");
					mkm = sc.nextLine();
					System.out.print("Nhập lại mật khẩu mới: ");
					check_mkm = sc.nextLine();
					if (check_mkm.equals(mkm)) {
						this.matKhau = mkm;
						System.out.println("Đổi mật khẩu thành công!!!");
						System.out.println("Mật khẩu mới của bạn là: " + this.matKhau);
					}
					else {
						System.out.println("Đổi mật khẩu thất bại do không trùng khớp!");
					}
				}
				while(!check_mkm.equals(mkm));
				
			}
			else {
				System.out.println("Mật khẩu không đúng!");
			}
		}
		while(!check.equals(MKcu));
	}
}

