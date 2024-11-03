package taiKhoanNganHang;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class taiKhoanTietKiem extends taiKhoan{
	private double laiSuatApDung;
	private int kyHanGuiTietKiem;
	private int thauChi = 5000000;
	private String maPin;
	private Date ngayDangKy;
	private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public taiKhoanTietKiem() {
		super();
	}
	public taiKhoanTietKiem(int soTaiKhoan, String tenTaiKhoan, double soDu, String matKhau, double laiSuatApDung, int khTK, Date ngayDK, String maPin) {
		super(soTaiKhoan, tenTaiKhoan, soDu, matKhau);
		this.laiSuatApDung = laiSuatApDung;
		this.kyHanGuiTietKiem = khTK;
		this.ngayDangKy = ngayDK;
		this.maPin = maPin;
	}
	
	public void TaoTaiKhoan() {
		super.TaoTaiKhoan();
		String mP;
		System.out.println("Nhập vào lãi xuất muốn áp dụng");
		this.laiSuatApDung = sc.nextDouble();
		sc.nextLine();
		// Tạo một biến để xác nhận việc nhập ngày tháng năm đã thành công chưa nếu chưa thì phải nhập lại
		boolean kt = false;
		while(!kt) {
			try {
				System.out.println("Nhập vào ngày đăng ký: ");
				String date = sc.nextLine();
				this.ngayDangKy = df.parse(date);
				kt = true;
			}
			catch(ParseException e) {
				System.out.println("Nhập vào không đúng định dạng!");
				kt = false;
			}
		}
		System.out.println("Nhập vào kỳ hạn muốn muốn gửi (đơn vị là tháng): ");
		this.kyHanGuiTietKiem = sc.nextInt();
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
	}
	
	@Override
	// Phương thức chuyển tiền cho tài khoản tiết kiệm
	public void rutTien() {
		double soTien;
		String tenNganHang, soTaiKhoan, mP;
		sc.nextLine();
		System.out.println("Số dư hiện tại của quý khách là: " + this.soDu);
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
			if (soTien > this.soDu || soTien <= 0)
				System.out.println("Số tiền nhập không hợp lệ! Vui lòng nhập lại: ");
		}while(soTien > this.soDu || soTien <= 0);
		
		sc.nextLine();
		do {
			System.out.println("Nhập vào mã PIN để xác nhận thanh toán: ");
			mP = sc.nextLine();
			if (!mP.equals(this.maPin))
				System.out.println("Mã PIN không trùng khớp! Vui lòng nhập lại: ");
		}while (!mP.equals(this.maPin));
		System.out.println("Chuyển tiền thành công! Cảm ơn quý khách đã tin tưởng sử dụng dịch vụ");
		sc.nextLine();
		this.soDu = this.soDu - soTien;
	}
	
	// Tính số tiền để khách hàng biết khi hết kỳ hạn mình sẽ có bao nhiêu tiền
	public double soTienSauKyHan() {
		double soTien = this.soDu;
		for (int i = 1; i <= this.kyHanGuiTietKiem; i++)
			soTien = soTien + (soTien * this.laiSuatApDung);
		return soTien;
	}
	
}
