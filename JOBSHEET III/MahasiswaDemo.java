
public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa14[] arrayOfMahasiswa14s = new Mahasiswa14[3];

        arrayOfMahasiswa14s[0] = new Mahasiswa14();
        arrayOfMahasiswa14s[0].nim = "244107060033";
        arrayOfMahasiswa14s[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa14s[0].kelas = "SIB-1E";
        arrayOfMahasiswa14s[0].ipk = (float) 3.75;

        arrayOfMahasiswa14s[1] = new Mahasiswa14();
        arrayOfMahasiswa14s[1].nim = "2341720172";
        arrayOfMahasiswa14s[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa14s[1].kelas = "TI-2A";
        arrayOfMahasiswa14s[1].ipk = (float) 3.36;

        arrayOfMahasiswa14s[2] = new Mahasiswa14();
        arrayOfMahasiswa14s[2].nim = "244107023006";
        arrayOfMahasiswa14s[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa14s[2].kelas = "TI-2E";
        arrayOfMahasiswa14s[2].ipk = (float) 3.8;

        System.out.println("NIM    : " + arrayOfMahasiswa14s[0].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa14s[0].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa14s[0].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa14s[0].ipk);
        System.out.println("------------------------------------");

        System.out.println("NIM    : " + arrayOfMahasiswa14s[1].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa14s[1].nama); 
        System.out.println("Kelas  : " + arrayOfMahasiswa14s[1].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa14s[1].ipk);
        System.out.println("------------------------------------");

        System.out.println("NIM    : " + arrayOfMahasiswa14s[2].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa14s[2].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa14s[2].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa14s[2].ipk);
        System.out.println("------------------------------------");
    }
}