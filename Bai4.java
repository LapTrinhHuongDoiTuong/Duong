package tuan2;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long tienGui;
        int soThangGui;
        double laiSuat;

        System.out.println("Nhap vao lan luot tien gui, so thang gui, lai suat: ");

        tienGui = sc.nextLong();

        soThangGui = sc.nextInt();

        laiSuat = sc.nextDouble();

        double soTienLai = tienGui * soThangGui * laiSuat / 12 / 100;

        System.out.println("So tien lai: " + soTienLai);

        double SoTienGoc = tienGui + soTienLai;

        System.out.println("So tien goc: " + SoTienGoc);
	}

}
