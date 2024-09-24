package p0201Ifariketa;

import java.util.Scanner;

public class p0201Ifariketa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lehenengo zenbakia: ");
		int aldagaia = sc.nextInt();

		System.out.println("Bigarren zenbakia: ");
		int aldagaia2 = sc.nextInt();

		/*hiru baldintza ditugu lehenengoa da aldagai bat bestea baino andiagoa dela eta alderantziz 
		eta bi aldagaiak berdinak direla imprimatzeko funtzioa daukagu erantznaren arabera.*/
		if (aldagaia > aldagaia2) {
			System.out.println(aldagaia + " handiagoa da " + aldagaia2 + " baino.");
		} else if (aldagaia < aldagaia2) {
			System.out.println(aldagaia2 + " handiagoa da " + aldagaia + " baino.");
		} else {
			System.out.println(aldagaia + " eta " + aldagaia2 + " berdinak dira. ");
		}
	}

}
