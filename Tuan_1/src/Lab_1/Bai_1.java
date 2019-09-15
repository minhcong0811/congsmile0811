package Lab_1;

import java.util.Scanner;

public class Bai_1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho Ten: ");
		String hoTen = sc.nextLine();
		System.out.print("Diem trung binh: ");
		double diemTB = sc.nextDouble();
		System.out.println(hoTen+" " + diemTB + " diem.");
		sc.close();
	}
}