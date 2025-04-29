public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS;

    Penilaian(Mahasiswa m, MataKuliah mk, double tugas, double uts, double uas) {
        mahasiswa = m;
        mataKuliah = mk;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    double hitungNilaiAkhir() {
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilNilai() {
        System.out.println("Nama Mahasiswa : " + mahasiswa.nama);
        System.out.println("Mata Kuliah    : " + mataKuliah.nama);
        System.out.println("Nilai Tugas    : " + nilaiTugas);
        System.out.println("Nilai UTS      : " + nilaiUTS);
        System.out.println("Nilai UAS      : " + nilaiUAS);
        System.out.println("Nilai Akhir    : " + hitungNilaiAkhir());
    }
}
    