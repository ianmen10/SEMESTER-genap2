import java.util.Scanner;

class Pangkat14 {
    int nilai, pangkat;

    public Pangkat14(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }
    int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < this.pangkat; i++) {
            hasil *= this.nilai;
        }
        return hasil;
    }
    int pangkatDC (int a, int nilai) {
        if (nilai == 1) {
            return a;
        } else {
            if(nilai%2==1){
                return a * pangkatDC(a, nilai/2) * pangkatDC(a, nilai/2);
            } else {
                return pangkatDC(a, nilai/2) * pangkatDC(a, nilai/2);
            }
        }
        
    }
}

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat14[] png = new Pangkat14[elemen];
        for(int i=0; i<elemen; i++) {
            System.out.print("Masukkan nilai yang dipangkatkan ke-" + (i+1) + ": ");
            int nilai = input.nextInt();
            System.out.print("Masukkan nilai pangkat ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat14(nilai, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTFORCE:");
        for (Pangkat14 p : png) {
            System.out.println(p.nilai + " pangkat " + p.pangkat + " adalah: " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat14 p : png) {
            System.out.println(p.nilai + " pangkat " + p.pangkat + " adalah: " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}