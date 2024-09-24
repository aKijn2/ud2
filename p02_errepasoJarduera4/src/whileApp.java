
import java.util.Scanner;

public class whileApp {

    /**
     * While erabiliz 100etik 1000era arteko begizta bat exekutatzen du eta
     * zenbaki bakoitza egiaztatzen du 3, 5 edo bien multiploa den ikusteko.
     * Zenbakiak inprimatzen ditu kondizio hauek betetzen dituztenak eta
     * bakoitzean zenbat zenbaki erortzen diren zenbatzen kategoria.
     */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int biMultiploa = 0;
        int bostMultiploa = 0;

        while (true) {
            int i = sc.nextInt();
            if (i == 0) {
                break;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Bi eta Bost Multiploa: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Bi Multiploa: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Bost Multiploa: " + i);
            }

        }
    }
}
