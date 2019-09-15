package Lab_3;

import java.util.Scanner;

public class Bai_1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhan mot so nguyen: ");
		int soNguyen = sc.nextInt();
		boolean	check = true;
		if(soNguyen < 2)
			check = false;
		else {
			for(int i = 2; i < soNguyen - 1; i++) {
				if(soNguyen % i == 0) {
					check = false;
					break;
				}
			}
		}
		if(check)
			System.out.println(soNguyen + " la so nguyen to");
		else
			System.out.println(soNguyen + " khong la so nguyen to");
	}
}