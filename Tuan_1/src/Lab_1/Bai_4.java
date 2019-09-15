package Lab_1;

import java.util.Scanner;

public class Bai_4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 3 he so a, b, c");
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		double b = sc.nextDouble();
		System.out.print("Nhap c: ");
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - ( 4 * a * c );
		System.out.println("Delta = " + delta);
		if(delta >= 0)
			System.out.print("Can delta = " + Math.sqrt(delta));
		else
			System.out.print("Khong co can delta");
		sc.close();
	}
}