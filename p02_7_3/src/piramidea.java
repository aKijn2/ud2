
public class piramidea {

    public static void main(String[] args) throws Exception {

        int altura = 5;
        int espazioa = altura - 1;
        int asteriscoa = 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espazioa; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscoa; j++) {
                System.out.print("*");
            }
            System.out.println();
            espazioa--;
            asteriscoa += 2;
        }
    }
}
