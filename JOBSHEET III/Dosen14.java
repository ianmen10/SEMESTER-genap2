public class Dosen14 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen14 (String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;

    } 
    public void tampilkanInfo() {
        System.out.println("Kode    : " + kode);
        System.out.println("Nama    : " + nama);
        System.out.println("Gender  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia    : " + usia);
        System.out.println("------------------------------------");
    }
}