public class Mahasiswa14 {  
        String nama;
        String nim;
        String kelas;
        double ipk;

        public Mahasiswa14(String string, String string2, String string3, double d) {
            //TODO Auto-generated constructor stub
        }
        void tampilkanInformasi() {
            System.out.println(" Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK: " + ipk);
            System.out.println("Kelas: " + kelas);
        }
        void uabhKelas(String KelasBaru) {
            kelas = KelasBaru;
        }
        void updateIpk(double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            } else {
                System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0.");
            }
        }
        String nilaiKerja() {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik ";
            } else if (ipk >= 3.0) {
                return "Kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
            }
        }
        public void cetakInfo() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'cetakInfo'");
        }
        public void tampil() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'tampil'");
        }
    }
