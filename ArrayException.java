package assignment4;

import java.util.*;

public class ArrayException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		try {
			System.out.println("Enter the index position to find its position ");
			int position = sc.nextInt();
			System.out.println("Value for index is :" + arr[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of array size");
		} finally {
			sc.close();
		}
	}

}
