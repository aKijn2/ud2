
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Idatzi esaldi bat:");
            String esaldi = sc.nextLine();

            int kop = 0;

            // For baten bidez, esaldiaren karaktere kopurua kalkulatu
            for (int i = 0; i < esaldi.length(); i++) {
                kop++;
            }

            // Imprimatuko digu esaldia eta zenbat karaktere dituen esango digu.
            System.out.println(esaldi + " " + kop + " karaktere ditu.");

            System.out.println("Jarraitu nahi duzu? (b/e)");
            String erantzuna = sc.nextLine();

            // Kodea errepikatuko digu idazteko esaldi bat erantzuna e izan arte.
            if (erantzuna.equals("e")) {
                break;
            }
        } while (true);
    }
}
