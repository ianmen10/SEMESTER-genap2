import java.util.Scanner;

public class MainKRS14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS14 antrian = new AntrianKRS14(10); 
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses Antrian Mahasiswa");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Semester: ");
                    int semester = sc.nextInt();
                    sc.nextLine(); 
                    MahasiswaKRS14 m1 = new MahasiswaKRS14(nim, nama, semester);
                    antrian.enqueue(m1);
                    break;

                case 2:
                    MahasiswaKRS14 m2 = antrian.dequeue();
                    if (m2 != null) {
                        System.out.println("Mahasiswa diproses untuk KRS:");
                        m2.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.lihatTerbelakang();
                    break;

                case 5:
                    antrian.tampilkanAntrian();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.jumlahAntrian());
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }
}
