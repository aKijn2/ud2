package p02_7_1;

import java.util.Scanner;

public class p02_7_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Sartu zenbaki bat: ");
        int bat = sc.nextInt();
        
        System.out.println(bat + " taula ");
        System.out.println("");
        
        if (bat < 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(bat + " x " + i + " = " + (bat * i));
            }        }
    }
}
