package casemethod;
import java.util.Scanner;
public class SPBUMain {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        SPBU data = new SPBU();
        boolean keyLoop = true;
        do {
            System.out.println("----- Menu SPBU -----");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antian");
            System.out.println("3. Cek Jumlah Antrian");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            int menu = in.nextInt();    
            in.nextLine();

            switch (menu) {
            case 1:
            System.out.print("Masukkan Plat Nomor: ");
            String plat=in.nextLine();
            System.out.print("Masukkan Jenis Kendaraan: ");
            String tipe=in.nextLine();
            System.out.print("Masukkan Merk: ");
            String merk=in.nextLine();

            Kendaraan data1=new Kendaraan(plat, tipe, merk);
            data.addLast(data1);
            break;
            case 2: 
            data.TampilAntrian();
            break;
            case 3:
            int jmlh = data.cekSize();
            System.out.println(">> Jumlah kendaraan dalam antrian: " + jmlh);
            break;
            case 4:
            Kendaraan urut1 = data.getFirst();
            if (urut1 == null) {
                System.out.println("Antrian masih kosong, tidak ada kendaraan yang bisa dilayani.");
                break;
            }
            System.out.println("Petugas Melayani "+urut1.platNo);
            System.out.print("Masukkan jenis BBM: ");
            String namaBBM = in.nextLine();
            System.out.print("Masukkan Harga per liter: ");
            double hargaPerLt = in.nextDouble();
            BBM bbm = new BBM(namaBBM, hargaPerLt);
            System.out.print("Masukkan Jumlah liter: ");
            double liter = in.nextInt();
            TransaksiPengisian mobil = new TransaksiPengisian(urut1, bbm, liter,0);
            data.layaniKendaraan(mobil);
                break;
            case 5:
            data.tampilRiwayat();
            break;
            case 0:
            System.out.println("Terima Kasih.");
            keyLoop = false;
            break;
            default:
            System.out.println("Pilihan tidak valid, silakan coba lagi.");
            break;
            }
        } while (keyLoop);
        in.close();
    }   
}
