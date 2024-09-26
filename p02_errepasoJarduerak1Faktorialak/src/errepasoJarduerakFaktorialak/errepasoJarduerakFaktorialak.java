package errepasoJarduerakFaktorialak;

import java.util.Scanner;

public class errepasoJarduerakFaktorialak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double faktoriala;
        int zenbakia;

        System.out.println("Sartu zenbak bat: ");
        zenbakia = sc.nextInt();

        faktoriala = 1;

		// Faktoriala kalkulatzen duen for baten barruan faktoriala kalkulatzen du
		
        for (int i = zenbakia; i > 0; i--) {
            faktoriala = faktoriala * i;
        }

        System.out.print(zenbakia + "! = ");

        for (int i = zenbakia; i > 1; i--) {
            System.out.print(i + " * ");
        }

        System.out.println("1 = " + faktoriala);

    }
}
