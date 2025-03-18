import java.util.Scanner;

class Faktorial14 {
    public int faktorialBF(int n) {
        int hasil = 1;
        int i = 1;
        while (i <= n) {
            hasil *= i;
            i++;
        }
        return hasil;
    }
    
    public int faktorialDC(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * faktorialDC(n - 1);
    }
}

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();
        Faktorial14 f = new Faktorial14();
        System.out.println("Faktorial BF: " + f.faktorialBF(n));
        System.out.println("Faktorial DC: " + f.faktorialDC(n));
        sc.close();
    }
}
