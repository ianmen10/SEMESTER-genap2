package quiz;

import java.util.Scanner;

public class CafeMethod14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        Cafe14[] daftarMenu = new Cafe14[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data menu ke-" + (i + 1) + ":");
            System.out.print("Nama Menu : ");
            String namaMenu = input.nextLine();
            System.out.print("Harga     : ");
            double harga = input.nextDouble();
            System.out.print("Stok      : ");
            int stok = input.nextInt();
            input.nextLine();

            daftarMenu[i] = new Cafe14(namaMenu, harga, stok);
        }

        System.out.println("\nDaftar Menu:");
        for (Cafe14 menu : daftarMenu) {
            menu.tampilkanMenu();
        }

        System.out.println("\nUpdate stok menu:");
        daftarMenu[0].updateStok(15);
        daftarMenu[0].tampilkanMenu();
        daftarMenu[1].updateStok(17);
        daftarMenu[1].tampilkanMenu();
        daftarMenu[2].updateStok(10);
        daftarMenu[2].tampilkanMenu();
        
    }
}