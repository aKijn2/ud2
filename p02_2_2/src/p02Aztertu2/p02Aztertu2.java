package p02Aztertu2;

import java.util.Scanner;

public class p02Aztertu2 {

    public static void main(String[] args) {

        //Taila txikia 36 valorea du eta handiak 54 valorea du.
        final int TAILA_TXIKIA = 36;
        final int TAILA_HANDIA = 54;

        int taila, biltegia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zure taila");
        taila = sc.nextInt();

        System.out.println("Sartu biltegi zenbakia");
        biltegia = sc.nextInt();

        if (taila >= TAILA_TXIKIA && taila <= TAILA_HANDIA && biltegia == 1) {
            System.out.println("1. biltegian dago");

        } else if (taila >= TAILA_TXIKIA && taila <= TAILA_HANDIA && biltegia == 2) {
            System.out.println("2. biltegian dago");

        } else {
            System.out.println("Ez daukagu taila hori");
        }

        // Edozein biltegitan dagoen edo ez adierazi.
        if (taila >= TAILA_TXIKIA && taila <= TAILA_HANDIA && biltegia == 1 || taila >= TAILA_TXIKIA && taila <= TAILA_HANDIA && biltegia == 2) {
            System.out.println("Badaukagu taila");
        }
    }
}
