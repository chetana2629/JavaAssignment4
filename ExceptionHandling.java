package assignment4;

import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		try {
			String num = sc.next();
			int num1 = Integer.parseInt(num);
			int su = num1 * num1;
			System.out.println("Square value of given number:" + su);
		} catch (Exception e) {
			System.out.println("Enter valid input");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
