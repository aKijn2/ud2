package p0201Zenbakiakariketa;

import java.util.Scanner;

public class p0201Zenbakiakariketa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Idatzi zenbaki oso bat: ");
        int lehenzemb = sc.nextInt();

        // negativoa positivoa edo zero dela adieraziko du.
        if (lehenzemb > 0) {
            System.out.println("Positiboa da.");
        } else if (lehenzemb < 0) {
            System.out.println("Negatiboa da.");
        } else {
            System.out.println("Zero da.");
        }
    }
}
