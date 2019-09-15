package Lab_2;

import java.util.Scanner;

public class Bai_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap va lan luot 3 he so a, b, c ");
		System.out.print("Nhap a: "); double a = sc.nextDouble();
		System.out.print("Nhap b: "); double b = sc.nextDouble();
		System.out.print("Nhap c: "); double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - ( 4 * a * c );
		double x1, x2;
		if (a == 0) {
			if(b == 0) {
				if(c == 0)
					System.out.println("Phuong trinh co vo so nghiem");
				else
					System.out.println("Phuong trinh vo nghiem");
			}
			else
				System.out.println("Phuong trinh co nghiem x = " + (-c / b));
		}
		else if (delta < 0)
			System.out.println("Phuong trinh vo nghiem");
		else if (delta == 0)
			System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (- b / 2 * a));
		else {
			x1 = (- b + Math.sqrt(delta) / (2 * a));
			x2 = (- b - Math.sqrt(delta) / (2 * a));
			System.out.println("Phuong trinh co 2 nghiem phan biet:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		sc.close();
	}
}