package p0207ZenbakibatLehena6;

import java.util.Scanner;

public class p0207ZenbakibatLehena6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Idatzi zenbaki bat: ");

		int zenbakia = sc.nextInt();

		sc.close();

		int invertido = 0, resto;

		if (lehenaDa(zenbakia)) {
			System.out.println(zenbakia + " Lehena da.");
		} else {
			System.out.println(zenbakia + " Ez da lehena.");
		}
	}

	public static boolean lehenaDa(int zenbakia) {
		if (zenbakia <= 1) return false;
		for (int i = 2; i * i <= zenbakia; i++) {
			if (zenbakia % i == 0) return false;
		} 
		int invertido = 0;
		while (zenbakia > 0) {
			int resto = zenbakia % 10;
			invertido = invertido * 10 + resto;
			zenbakia /= 10;
		}
		System.out.println("Zenbakia alderantziz: " + invertido);
		return true;
	}
}
