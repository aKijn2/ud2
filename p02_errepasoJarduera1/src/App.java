
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hausazko zenbakiak: ");

        // dowhilek egingo duena izango da prezesua errepikatu erantzuna b ez izan arte.
        do {
            int zenb = 0, zenbBi = 0;

            // forrek egingo duena izango da zenbakiak sortu 1 etik 100-ra aleatorio math random erabiliz.
            for (int i = 0; i < 1; i++) {
                zenb = (int) (Math.random() * 100);
                zenbBi = (int) (Math.random() * 100);

                System.out.println(zenb + " eta " + zenbBi);
                System.out.println("Idatzi karaktere bat: (+, -, *, /)");

                String karakterea = sc.next();

                // depende zein karaktere erabiltzen dugun kasu bat beteko du bestela errorea imprimatuko du.
                switch (karakterea) {
                    case "+":
                        System.out.println(zenb + zenbBi);
                        break;
                    case "-":
                        System.out.println(zenb - zenbBi);
                        break;
                    case "*":
                        System.out.println(zenb * zenbBi);
                        break;
                    case "/":
                        if (zenbBi != 0) {
                            System.out.println(zenb / zenbBi);
                        } else {
                            System.out.println("Errorea: zeroz zatitzea ezinezkoa da");
                        }
                        break;
                    default:
                        System.out.println("Ez da karaktere egokia");
                }
            }
            System.out.println("Beste bat egin nahi duzu? (b) edo (e)");
        } while (sc.next().equals("b"));
        sc.close();
    }
}
