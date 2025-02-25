public class Dosen14 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    public boolean jenisKelamin;
    public int usia;
    
    public Dosen14(String kode, String nama2, boolean jenisKelamin, int usia) {
    }
    
       
    public Dosen14(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    public void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("==================================================================");
    }
    
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif dosen telah diubah menjadi: " + statusAktif);
    }
    
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }
    
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen telah diubah menjadi: " + bidangKeahlian);
    }


    public void tampilkanInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilkanInfo'");
    }
}

