import java.util.Scanner;  
class MahasiswaDemo14 {
   public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        StackTugasMahasiswa14 stack = new StackTugasMahasiswa14(5);
        MahasiswaDemo14 demo = new MahasiswaDemo14();
        demo.menu(Scan, stack);
    }

    public void menu(Scanner Scan, StackTugasMahasiswa14 stack) {
            int pilih;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Mengumpulkan Tugas");
                System.out.println("2. Menilai Tugas");
                System.out.println("3. Melihat Tugas");
                System.out.println("4. Melihat Daftar Tugas");
                System.out.println("5. Melihat Tugas Terbawah");
                System.out.println("6. Menghitung Jumlah Tugas");
                System.out.print("Pilih: ");
                pilih = Scan.nextInt();
                Scan.nextLine(); 
                switch (pilih) {
                    case 1:
                        System.out.println("Nama:");
                        String nama = Scan.nextLine();
                        System.out.println("NIM:");
                        String nim = Scan.nextLine();
                        System.out.println("Kelas:");
                        String kelas = Scan.nextLine();
                        Mahasiswa14 mhs = new Mahasiswa14(nama, nim, kelas);
                        stack.push(mhs);
                        System.out.printf("Tugas %s berhasil dikumpulkan\n" , mhs.nama);
                        break;
                    case 2:
                        if (!stack.isEmpty()) { // Tambahkan pengecekan
                            Mahasiswa14 dinilai = stack.pop();
                            System.out.println("Menilai tugas dari " + dinilai.nama);
                            System.out.println("Masukkan nilai (0-100):");
                            int nilai = Scan.nextInt();
                            dinilai.tugasDinilai(nilai);
                            System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        } else {
                            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
                        }
                        break;
                    case 3:
                        if (!stack.isEmpty()) { // Tambahkan pengecekan
                            Mahasiswa14 lihat = stack.peek();
                            System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                        } else {
                            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
                        }
                        break;
                    case 4:
                        System.out.println("Daftar Semua Tugas:");
                        System.out.println("Nama\tNIM\tKelas");
                        stack.print();
                        break;
                    case 5:
                        Mahasiswa14 tugasTerbawah = stack.lihatTugasTerbawah();
                        if (tugasTerbawah != null) {
                            System.out.println("Tugas pertama dikumpulkan oleh " + tugasTerbawah.nama);
                        } else {
                            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } while (pilih >= 1 && pilih <= 4);
        }
   }
