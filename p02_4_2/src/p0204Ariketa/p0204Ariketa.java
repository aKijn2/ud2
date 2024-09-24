package p0204Ariketa;

import java.util.Scanner;

public class p0204Ariketa {

    enum SemaforoEgoera {
        BERDE, HORI, GORRI, ITZALITA, PIZTU_ITZALI
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SemaforoEgoera egoera = SemaforoEgoera.ITZALITA;

        // Semaforoaren egoera aldatu baldintza betetzen badu.
        while (true) {
            System.out.println("Sartu semaforoaren egoera (piztu, gorria, horia, berdea, itzali): ");
            String input = sc.next().toLowerCase();

            // Depende zein kasu daukagun semaforoaren egoera aldatuko da.
            switch (input) {
                case "piztu":
                    egoera = SemaforoEgoera.PIZTU_ITZALI;
                    System.out.println("Semaforoa piztuta dago.");
                    break;
                case "gorria":
                    egoera = SemaforoEgoera.GORRI;
                    System.out.println("Semaforoa gorria dago. Gelditu behar duzu.");
                    break;
                case "horia":
                    egoera = SemaforoEgoera.HORI;
                    System.out.println("Semaforoa hori dago. Prest egon behar duzu.");
                    break;
                case "berdea":
                    egoera = SemaforoEgoera.BERDE;
                    System.out.println("Semaforoa berde dago. Aurrera joan zaitezke.");
                    break;
                case "itzali":
                    egoera = SemaforoEgoera.ITZALITA;
                    System.out.println("Semaforoa itzalita dago.");
                    break;
                default:
                    System.out.println("Egoera okerra.");
                    break;
            }

            System.out.println("Beste egoera bat sartu nahi duzu? (bai/ez)");
            String erantzuna = sc.next().toLowerCase();

            // Kodea errepikatuko da ez bada "bai" erantzuna eman.
            if (erantzuna.equals("ez")) {
                break;
            }
        }

        sc.close();
    }
}
