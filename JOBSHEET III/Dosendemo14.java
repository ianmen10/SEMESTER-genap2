
import java.util.Scanner;

public class Dosendemo14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        String kode, nama;
        boolean jenisKelamin;
        int usia;

        Dosen14[] arrayOfDosen = new Dosen14[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true = Wanita, false = Pria): ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia        : ");
            usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
            arrayOfDosen[i].tampilkanInfo();
        }

        System.out.println("\n=== Data Dosen ===");
        for (Dosen14 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        } 
    }
}
