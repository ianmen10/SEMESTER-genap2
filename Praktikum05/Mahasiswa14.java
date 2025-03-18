package Praktikum05;

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

class MahasiswaBerprestasi {
    Mahasiswa14 [] listMhs= new Mahasiswa14[5];
    int idx;

    void tambah(Mahasiswa14 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void  tampil () {
        for (Mahasiswa14 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------");
        }
    }
    void bubbleSort() {
        for (int i=0; i<listMhs.length-1; i++) {
            for (int j=1; j<listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa14 temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
    void SelectionSort() {
        for (int i=0; i<listMhs.length-1; i++) {
            int idxmin = i;
            for (int j=i+1; j<listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxmin].ipk) {
                    idxmin = j;
                }
            }
            Mahasiswa14 temp = listMhs[idxmin];
            listMhs[idxmin] = listMhs[i];
            listMhs[i] = temp;
        }
    }
    void insertionSort() {
        for (int i=1; i<listMhs.length; i++) {
            Mahasiswa14 temp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j-1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}

class MahasiswaDemo14 {
    public static void main(String[] args) {
        Mahasiswa14 m1 = new Mahasiswa14("123", "Ayu", "2A", 3.7);
        Mahasiswa14 m2 = new Mahasiswa14("124", "dika", "2A", 3.0);
        Mahasiswa14 m3 = new Mahasiswa14("125", "ila", "2A", 3.8);
        Mahasiswa14 m4 = new Mahasiswa14("126", "susi", "2A", 3.1);
        Mahasiswa14 m5 = new Mahasiswa14("127", "yayuk", "2A", 3.4);

        MahasiswaBerprestasi List = new MahasiswaBerprestasi();
        List.tambah(m1);
        List.tambah(m2);
        List.tambah(m3);
        List.tambah(m4);
        List.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum sorting: ");
        List.tampil();
        //System.out.println("Data Mahasiswa Setelah sorting berdasarkan IPK (DESC) :");
        //List.bubbleSort();
        //List.tampil();

        //System.out.println("Data yang sudah teurut menggunakan SELECTION SORT (ASC) :");
       //List.SelectionSort();
       // List.tampil();

        System.out.println("Data yang sudah teurut menggunakan INSERTION SORT (ASC) :");
        List.insertionSort();
        List.tampil();
    }
}
