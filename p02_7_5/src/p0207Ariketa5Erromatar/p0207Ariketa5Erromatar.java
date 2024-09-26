package p0207Ariketa5Erromatar;

import java.util.Scanner;

public class p0207Ariketa5Erromatar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decimal = scanner.nextInt(); // Cambia este valor al número decimal que desees convertir
		String roman = convertToRoman(decimal);
		System.out.println(decimal + " en números romanos es: " + roman);
	}

	public static String convertToRoman(int num) {
		if (num < 1 || num > 3999) {
			return "Número fuera de rango (1-3999)";
		}

		String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] miles = {"", "M", "MM", "MMM"};

		// Construir la representación en números romanos
		String unidadesRomanas = unidades[num % 10];
		String decenasRomanas = decenas[(num / 10) % 10];
		String centenasRomanas = centenas[(num / 100) % 10];
		String milesRomanas = miles[(num / 1000) % 10];

		return milesRomanas + centenasRomanas + decenasRomanas + unidadesRomanas;
	}
}