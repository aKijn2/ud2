package P0206Forbegiztak1Ariketa;

public class P0206Forbegiztak1Ariketa {

    public static void main(String[] args) {

        int altuera = 4;

        /*
         * for begizta: altuera aldagaia erabiliz, altuera aldagaia baino txikiagoa
         * den bitartean, for begizta hau exekutatuko da.
         */
        for (int i = 1; i <= altuera; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
