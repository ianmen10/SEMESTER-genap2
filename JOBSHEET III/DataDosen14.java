public class DataDosen14 {
        public static void dataSemuaDosen(Dosen14[] arrayOfDosen) {
            System.out.println("\n=== Data Semua Dosen ===");
            for (Dosen14 dosen : arrayOfDosen) {
                dosen.tampilkanInfo();
            }
        }

        public static void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
            int jumlahPria = 0;
            int jumlahWanita = 0;
    
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.jenisKelamin) {
                    jumlahPria++;
                } else {
                    jumlahWanita++;
                }
            }
    
            System.out.println("\nJumlah Dosen:");
            System.out.println("Pria   : " + jumlahPria);
            System.out.println("Wanita : " + jumlahWanita);
        }
    
        public static void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
            int totalUsiaPria = 0, totalUsiaWanita = 0;
            int jumlahPria = 0, jumlahWanita = 0;
    
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.jenisKelamin) {
                    totalUsiaPria += dosen.usia;
                    jumlahPria++;
                } else {
                    totalUsiaWanita += dosen.usia;
                    jumlahWanita++;
                }
            }
    
            double rataUsiaPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
            double rataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;
    
            System.out.println("\nRata-rata Usia:");
            System.out.println("Pria   : " + rataUsiaPria);
            System.out.println("Wanita : " + rataUsiaWanita);
        }

        public static void infoDosenPalingTua(Dosen14[] arrayOfDosen) {
            if (arrayOfDosen.length == 0) return;
    
            Dosen14 dosenTertua = arrayOfDosen[0];
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.usia > dosenTertua.usia) {
                    dosenTertua = dosen;
                }
            }
    
            System.out.println("\n=== Dosen Paling Tua ===");
            dosenTertua.tampilkanInfo();
        }
    
        public static void infoDosenPalingMuda(Dosen14[] arrayOfDosen) {
            if (arrayOfDosen.length == 0) return;
    
            Dosen14 dosenTermuda = arrayOfDosen[0];
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.usia < dosenTermuda.usia) {
                    dosenTermuda = dosen;
                }
            }
    
            System.out.println("\n=== Dosen Paling Muda ===");
            dosenTermuda.tampilkanInfo();
        }
    }
