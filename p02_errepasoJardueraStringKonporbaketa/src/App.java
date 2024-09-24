
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zerbait:");
        String testua = sc.nextLine();

        if (testua != null || !testua.isEmpty()) {
            System.out.println("Testua ez da hutsa.");
        } else {
            System.out.println("Testua hutsik dago.");

        }

        
    }
}
