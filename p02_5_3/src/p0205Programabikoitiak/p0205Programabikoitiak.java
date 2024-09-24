package p0205Programabikoitiak;

public class p0205Programabikoitiak {

	public static void main(String[] args) {

		int zenbakia = 2;

		// 2-50 arteko zenbaki bikoitiak inprimatuko ditu
		while (zenbakia <= 50) { 
			if (zenbakia % 2 == 0) { 
				System.out.println("Zenbaki bikoitiak: " + zenbakia);
			}
			zenbakia++; 
		}
	}
}
