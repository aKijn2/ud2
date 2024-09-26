package p02_7_1_2;

import java.util.Scanner;

public class p02_7_1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int zenbakia1, zenbakia2;

		do {
			System.out.println("Sartu zenbaki bat: ");
			zenbakia1 = sc.nextInt();
			System.out.println("Sartu zenbaki bat berriro: ");
			zenbakia2 = sc.nextInt();

			if (zenbakia1 != zenbakia2) {
				System.out.println("Zenbakia 1etik 10era bitartera dago sartu berriro zenbakia: ");
				System.out.println("");
			}
		} while (zenbakia1 != zenbakia2);

		System.out.println(zenbakia1 + " Taula:");
		
		int i = 1;
		
		do {
			System.out.println(zenbakia1 + " x " + i + " = " + (zenbakia1 * i));
			i++;
		} while (i <= 10);
	}
}
