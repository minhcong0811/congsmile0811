package Lab_3;

import java.util.Scanner;

public class Bai_2 {
	public static void main (String[] args) {
		System.out.println("+---------+");
		for(int i = 1; i <= 9; i++) {
			for(int j =1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		System.out.println("+---------+");
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("Chon bang cuu chuong muon xuat: ");
		int a = sc.nextInt();
		System.out.print("+---------+");
		for(int i =1; i <= 10; i++) {
			System.out.println(a + " x " + i + " = " + a * i);
		}
		System.out.print("+---------+");
		sc.close();

	}
	
}