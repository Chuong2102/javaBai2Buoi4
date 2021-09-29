package BaiTap2Buoi4;
import java.util.Scanner;
import java.lang.Math;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year, month;
		int dayOfFeb = 0;
		boolean namNhuan = false;
		
		System.out.println("Nhap nam");
		year = input.nextInt();
		System.out.println("Nhap thang");
		month = input.nextInt();
		
		if(year%4 == 0) {
			dayOfFeb = 29;
			namNhuan = true;
		}
		else
			dayOfFeb = 28;
		//
		switch(month) {
		
		case 2: 
			System.out.print("February "+year+" has "+dayOfFeb+" days");
			break;
		case 1:
			System.out.print("Janury "+year+" has 31 days");
			break;
		case 3:
			System.out.print("March "+year+" has 31 days");
			break;
		case 4: 
			System.out.print("April "+year+" has 30 days");
			break;
		case 5: 
			System.out.print("May "+year+" has 31 days");
			break;
		case 6: 
			System.out.print("June "+year+" has 30 days");
			break;
		case 7: 
			System.out.print("July "+year+" has 31 days");
			break;
		case 8:
			System.out.print("August "+year+" has 31 days");
			break;
		case 9: 
			System.out.print("September "+year+" has 31 days");
			break;
		case 10: 
			System.out.print("November "+year+" has 30 days");
			break;
		case 11: 
			System.out.print("December "+year+" has 31 days");
			break;
		case 12: 
			System.out.print("May "+year+" has 31 days");
			break;
		}
		
	}

}
