package p02Aztertu1;

import java.util.*;

public class p02Aztertu1 {

    public static void main(String[] args) {

        //Taila txikia 36 valorea du eta handiak 54 valorea du.
        final int TAILA_TXIKIA = 36;
        final int TAILA_HANDIA = 54;

        int taila;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zure taila");
        taila = sc.nextInt();

        /*Taila handiagoa edo berdin baldin bada 36 baino eta txikiagoa baldin bada 54 baino
		Taila hori badugu baino tarte hortatik ateratzen baldin bada taila hori ez dugu.*/
        if (taila >= TAILA_TXIKIA && taila <= TAILA_HANDIA) {
            System.out.println("Badugu taila hori"); 
        }else {
            System.out.println("Ez daukagu taila hori");
        }
    }
}
