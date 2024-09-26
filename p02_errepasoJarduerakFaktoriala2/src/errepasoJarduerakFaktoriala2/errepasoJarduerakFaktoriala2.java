package errepasoJarduerakFaktoriala2;

import java.util.Scanner;

public class errepasoJarduerakFaktoriala2 {

    /**
     * Programa honek erabiltzaileari zenbaki bat sartzeko eskatzen dio eta
     * horren faktoriala kalkulatzen du. Prozesua 5 aldiz errepikatzen da.
     *
     * @param args Programa exekutatzeko argumentuak.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Iterazioen zenbatzailea, gehienez 5 aldiz eskatuko da zenbakia
        int biltegia = 0;

        // 5 aldiz errepikatzeko buzkla
        while (biltegia < 5) {

            // Faktorialaren emaitza gordetzeko aldagaia
            double faktoriala;
            int zenbakia;

            System.out.println("Sartu zenbaki bat: ");
            zenbakia = sc.nextInt();

            // Faktoriala kalkulatzeko hasierako balioa (1)
            faktoriala = 1;

            // Zenbakiaren faktoriala kalkulatzeko buzkla
            for (int i = zenbakia; i > 0; i--) {
                faktoriala = faktoriala * i;
            }

            System.out.print(zenbakia + "! = ");

            // Faktoriala kalkulatzen den moduan faktoreak inprimatzeko
            for (int i = zenbakia; i > 1; i--) {
                System.out.print(i + " * ");
            }

            System.out.println("1 = " + faktoriala);

            // Iterazioen zenbatzailea handitu (gehienez 5 aldiz)
            biltegia++;
        }

        // Scanner objektua itxi
        sc.close();
    }
}
