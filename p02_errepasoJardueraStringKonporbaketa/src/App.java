
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zerbait:");
        String input = sc.nextLine();
        
        if (input.isEmpty()) {
            System.out.println("Testua hutsik dago.");
        } else if (input.matches("[0-9]+")) {
            System.out.println("Sartutakoa zenbakia da.");
        } else if (input.matches("[a-zA-Z]+")) {
            System.out.println("Sartutakoa testua da.");
        } else if (input.matches("[a-zA-Z0-9]+")) {
            System.out.println("Sartutakoa zenbaki eta testua da.");
        } else {
            System.out.println("Sartutakoak karaktere bereziak ditu.");
        }

        sc.close();
    }
}
