class Nilai14 {

    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public Nilai14(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

public class MainNilai14 {

    public static void main(String[] args) {
        Nilai14[] mahasiswa = {
            new Nilai14("Ahmad", "220101001", 2022, 78, 82),
            new Nilai14("Budi", "220101002", 2022, 85, 88),
            new Nilai14("Cindy", "220101003", 2021, 90, 87),
            new Nilai14("Dian", "220101004", 2021, 76, 79),
            new Nilai14("Eko", "220101005", 2023, 92, 95),
            new Nilai14("Fajar", "220101006", 2020, 88, 85),
            new Nilai14("Gina", "220101007", 2023, 80, 83),
            new Nilai14("Hadi", "220101008", 2020, 82, 84)
        };

        int nilaiUTSTertinggi = findMaxUTS(mahasiswa, 0, mahasiswa.length - 1);
        int nilaiUTSTerendah = findMinUTS(mahasiswa, 0, mahasiswa.length - 1);
        double rataRataUAS = calculateAverageUAS(mahasiswa);

        System.out.println("Nilai UTS tertinggi: " + nilaiUTSTertinggi);
        System.out.println("Nilai UTS terendah: " + nilaiUTSTerendah);
        System.out.println("Rata-rata nilai UAS: " + rataRataUAS);
    }

    public static int findMaxUTS(Nilai14[] arr, int low, int high) {
        if (low == high) {
            return arr[low].nilaiUTS;
        }

        int mid = (low + high) / 2;
        int leftMax = findMaxUTS(arr, low, mid);
        int rightMax = findMaxUTS(arr, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }

    public static int findMinUTS(Nilai14[] arr, int low, int high) {
        if (low == high) {
            return arr[low].nilaiUTS;
        }

        int mid = (low + high) / 2;
        int leftMin = findMinUTS(arr, low, mid);
        int rightMin = findMinUTS(arr, mid + 1, high);

        return Math.min(leftMin, rightMin);
    }

    public static double calculateAverageUAS(Nilai14[] arr) {
        int total = 0;
        for (Nilai14 nilai : arr) {
            total += nilai.nilaiUAS;
        }
        return (double) total / arr.length;

    }
}
