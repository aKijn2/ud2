package p0207Ariketa4;

import java.util.Random;

public class p0207Ariketa4 {

	public static void main(String[] args) {

		System.out.println("Zenbaki aleatorioa 100/200 tartean: ");
		
		Random ausazkoa= new Random ();
		
		int balorea = ausazkoa.nextInt (100,200);
		
		System.out.println(balorea);
		System.out.println("");

		if (balorea % 2 == 0) {
			System.out.println(balorea + " zenbakia bikoitia da.");
		} else if (balorea % 1 == 0) {
			System.out.println(balorea + " zenbakia bakoitia da.");
		}
	}

}
