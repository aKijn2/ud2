package ariketa;

import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zenbaki bat: ");

        boolean zenbakiArmstrong = false;
        int zenb = sc.nextInt();

        // zenbakiaren digituak lortzeko formula
        int lehenDig = zenb / 100;
        int bigarrenDig = (zenb / 10) % 10;
        int hirugarrenDig = zenb % 10;

        // jakiteko armstrong zenbakia den edo ez. Ateratzen den zenbakia koinziditzen badu true hitzuliko du.
        if (Math.pow(lehenDig, 3) + Math.pow(bigarrenDig, 3) + Math.pow(hirugarrenDig, 3) == zenb) {
            zenbakiArmstrong = true;
            System.out.println(zenbakiArmstrong);
        } else {
            zenbakiArmstrong = false;
            System.out.println(zenbakiArmstrong);
        }
    }
}
