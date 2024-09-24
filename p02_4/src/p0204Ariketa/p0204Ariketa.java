package p0204Ariketa;

import java.util.Scanner;

public class p0204Ariketa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        char op;

        System.out.print("Sartu lehen zenbaki osoa: ");
        a = sc.nextInt();

        System.out.print("Sartu bigarren zenbaki osoa: ");
        b = sc.nextInt();

        System.out.print("Sartu eragilearen zeinua (+, -, *, /): ");
        op = sc.next().charAt(0);

        System.out.print("Emaitza : ");

        // eragilearen arabera, zenbakiak kalkulatzen ditu
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("akatsa");
                break;
        }
    }
}
