public class SistemAkademikFunction{
    Mahasiswa[] mahasiswa = {
        new Mahasiswa("22001", "Ali Rahman", "Struktur data"),
        new Mahasiswa("22001", "Ali Rahman", "Basis Data"),
        new Mahasiswa("22002", "Budi Santoso", "Struktur Data"),
        new Mahasiswa("22003", "Citra Dewi", "Basis Data"),
        new Mahasiswa("22003", "Citra Dewi", "Desain Web")
    };

    MataKuliah[] matakuliah = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Basis Data", 2),
        new MataKuliah("MK003", "Desain Web", 2)
    };

    Penilaian[] penilaian = {
        new Penilaian(mahasiswa[0], matakuliah[0], 80, 85, 90),
        new Penilaian(mahasiswa[1], matakuliah[0], 60, 75, 70),
        new Penilaian(mahasiswa[2], matakuliah[0], 75, 70, 80),
        new Penilaian(mahasiswa[3], matakuliah[0], 85,90, 95),
        new Penilaian(mahasiswa[4], matakuliah[0], 80, 90, 65)
    };
    

    void tampilkanMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : mahasiswa) {
            m.tampilInformasi();
            System.out.println("----------------");
        }
    }

    void tampilkanMataKuliah() {
        System.out.println("\nDaftar Mata Kuliah:");
        for (MataKuliah mk : matakuliah) {
            mk.tampilInfo();
            System.out.println("----------------");
        }
    }

    void tampilkanPenilaian() {
        System.out.println("\nData Penilaian Mahasiswa:");
        for (Penilaian p : penilaian) {
            p.tampilNilai();
            System.out.println("----------------");
        }
    }

    void urutkanMahasiswaBerdasarkanNilai() {
        for (int i = 0; i < penilaian.length - 1; i++) {
            for (int j = 0; j < penilaian.length - i - 1; j++) {
                if (penilaian[j].hitungNilaiAkhir() < penilaian[j + 1].hitungNilaiAkhir()) {
                    Penilaian tmp = penilaian[j];
                    penilaian[j] = penilaian[j + 1];
                    penilaian[j + 1] = tmp;
                }
            }
        }
    
        System.out.println("\nData Penilaian (Urut Nilai Akhir DESC):");
        tampilkanPenilaian();
    }

    void cariMahasiswaBerdasarkanNIM(String nim) {
        boolean ditemukan = false;
        for (Mahasiswa m : mahasiswa) {
            if (m.nim.equalsIgnoreCase(nim)) {
                System.out.println("Data Mahasiswa Ditemukan:");
                m.tampilInformasi();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }
}