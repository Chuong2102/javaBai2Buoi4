package BaiTap2Buoi4;
import java.util.Scanner;

public class BaiTap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = "";
		Scanner input = new Scanner(System.in);
		
		c = input.next();
		
		if(c.equals("a") || c.equals("A") || c.equals("i") || c.equals("I") || c.equals("o") || c.equals("O") || c.equals("e") || c.equals("E"))
			System.out.print("Vowel");
		else
		{
			System.out.println("Consonant");
		}
	}

}
