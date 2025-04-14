package Praktikum6;
import java.util.Scanner;

public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa14(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}

class MahasiswaBerprestasi14 {
    Mahasiswa14[] listMhs;
    int idx;

    MahasiswaBerprestasi14(int jumlahMahasiswa) {
        listMhs = new Mahasiswa14[jumlahMahasiswa];
        idx = 0;
    }

    void tambah(Mahasiswa14 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa14 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------");
        }
    }

    int sequentialSearch(double cari) {
        int posisi = -1;    
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi; 
    }

    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listMhs[mid].ipk == cari) {
                return mid;
            }
            if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid - 1);
            }
            return findBinarySearch(cari, mid + 1, right);
        }
        return -1;
    }

    void tampilkanPosisi(double ipk, int posisi) {
        if (posisi != -1) {
            System.out.println("Data mahasiswa dengan IPK: " + ipk + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("Data " + ipk + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double ipk, int posisi) {
        if (posisi != -1) {
            System.out.println("NIM\t: " + listMhs[posisi].nim);
            System.out.println("Nama\t: " + listMhs[posisi].nama);
            System.out.println("Kelas\t: " + listMhs[posisi].kelas);
            System.out.println("IPK\t: " + ipk);
        } else {
            System.out.println("Data " + ipk + " tidak ditemukan");
        }
    }
}

class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); 
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("-----------------------------");
            list.tambah(new Mahasiswa14(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-----------------------------");

        System.out.print("Masukkan IPK mahasiswa yang dicari (Sequential Search): ");
        double cari = sc.nextDouble();
        System.out.println("Menggunakan Sequential Search");
        int posisi = list.sequentialSearch(cari);
        list.tampilkanPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        System.out.println("-----------------------------");
        System.out.println("Pastikan data sudah terurut untuk Binary Search!");
        System.out.print("Masukkan IPK mahasiswa yang dicari (Binary Search): ");
        cari = sc.nextDouble();
        System.out.println("Menggunakan Binary Search");
        int posisiBinary = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilkanPosisi(cari, posisiBinary);
        list.tampilDataSearch(cari, posisiBinary);
    }
}