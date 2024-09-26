public class piramidea {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        for (int i = 1; i <= rows; i++) {
            // utsuneak imp
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // izarrak imprimatuko ditu
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // mugitu hurrengo lerrora
            System.out.println();
        }
    }
}