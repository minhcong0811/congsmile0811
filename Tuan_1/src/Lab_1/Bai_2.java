package Lab_1;

import java.util.Scanner;

public class Bai_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 2 canh!");
		System.out.print("dai: ");
		double chieuDai = sc.nextDouble();
		System.out.print("rong: ");
		double chieuRong = sc.nextDouble();
		double chuVi = (chieuDai + chieuRong) * 2;
		System.out.println("Chu vi cua hinh chu nhat la: " + chuVi);
		double dienTich = chieuDai * chieuRong;
		System.out.println("Dien tich cua hinh chu nhat la: "+ dienTich);
		System.out.println("Canh nho nhat la: " + Math.min(chieuDai, chieuRong));
		sc.close();
	}
}