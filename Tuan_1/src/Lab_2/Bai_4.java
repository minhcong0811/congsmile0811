package Lab_2;

import java.util.Scanner;

public class Bai_4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("+---------------------------------+");
		System.out.println("1. Giai phuong trinh bac 1");
		System.out.println("2. Giai phuong trinh bac 2");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Ket thuc");
		System.out.println("+---------------------------------+");
		System.out.print("Lua chon: ");
		int luaChon = sc.nextInt();
		switch(luaChon) {
		case 1: giaiPTB1(); break;
		case 2: giaiPTB2(); break;
		case 3: tinhTienDien(); break;
		case 4: System.exit(0);
		default: System.out.print("Ban nhap khong dung!");
		sc.close();
		}
	}
	
	public static void giaiPTB1() {
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
        
	public static void giaiPTB2() {
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
	
	public static void tinhTienDien() {
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