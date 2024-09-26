package errepasoJarduerak4Lehena;

import java.util.Scanner;

public class errepasoJarduerak4Lehena {

    /**
     * Programa honen helburua 1etik 2500era bitarteko zenbaki lehenak
     * inprimatzea da.
     *
     * @param args Programa exekutatzeko argumentuak.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zenbaki lehenak:");

        // 1etik 2500era bitarteko zenbakiak iteratzen dira
        for (int i = 1; i <= 2500; i++) {
            // Zenbakia lehena den egiaztatzen da
            if (zenbakiLehena(i)) {
                // Zenbakia lehena bada, inprimatzen da
                System.out.print(i + ", ");
            }
        }

        System.out.println();

        sc.close();
    }

    /**
     * Zenbaki bat lehen den edo ez egiaztatzen duen metodoa.
     *
     * @param zenbakia Egiaztatu beharreko zenbakia.
     * @return true zenbakia lehena bada, false bestela.
     */
    public static boolean zenbakiLehena(int zenbakia) {
        // Zenbakia 1 edo txikiagoa bada, ez da lehena
        if (zenbakia <= 1) {
            return false;
        }
        // Zenbakia beste zenbakiren batez zatigarria den edo ez egiaztatzen da
        for (int i = 2; i * i <= zenbakia; i++) {
            if (zenbakia % i == 0) {
                return false; // Zatigarria bada, ez da lehena
            }
        }
        // Zenbakia lehen bada, true itzultzen da
        return true;
    }
}
