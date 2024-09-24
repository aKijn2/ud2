package errepasoJardueraknotak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class errepasoJardueraknotak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> gaindituak = new ArrayList<>();
        List<String> gaindituEz = new ArrayList<>();

        // loop bat non izena sartzeko eskatzen digu erabiltzaileak "Amaitu" sartu arte.
        while (true) {
            System.out.println("Sartu zure izena: ");
            String izena = sc.next();
            if (izena.equalsIgnoreCase("Amaitu")) {
                break;
            }

            System.out.println("Sartu zure lanaren nota: ");
            int lanarenNota = sc.nextInt();

            System.out.println("Sartu zure proiektuaren nota: ");
            int proiektuarenNota = sc.nextInt();

            System.out.println("Sartu zure azterketaren nota: ");
            int azterketarenNota = sc.nextInt();

            // 3 noten batazbestekoa kalkulatzen dugu eta emaitza inprimatzen dugu.
            double batazBestekoa = (lanarenNota + proiektuarenNota + azterketarenNota) / 3.0;
            System.out.println("3 noten batazbestekoa: " + batazBestekoa);

            // baldintz betetzen badu, mezu egokia inprimatzen dugu eta izena gaindituak edo gaindituEz listan gehitzen dugu.
            if (batazBestekoa >= 0 && batazBestekoa <= 4) {
                System.out.println("Nahikoara ez zara iritxi.");
                gaindituEz.add(izena);
            } else if (batazBestekoa == 5) {
                System.out.println("Nahikoa duzu.");
                gaindituak.add(izena);
            } else if (batazBestekoa >= 5 && batazBestekoa <= 7) {
                System.out.println("Ongi bat duzu.");
                gaindituak.add(izena);
            } else if (batazBestekoa >= 8 && batazBestekoa <= 9) {
                System.out.println("Oso ongi bat duzu.");
                gaindituak.add(izena);
            } else if (batazBestekoa == 10) {
                System.out.println("Bikain bat atera duzu.");
                gaindituak.add(izena);
            }
        }

        // gaindituak eta gaindituEz listak inprimatzen ditugu.
        System.out.println("Aprobatu duten ikasleak: " + gaindituak);
        System.out.println("Aprobatu ez uten ikasleak: " + gaindituEz);
    }

}
