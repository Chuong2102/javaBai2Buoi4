package BaiTap2Buoi4;
import java.util.Scanner;
public class BaiTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int year;
		System.out.println("Nhap nam");
		year = input.nextInt();
		
		if(year%4 == 0) {
			System.out.println(year +"is a leap year");
		}
		else
			System.out.println(year +"is not a leap year");
		//
	}

}
