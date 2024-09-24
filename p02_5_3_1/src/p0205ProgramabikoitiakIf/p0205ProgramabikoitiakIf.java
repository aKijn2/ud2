package p0205ProgramabikoitiakIf;

public class p0205ProgramabikoitiakIf {

    public static void main(String[] args) {
        
        int zenbakia;
        
        System.out.print("Zenbaki bikoitiak: ");
        
        // 2-50 arteko zenbaki bikoitiak inprimatuko ditu
        for (zenbakia = 2; zenbakia <= 50; zenbakia++) { 
            if (zenbakia % 2 == 0) { 
                System.out.print(zenbakia + ", ");
            }
        }
    }
}
