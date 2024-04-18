package assignment4;

public class CopyArray {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = new int[3];
		try {
			System.arraycopy(arr1, 0, arr2, 0, arr1.length);
			System.out.println("array element copy succesfull");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("1st array");
			for (int i : arr1) {
				System.out.print(" " + i);
			}
			System.out.println("\n=================================");
			System.out.println("2st array");
			for (int i : arr2) {
				System.out.print(" " + i);
			}
		}
	}
}