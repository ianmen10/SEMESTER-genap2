package quiz;

public class Cafe14 {

    String namaMenu;
    double harga;
    int stok;

    public Cafe14(String namaMenu, double harga, int stok) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanMenu() {
        System.out.println("Menu: " + namaMenu + ", Harga: " + harga + ", Stok: " + stok);
    }

    public void updateStok(int jumlah) {
        this.stok += jumlah;
    }
}

