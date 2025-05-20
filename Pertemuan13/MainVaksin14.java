import java.util.Scanner;

public class MainVaksin14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueVaksin14 qv = new QueueVaksin14();
        int pilih;
        do {
            System.out.println("\n===============================");
            System.out.println("PENGOLAHAN DATA VAKSIN");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Daftar Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Buang newline

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    qv.enqueue(nama);
                    break;
                case 2:
                    qv.dequeue();
                    break;
                case 3:
                    qv.print();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 4);
    }
}
