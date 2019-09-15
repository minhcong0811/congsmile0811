package Lab_2;

import java.util.Scanner;

public class Bai_3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so dien ");
		double soDien, tienDien;
		soDien = sc.nextDouble();
		if(soDien <= 50)
			tienDien = soDien * 1000;
		else
			tienDien = 50 * 1000 + (soDien - 50) * 1200;
		System.out.print("So tien dien phai tra la: " + tienDien + " vnd");
		sc.close();
	}
}