package tuan5;

import java.util.Scanner;

class SinhVien {
 String ten;
 String maSinhVien;
 double diemTrungBinh;

 SinhVien(String ten, String maSinhVien, double diemTrungBinh) {
     this.ten = ten;
     this.maSinhVien = maSinhVien;
     this.diemTrungBinh = diemTrungBinh;
 }

 	public String getTen() {
     return this.ten;
 }

 	public String getMaSinhVien() {
     return this.maSinhVien;
 }

 	public double getDiemTrungBinh() {
     return this.diemTrungBinh;
 }
 	public void setTen(String ten) {
 		this.ten = ten;
 	}
 	public void setMaSinhVien(String maSinhVien) {
 		this.maSinhVien = maSinhVien;
 	}
 	public void setDiemTrungBinh(double diemTrungBinh) {
 		this.diemTrungBinh = diemTrungBinh;
 	}
 	
 	
 	public void In() {
 		 System.out.println("Tên: " + this.getTen() + ", Mã sinh viên: " + this.getMaSinhVien() + ", Điểm trung bình: " + this.getDiemTrungBinh());
 	}
}


public class Bai7 {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     
     System.out.print("Nhập số lượng sinh viên: ");
     int soLuongSinhVien = scanner.nextInt();
     scanner.nextLine(); 

     
     SinhVien[] danhSachSinhVien = new SinhVien[soLuongSinhVien + 100];

     for (int i = 0; i < soLuongSinhVien; i++) {
         System.out.println("Nhập thông tin cho sinh viên " + (i + 1) + ":");
         System.out.print("Tên: ");
         String ten = scanner.nextLine();
         System.out.print("Mã sinh viên: ");
         String maSinhVien = scanner.nextLine();
         System.out.print("Điểm trung bình: ");
         double diemTrungBinh = scanner.nextDouble();
         scanner.nextLine(); // Đọc bỏ dòng thừa

         danhSachSinhVien[i] = new SinhVien(ten, maSinhVien, diemTrungBinh);
     }
     InDanhSachSinhVien(danhSachSinhVien);
 

     soLuongSinhVien = ThemSinhVien(danhSachSinhVien, soLuongSinhVien);
     InDanhSachSinhVien(danhSachSinhVien);
     
     soLuongSinhVien = XoaSinhVienTheoTen(danhSachSinhVien, soLuongSinhVien);
     InDanhSachSinhVien(danhSachSinhVien);

     soLuongSinhVien = XoaSinhVienTheoMa(danhSachSinhVien, soLuongSinhVien);
     InDanhSachSinhVien(danhSachSinhVien);
     
     timKiemSinhVienTheoMa(danhSachSinhVien, soLuongSinhVien);
     scanner.close();
     
       sapXepSinhVienTheoDiem(danhSachSinhVien, soLuongSinhVien);
       InDanhSachSinhVien(danhSachSinhVien);
 }
 
 public static int ThemSinhVien(SinhVien[] ds, int n) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Muốn thêm sinh viên?");
	 System.out.println("Nhập vào tên sinh viên: ");
	 String ten = sc.nextLine();
	 System.out.println("Nhập vào mã sinh viên: ");
	 String ma = sc.nextLine();
	 System.out.println("Nhập vào điểm trung bình của sinh viên: ");
	 double dtb = sc.nextDouble();
	 sc.nextLine();
	 ds[n] = new SinhVien(ten, ma, dtb);
	 
	 n++;
	 return n;
 }
 
 public static int XoaSinhVienTheoTen(SinhVien[] ds, int n) {
	 int i = 0, vt = -1;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Muốn xóa sinh viên?");
	 System.out.println("Nhập vào tên sinh viên muốn xóa: ");
	 String name = sc.nextLine();
	 while (i < n) {
		 if (ds[i].getTen().equals(name) && ds[i] != null) {
			 vt = i;
			 for (int j = vt; j < n; j++) {
				 ds[j] = ds[j  +1];
			 }
			 n--;
			 ds[n] = null;
		 } else i++;
	 }
	 
	 if (vt == -1) 
		 System.out.println("Không tìm thấy sinh viên phù hợp");
	 
	 return n;
 }
 
 public static int XoaSinhVienTheoMa(SinhVien[] ds, int n) {
	 int i = 0, vt = -1;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Muốn xóa sinh viên?");
	 System.out.println("Nhập vào mã sinh viên muốn xóa: ");
	 String id = sc.nextLine();
	 while (i < n) {
		 if (ds[i].getMaSinhVien().equals(id) && ds[i] != null) {
			 vt = i;
			 for (int j = vt; j < n; j++) {
				 ds[j] = ds[j  + 1];
			 }
			 ds[n - 1] = null;
			 n--;
		 } else i++;
	 }
	 
	 if (vt == -1) 
		 System.out.println("Không tìm thấy sinh viên phù hợp");
	 
	 return n;
 }
 
 public static void timKiemSinhVienTheoMa(SinhVien[] ds, int n) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Nhập mã sinh viên muốn tìm: ");
	 String id = sc.nextLine();
	 for (int i = 0; i < n;i++) {
		 if (ds[i].getMaSinhVien().equals(id)) {
			 ds[i].In();
		 }
	 }
 }
 
 public static void HoanDoi(SinhVien a, SinhVien b) {
	 SinhVien tg = b;
	 b = a;
	 a = tg;
 }
 
 public static void sapXepSinhVienTheoDiem(SinhVien[] ds, int n) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Chọn sắp xếp tăng dần gõ 1, sắp xếp giảm dần gõ -1: ");
	 int dk = sc.nextInt();
	 if (dk == 1) {
		 for (int i = 0; i < n - 1; i++) {
			 if (ds[i].getDiemTrungBinh() > ds[i + 1].getDiemTrungBinh()) {
				 SinhVien tg = ds[i + 1];
				 ds[i + 1] = ds[i];
				 ds[i] = tg;
			 }
		 System.out.println("Sau khi sắp xếp tăng dần: ");
		 }
	 } else {
		 if (dk == -1) {
			 for (int i = 0; i < n - 1; i++) {
				 if (ds[i].getDiemTrungBinh() < ds[i + 1].getDiemTrungBinh()) {
					 SinhVien tg = ds[i + 1];
					 ds[i + 1] = ds[i];
					 ds[i] = tg;
				 }
			 }
			 System.out.println("Sau khi sắp xếp giảm dần: ");
		 } else {
			 System.out.println("Nhập không hợp lệ!!!");
		 }
	 }
 }
 
 
 public static void InDanhSachSinhVien(SinhVien[] ds) {
	 System.out.println("Danh sách sinh viên:");
     for (SinhVien sinhVien : ds) {
         if (sinhVien != null) {
             sinhVien.In();
         }
     }
 }
}

