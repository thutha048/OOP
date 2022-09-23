package check;

import java.util.Scanner;

import check.DanhSachSinhVien;
import check.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println("Select: ");
			System.out.println(
			  "1.	Add. \n"
			+ "2.	Display.\n"
			+ "3.	Empty or not.\n"
			+ "4.	Num of sinhvien..\n"
			+ "5.	Remove all.\n"
			+ "6.	Check exist. \n"
			+ "7.	Delete by masv.\n"
			+ "8.	Find by TEN. \n"
			+ "9.	List decrease.\n"
			+ "0.   Exit! ");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			if(luaChon==1) {
//				1.
				System.out.println("Masv: "); String maSinhVien = sc.nextLine();
				System.out.println("Hovaten: "); String hoVaTen = sc.nextLine();
				System.out.println("Namsinh: "); int namSinh = sc.nextInt();
				System.out.println("DiemTB: "); float diemTrungBinh = sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				
			}else if(luaChon==2) {
//				2.
				dssv.inDanhSachSinhVien();
				
			}else if(luaChon==3) {
//				3.
				System.out.println("Empty list: "+ dssv.kiemTraDanhSachRong());
			}else if(luaChon==4) {
//				4.
				System.out.println("Current num : "+ dssv.laySoLuongSinhVien());
			}else if(luaChon==5) {
//				5.	
				dssv.lamRongDanhSach();
			}else if(luaChon==6) {
//				6.	
				System.out.println("Masv: "); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Check sv exist: "+dssv.kiemTraTonTai(sv));
			}else if(luaChon==7) {
//				7.	
				System.out.println("Masv: "); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Delete sv: "+dssv.xoaSinhVien(sv));
			}else if(luaChon==8) {
//				8.	
				System.out.println("HoTen: "); String hoVaTen = sc.nextLine();
				System.out.println("Result find: ");
				dssv.timSinhVien(hoVaTen);
				
			}else if(luaChon==9) {
//				9.
				dssv.sapXepSinhVienGiamDanTheoDiem();
				dssv.inDanhSachSinhVien();
			}
		}while(luaChon!=0);
	}
}