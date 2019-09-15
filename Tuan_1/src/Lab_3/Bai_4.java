package Lab_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> hoTen = new ArrayList<String>();
		ArrayList<Integer> diem = new ArrayList<Integer>();
		ArrayList<String> hocLuc = new ArrayList<String>();
		for(int i = 0; i < 3; i++) {
			System.out.print("Nhap ho ten hoc sinh thu " + (i + 1) + ": ");
			String nhapHoTen = sc.nextLine();
			hoTen.add(nhapHoTen);
			System.out.print("Nhap diem: ");
			for(;;) {
			int nhapDiem = Integer.parseInt(sc.nextLine());
			if(nhapDiem >= 0 && nhapDiem <= 10) {
				diem.add(nhapDiem);
				break;
			}
			else
				System.out.println("Diem phai tu 0 - 10. Nhap lai: ");
			}
		}
		for(int i = 0; i < 3; i++) {
			if(diem.get(i) < 5)
				hocLuc.add("Yeu");
			else if(diem.get(i) >= 5 && diem.get(i) <6.5)
				hocLuc.add("Trung Binh");
			else if(diem.get(i) >= 6.5 && diem.get(i) <7.5)
				hocLuc.add("Kha");
			else if(diem.get(i) >= 7.5 && diem.get(i) <9)
				hocLuc.add("Gioi");
			else
				hocLuc.add("Xuat xac");
		}
		
	    for  ( int  i =  0 ; i <3 -  1 ; i ++) {  
	        for  ( int  j =  0 ; j <3 -  1  - i; j ++) {  
	            if  (diem.get(j) > diem.get(j+1)) {  
	                int diemTam = diem.get(j);  
	                diem.set(j, diem.get(j + 1)); 
	                diem.set(j + 1, diemTam);
	                String hoTenTam = hoTen.get(j);  
	                hoTen.set(j, hoTen.get(j + 1)); 
	                hoTen.set(j + 1, hoTenTam);
	                String hocLucTam = hocLuc.get(j);  
	                hocLuc.set(j, hocLuc.get(j + 1)); 
	                hocLuc.set(j + 1, hocLucTam);
	            }  
	        }  
	    }
	    
	    for(int i = 0; i < 3; i++) {
	    	System.out.print("Hoc sinh: " + hoTen.get(i) + " - Diem: " + diem.get(i) + " - Hoc luc: " + hocLuc.get(i) +"\n");
	    }
	}
}