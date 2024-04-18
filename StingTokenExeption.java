package assignment4;

import java.util.StringTokenizer;

public class StingTokenExeption {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello Chetana");
		try {
			String token1 = st.nextToken();
			System.out.println(token1);
			String token2 = st.nextToken();
			System.out.println(token2);
			String token3 = st.nextToken();
			System.out.println(token3);
//				while (st.hasMoreElements()) {
//					System.out.println(st.nextToken());
//				}
		} catch (Exception e) {
			System.out.println("There is no addtion token to show");
		}
	}

}
