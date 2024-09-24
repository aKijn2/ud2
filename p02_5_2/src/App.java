
public class App {

    public static void main(String[] args) throws Exception {

        int zenbakia = 0;

        // while eta do-while erabiliz, zenbakia 100 baino txikiagoa denean, "Pozik geratzen naiz programak funtzionatzen duenean" inprimatuko du.
        while (zenbakia < 100) {
            System.out.println("While erabiliz:");
            System.out.println("Pozik geratzen naiz programak funtzionatzen duenean");
            zenbakia++;
        }
        do {
            System.out.println("Do-While erabiliz:");
            System.out.println("Pozik geratzen naiz programak funtzionatzen duenean");
            zenbakia++;
        } while (zenbakia < 100);
    }
}
