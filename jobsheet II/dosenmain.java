public class dosenmain {
        public static void main(String[] args) {
            
            Dosen14 dosen1 = new Dosen14();
            dosen1.idDosen = "1002";
            dosen1.nama = "Ariq M.T";
            dosen1.statusAktif = true;
            dosen1.tahunBergabung = 2012;
            dosen1.bidangKeahlian = "Teknik Informatika";
    
           
            Dosen14 dosen2 = new Dosen14("1004", "Hanif M.T", true, 2010, "SistemInformasi");
            
            System.out.println("==================================================================");
            System.out.println("Informasi Dosen 1:");
            dosen1.tampilInformasi();
            dosen1.setStatusAktif(false);
            System.out.println("Masa Kerja Dosen 1: " + dosen1.hitungMasaKerja(2025) + " tahun");
            dosen1.ubahKeahlian("Rekayasa Perangkat Lunak");
            System.out.println("==================================================================");

            System.out.println("==================================================================");
            System.out.println("Informasi Dosen 2:");
            dosen2.tampilInformasi();
            dosen2.setStatusAktif(true);
            System.out.println("Masa Kerja Dosen 2: " + dosen2.hitungMasaKerja(2025) + " tahun");
            dosen2.ubahKeahlian("Teknik Komputer");
        }
    }