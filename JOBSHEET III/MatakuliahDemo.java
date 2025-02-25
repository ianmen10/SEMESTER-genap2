import java.util.Scanner;

public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlahMatakuliah = sc.nextInt();
        sc.nextLine();

        Matakuliah14[] arrayOfMatakuliah = new Matakuliah14[jumlahMatakuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah14();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n=== Data Matakuliah ===");
        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
        sc.close();
    }
}
