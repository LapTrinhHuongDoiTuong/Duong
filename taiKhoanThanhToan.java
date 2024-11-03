package taiKhoanNganHang;

import java.util.ArrayList;

public class taiKhoanThanhToan extends taiKhoan{
	private String maPin;
	private double thauChi = 5000000;
	private ArrayList<String> lichSuThanhToan;
	
	public taiKhoanThanhToan() {
		super();
		lichSuThanhToan = new ArrayList<String>();
	}
	
	public taiKhoanThanhToan(int soTaiKhoan, String tenTaiKhoan, double soDu, String matKhau, String maPin, ArrayList<String> ls) {
		super(soTaiKhoan, tenTaiKhoan, soDu, matKhau);
		this.maPin = maPin;
		this.lichSuThanhToan = ls;
	}
	
	public void TaoTaiKhoan() {
		String mP;
		super.TaoTaiKhoan();
		do {
			System.out.println("Nhập vào mã pin gồm 6 số(Để xác nhận dịch vụ chuyển tiền sau này): ");
			this.maPin = sc.nextLine();
			if (this.maPin.length() > 6 || this.maPin.length() < 6) 
				System.out.println("Mã Pin phải chứa 6 số!!!! Vui lòng nhập lại: ");
			if (!kiemTraSo(this.maPin))
				System.out.println("Mã Pin chỉ chứa các kí tự số! Vui lòng nhập lại: ");
			System.out.println("Nhập lại mã PIN để xác nhận: ");
			mP = sc.nextLine();
			if(!this.maPin.equals(mP))
				System.out.println("Mã PIN không trùng khớp!");
		} while(this.maPin.length() > 6 || this.maPin.length() < 6 || !kiemTraSo(this.maPin) || !this.maPin.equals(mP));
		System.out.println("Vì mới tạo tài khoản nên số dư của quý khác là 0");
	}
	
	@Override
	// Phương thức chuyển tiền cho tài khoản thanh toán
	public void rutTien() {
		double soTien;
		String tenNganHang, soTaiKhoan, mP;
		sc.nextLine();
		System.out.println("Số dư hiện tại của quý khách là: " + this.soDu);
		System.out.println("Mức thấu chi của ngân hàng đưa ra là 5000000");
		do {
			System.out.println("Nhập tên ngân hàng của tài khoản muốn chuyển tiền: ");
			tenNganHang = sc.nextLine();
			System.out.println("Nhập số tài khoản của tài khoản muốn chuyển: ");
			soTaiKhoan = sc.nextLine();
			if (!kiemTraSo(soTaiKhoan))
				System.out.println("Số tài khoản không hợp lệ!");
		} while (!kiemTraSo(soTaiKhoan));
		
		do {	
			System.out.println("Nhập vào số tiền muốn thanh toán: ");
			soTien = sc.nextDouble();
			if (soTien > this.thauChi || soTien <= 0)
				System.out.println("Số tiền nhập không hợp lệ hoặc vượt quá mức hạn thấu chi! Vui lòng nhập lại: ");
		}while(soTien > this.thauChi || soTien <= 0);
		
		sc.nextLine();
		do {
			System.out.println("Nhập vào mã PIN để xác nhận thanh toán: ");
			mP = sc.nextLine();
			if (!mP.equals(this.maPin))
				System.out.println("Mã PIN không trùng khớp! Vui lòng nhập lại: ");
		}while (!mP.equals(this.maPin));
		System.out.println("Chuyển tiền thành công! Cảm ơn quý khách đã tin tưởng sử dụng dịch vụ");
		sc.nextLine();
		this.lichSuThanhToan.add("Thông báo chuyển tiền: Ngân hàng: " + tenNganHang + ", số tài khoản: " + soTaiKhoan + " , số tiền: " + soTien);
		this.soDu = this.soDu - soTien;
	}
	
	public void HienLichSuThanhToan() {
		for (String tt : this.lichSuThanhToan)
			System.out.println(tt);
	}
}
