
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Sartu a, b eta c balioa: ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        try {
            c = a / b;
        } catch (ArithmeticException e) {

            System.out.println("Akatsa: " + e.getMessage());
            return;
        }
        System.out.println("Emaitza:" + c);
    }
}
