package Java_dailyhomework;

import java.util.Scanner;

public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		if (k>0)

			System.out.println("Given number is positive:" +k);
		{
			float l = k / 2;
			float t;
			do {
				t = l;
				l = (t + (k / t)) / 2;
			}

			while ((t - l) != 0);

			int  i = (int) l;

			System.out.println("Square root of a number:" +i);

		}
	}

}
