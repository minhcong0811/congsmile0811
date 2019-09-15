package Lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so luong : ");
		int soLuong = sc.nextInt();
		int[] a = new int[soLuong];
		for(int i = 0; i < soLuong; i++) {
			System.out.print("So thu " + (i + 1) +": ");
			a[i] = sc.nextInt();
		}
		System.out.print("Mang ban da nhap la: ");
		for(int i = 0; i < soLuong; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n1. Sap xe");
		System.out.println("2. Xuat phan tu nho nhat");
		System.out.println("3. Trung binh cong cac so chia het cho 3");
		System.out.print("Lua chon: ");
		int luaChon = sc.nextInt();
		switch(luaChon) {
		case 1: sapXep(soLuong, a); break;
		case 2: timMin(soLuong, a); break;
		case 3: trungBinhCong(soLuong, a); break;
		default: System.out.println("Ban nhan khong chinh xac");
		}
		sc.close();
	}
	
	public static void sapXep(int soLuong,  int a[]) {
		Arrays.sort(a);
		System.out.print("Mang sau khi duoc sap xep la: ");
		for(int i = 0; i < soLuong; i++)
			System.out.print(a[i] + " ");
	}
	
	public static void timMin(int soLuong, int a[]) {
		int min = a[0];
		for(int i = 1; i < soLuong; i++) {
			if(a[i] < min)
				min = a[i];
		}
		System.out.print("So be nhat trong mang ban da nhap la: " + min);
	}
	
	public static void trungBinhCong(int soLuong, int a[]) {
		int soTrungBinhCong = 0, count = 0;
		for(int i = 0; i < soLuong; i++) {
			if (a[i] % 3 == 0) {
				soTrungBinhCong += a[i];
				count++;
			}
		}
		System.out.println("Trung binh cong cac phan tu chia het cho 3 la: " + (soTrungBinhCong/count));
			
	}
}