import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList14 sll = new SingleLinkedList14();

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlah = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble(); sc.nextLine();

            Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
        }

    }
}
