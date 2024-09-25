package errepasojardueraStringfuntzioa;

import java.util.Scanner;

public class errepasojardueraStringfuntzioa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zenbaki bat: ");
        int zenbakia = sc.nextInt();

        // zenbakiaren balioa 10 eta 30 artean dagoen edo ez adierazten duen kondizioa.
        if (zenbakia >= 10 && zenbakia <= 30) {
            System.out.println("Zenbakia 10-30 tartean dago.");
        } else {
            System.out.println("Zenbakia 10-30 tartean ez dago.");
        }

        // zenbakiaren balioa 5-rekin zatigarria edo ez kondizioa.
        if (zenbakia % 5 == 0) {
            System.out.println("5-rekin zatigarria da.");
        } else if (zenbakia % 5 != 0) {
            System.out.println("5-rekin ez da zatigarria.");
        }

        System.out.println("Zein da zure izena: ");
        String izena = sc.next();

        System.out.println("Zure izena: " + izena + " da.");

        // izenaren luzera kalkulatzen duen funtzioa. Eta lehenengo lehetra imprimatzen du.
        for (int i = 0; i < izena.length(); i++) {
            String lehenLetra = izena.substring(i, i + 1);
            System.out.println("Zure izenaren lehenengo letra: " + lehenLetra);
            break;
        }

        // izenaren luzera kalkulatzen duen funtzioa. Eta azkeneko lehetra imprimatzen du.
        for (int i = izena.length() - 1; i >= 0; i--) {
            String azkenLetra = izena.substring(i, i + 1);
            System.out.println("Zure izenaren azkenengo letra: " + azkenLetra);
            break;
        }

        // Izena larriz eta xehez inprimatzen duen funtzioa.
        System.out.println("Zure izena letra larriz: " + izena.toUpperCase() + " da.");
        System.out.println("Zure izena letra xehez: " + izena.toLowerCase() + " da.");

        // Izena ñ duen edo ez adierazten duen funtzioa.
        if (izena.contains("Ñ") || izena.contains("ñ")) {
            System.out.println("Izenak ñ du.");
        } else {
            System.out.println("Izenak ez du ñ.");
        }
    }
}
