import java.util.Scanner;

// Kelas Mahasiswa
class Mahasiswa {
    String nim;
    String nama;
    String jurusan;
    double ipk;

    // Konstruktor
    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Metode untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Jurusan: " + jurusan + ", IPK: " + ipk);
    }
}