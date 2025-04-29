import java.util.Scanner;

public class SuratIzinMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat14 stack = new StackSurat14(10);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    stack.push(new Surat(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat izin diterima.");
                    break;
                case 2:
                    Surat diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat diproses untuk: " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scan.nextLine();
                    if (stack.cariSurat(cariNama)) {
                        System.out.println("Surat ditemukan.");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
