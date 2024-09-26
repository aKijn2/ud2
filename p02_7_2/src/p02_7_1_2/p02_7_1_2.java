package p02_7_1_2;

import java.util.Scanner;

public class p02_7_1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int zenbakia = 1;

		if (zenbakia >= 1 && zenbakia <= 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("\n" + i + " taula ");
				for (int j = 1; j <= 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}


			}
		}
	}
}
