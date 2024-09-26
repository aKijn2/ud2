package errepasoJarduerak3Lehena;

import java.util.Scanner;

public class errepasoJarduerak3Lehena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zenbaki bat: ");
        int zenbakia = sc.nextInt();

        boolean lehena = zenbakiLehena(zenbakia);

        // Egiaztatu zenbakia lehena den eta mezu egokia inprimatu
        if (lehena) {
            System.out.println("Zenbakia lehena da."); // Inprimatu zenbakia lehena bada
        } else {
            System.out.println("Ez da lehena."); // Inprimatu zenbakia lehena ez bada
        }

        sc.close();
    }

    /**
     * Zenbakia lehena den egiaztatzen du.
     *
     * @param zenbakia Egiaztatu beharreko zenbakia.
     * @return true zenbakia lehena bada, false bestela.
     */
    public static boolean zenbakiLehena(int zenbakia) {
        if (zenbakia <= 1) {
            return false; // 1 edo gutxiago diren zenbakiak ez dira lehena
        }
        for (int i = 2; i * i <= zenbakia; i++) {
            if (zenbakia % i == 0) {
                return false; // Zenbakia 1 eta bere buruaz aparte beste zenbakiren batez zatigarria bada, ez da lehena
            }
        }
        return true; // Zenbakia lehena da
    }
}
