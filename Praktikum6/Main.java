package Praktikum6;

import java.util.Scanner;

class Dosen14 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen14(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
    }
}

class DataDosen {
    Dosen14[] dataDosen = new Dosen14[10];
    int idx = 0;

    void tambah(Dosen14 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("--------------------");
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen14 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen14 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSortDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen14 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDosen dataDosen = new DataDosen();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (usia tertua ke termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Jenis Kelamin: ");
                    String jenisKelamin = scanner.nextLine();
                    System.out.print("Usia: ");
                    int usia = scanner.nextInt();
                    scanner.nextLine(); 

                    Dosen14 dsn = new Dosen14(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dsn);
                    break;
                case 2:
                    dataDosen.tampil();
                    break;
                case 3:
                    dataDosen.sortingASC();
                    System.out.println("Data dosen setelah diurutkan (ASC):");
                    dataDosen.tampil();
                    break;
                case 4:
                    System.out.println("Pilih metode sorting:");
                    System.out.println("1. Selection Sort");
                    System.out.println("2. Insertion Sort");
                    int metode = scanner.nextInt();
                    scanner.nextLine(); 

                    if (metode == 1) {
                        dataDosen.sortingDSC();
                    } else if (metode == 2) {
                        dataDosen.insertionSortDSC();
                    } else {
                        System.out.println("Metode tidak valid");
                    }

                    System.out.println("Data dosen setelah diurutkan (DSC):");
                    dataDosen.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

    }
} 
    