
import java.util.Scanner;

public class App {

    /**
     * 100etik 1000era arteko begizta bat exekutatzen du eta zenbaki bakoitza
     * egiaztatzen du 3, 5 edo bien multiploa den ikusteko. Zenbakiak
     * inprimatzen ditu kondizio hauek betetzen dituztenak eta bakoitzean zenbat
     * zenbaki erortzen diren zenbatzen kategoria.
     */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int biMultiploa = 0;
        int bostMultiploa = 0;
        int biEtaBostMultiploa = 0;

        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Bi eta Bost Multiploa: " + i);
                biEtaBostMultiploa++;
            } else if (i % 3 == 0) {
                System.out.println("Bi Multiploa: " + i);
                biMultiploa++;
            } else if (i % 5 == 0) {
                System.out.println("Bost Multiploa: " + i);
                bostMultiploa++;
            }
        }
    }
}
