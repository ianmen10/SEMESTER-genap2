import java.util.Scanner;

public class Platnomor14 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] kota = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", 
                          "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);
        scanner.close();
        
 
        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.println("Kota untuk plat " + inputKode + " adalah " + kota[i]);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
