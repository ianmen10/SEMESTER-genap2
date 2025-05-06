public class MahasiswaKRS14 {
    String nim, nama;
    int semester;

    public MahasiswaKRS14(String nim, String nama, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
    }

    public void tampilkanData() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Semester : " + semester);
    }
}
