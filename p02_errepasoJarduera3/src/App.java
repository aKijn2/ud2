
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Idatzi esaldi bat:");
        String esaldi = sc.nextLine();

        String esaldiInbertsitu = "";

        // For begizta esaldiaren azken karakteretik hasita lehenengo karakterera arte errepikatzen du
        for (int i = esaldi.length() - 1; i >= 0; i--) {
            // esaldiaren i posizioaren karakterea esInb aldagaian gehitzen da eta ondoren hori imprimatzen dugu.
            esaldiInbertsitu += esaldi.substring(i, i + 1);
        }

        // Esaldia inbertsitu imprimatzen
        System.out.println(esaldiInbertsitu);
    }
}
