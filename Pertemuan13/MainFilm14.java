import java.util.Scanner;

public class MainFilm14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListFilm14 filmList = new DoubleLinkedListFilm14();

        int pilihan;
        do {
            System.out.println("\n=== MENU FILM ===");
            System.out.println("1. Tambah Film");
            System.out.println("2. Cetak Daftar Film");
            System.out.println("3. Cari Film berdasarkan ID");
            System.out.println("4. Urutkan berdasarkan Rating (Descending)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();
                    Film14 film = new Film14(id, judul, rating);
                    filmList.addLast(film);
                    break;
                case 2:
                    filmList.print();
                    break;
                case 3:
                    System.out.print("Masukkan ID yang dicari: ");
                    int cari = sc.nextInt();
                    filmList.searchById(cari);
                    break;
                case 4:
                    filmList.sortDescending();
                    filmList.print();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
