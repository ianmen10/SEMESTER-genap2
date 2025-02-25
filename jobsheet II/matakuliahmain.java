public class matakuliahmain {
    public static void main(String[] args) {
        MataKuliah matkul1 = new MataKuliah();

        matkul1.kodeMK ="3";
        matkul1.nama ="2";
        matkul1.sks =1;
        matkul1.jumlahJam =4;

        System.out.println("Informasi Mata Kuliah 1:");
        matkul1.tampilInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(3);
        System.out.println();
    }
}
