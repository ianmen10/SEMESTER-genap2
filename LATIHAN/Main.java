import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Membersihkan buffer
        
        // Membuat array of object Mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlah];

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM     : ");
            String nim = input.nextLine();
            System.out.print("Nama    : ");
            String nama = input.nextLine();
            System.out.print("Jurusan : ");
            String jurusan = input.nextLine();
            System.out.print("IPK     : ");
            double ipk = input.nextDouble();
            input.nextLine(); // Membersihkan buffer
            
            daftarMahasiswa[i] = new Mahasiswa(nim, nama, jurusan, ipk);
        }
        
        // Menampilkan daftar mahasiswa
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mhs : daftarMahasiswa) {
            mhs.tampilkanData();
        }

        // Mencari mahasiswa dengan IPK tertinggi
        Mahasiswa terbaik = daftarMahasiswa[0];
        for (int i = 1; i < jumlah; i++) {
            if (daftarMahasiswa[i].ipk > terbaik.ipk) {
                terbaik = daftarMahasiswa[i];
            }
        }
        
        // Menampilkan mahasiswa dengan IPK tertinggi
        System.out.println("\nMahasiswa dengan IPK tertinggi:");
        terbaik.tampilkanData();
    }
}
