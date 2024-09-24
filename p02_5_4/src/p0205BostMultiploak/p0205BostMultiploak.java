package p0205BostMultiploak;

public class p0205BostMultiploak {

    public static void main(String[] args) {

        int zenbakia = 1;

        // 1-100 arteko zenbaki guztiak inprimatuko ditu, 5-aren multiploak izan ezik
        while (zenbakia >= 1 && zenbakia <= 100) {
            if (zenbakia % 5 != 0) {
                System.out.println("Zenbakia: " + zenbakia);
            }
            zenbakia++;
        }
    }
}
