package Lab_1;

import java.util.Scanner;

public class Bai_3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao canh cua khoi lap phuong: ");
		double canh = sc.nextDouble();
		double theTich = Math.pow(canh, 3);
		System.out.println("The tich cua khoi lap phuong la " + theTich);
		sc.close();
	}
}