import java.util.Scanner;

public class QueueMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList14 queue = new QueueLinkedList14();
        int pilih;

        do {
            System.out.println("\n===== MENU ANTRIAN KEMAHASISWAAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\nInput Data Mahasiswa:");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble(); sc.nextLine();
                    Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + queue.getSize());
                    break;
                case 7:
                    queue.clearQueue();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}
