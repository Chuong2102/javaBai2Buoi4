package BaiTap2Buoi4;
import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b,c,d,e;
		int sum;
		double r;
		
		System.out.println("Nhap a, b, c, d, e");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		sum = a + b + c + d + e;
		r = sum/5;
		
		System.out.println("Sum: "+ sum + "and Average: "+r);
	}

}
