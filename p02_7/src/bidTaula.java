import java.util.Scanner;

public class bidTaula {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zein zenbaki biderkatu nahi duzu: ");
        int zenb = sc.nextInt();

        System.out.println(zenb + "-ren biderkaketa taula: ");
        System.out.println("*************");

        // Forumula zenb ren biderkete taula egiteko
        for (int i = 1; i <= 10; i++) {
            System.out.println(zenb + " * " + i + " = " + zenb * i);
        }
    }
}