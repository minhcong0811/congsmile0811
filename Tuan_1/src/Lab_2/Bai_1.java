package Lab_2;

import java.util.Scanner;

public class Bai_1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 2 so a va b");
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		double b = sc.nextDouble();
		if(a == 0) {
			if(b == 0)
				System.out.println("Phuong trinh co vo so nghiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		}
		else
			System.out.println("Phuong trinh co nghiem x = " + (-b / a));
		sc.close();
	}
}