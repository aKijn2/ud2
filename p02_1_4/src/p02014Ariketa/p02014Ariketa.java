package p02014Ariketa;

import java.util.Scanner;

public class p02014Ariketa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zein da zure nota: ");

        int nota = sc.nextInt();

        // Nota bakoitzak bere adierazpena. 
        if (nota == 1 || nota == 2 || nota == 3) {
            System.out.println("Nota eskasa duzu!");

        } else if (nota == 4) {
            System.out.println("Nahikoa atera duzu.");

        } else if (nota == 5 || nota == 6) {
            System.out.println("Ondo atera duzu.");

        } else if (nota == 7 || nota == 8 || nota == 9) {
            System.out.println("Oso ondo atera duzu.");

        } else if (nota == 5 || nota == 10) {
            System.out.println("Bikain bat duzu.");
        }
    }
}
