package bai1;

public class main {
	public static void main(String[] args) {
		chuNhat hcn = new chuNhat();
		
		hcn.Nhap();
		System.out.println("Vậy diện tích của hình chữ nhật = " + hcn.tinhDienTich());
		System.out.println("Vậy chu vi của hình chữ nhật = " + hcn.tinhChuVi());
	}
}
