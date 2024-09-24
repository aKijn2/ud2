package p0201_2Mailakoekuazio;

import java.util.Scanner;

public class p0201_2Mailakoekuazio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sartu a koefizientea: ");
        double a = scanner.nextDouble();

        System.out.print("Sartu b koefizientea: ");
        double b = scanner.nextDouble();

        System.out.print("Sartu c koefizientea: ");
        double c = scanner.nextDouble();

        double emaitza = b * b - 4 * a * c;

        // Ekuazioaren soluzioak kalkulatu.
        if (emaitza > 0) {
            double x1 = (-b + Math.sqrt(emaitza)) / (2 * a);
            double x2 = (-b - Math.sqrt(emaitza)) / (2 * a);

            System.out.println("Ekuazioaren soluzioak:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        // Ekuazioaren soluzio bakarra kalkulatu.
        } else if (emaitza == 0) {
            double x = -b / (2 * a);

            System.out.println("Ekuazioaren soluzio bakarra:");
            System.out.println("x = " + x);
            
        // Ekuazioak ez du soluziorik.
        } else {
            System.out.println("Ekuazioak ez du soluziorik.");
        }
    }
}
