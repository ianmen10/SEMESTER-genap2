
public class fungsi14 {
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };
        
        int[] hargaBunga = {75000, 50000, 60000, 10000}; 
        
        String[] cabangToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        
        System.out.println("Pendapatan setiap cabang jika semua bunga terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                totalPendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.printf("%s: Rp%,d\n", cabangToko[i], totalPendapatan);
        }
        int[] totalStok = new int[4];
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                totalStok[j] += stokBunga[i][j];
            }
        }
        System.out.println("\nTotal stok setiap jenis bunga:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < totalStok.length; i++) {
            System.out.printf("%s: %d buah\n", jenisBunga[i], totalStok[i]);
        }
    }
}
