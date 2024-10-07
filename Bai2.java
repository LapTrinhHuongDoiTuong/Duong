import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào điểm của học sinh: ");
		
		double dtb = sc.nextDouble();
		
		if (dtb < 0)
			System.out.println("Điêm số không hợp lệ!!!");
		else
			if (dtb >= 8) 
				System.out.println("Học sinh giỏi");
			else
				if (dtb >= 6.5)
					System.out.println("Học sinh khá");
				else
					if (dtb >= 4)
						System.out.println("Học sinh trung bình");
					else
						System.out.println("Học sinh yếu");
	}
}
