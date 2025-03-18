package Praktikum05;

public class Sorting14 {

    int[] data;
    int jumData;

    Sorting14(int Data[], int jumData) {
        this.jumData = jumData;
        data = new int[jumData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbeleSort() {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 0; j < jumData - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

void SelectionSort() {
    for (int i=0; i<jumData-1; i++) {
        int min = i;
        for (int j=i+1; j<jumData; j++) {
            if (data[j] < data[min]) {
                min = j;
            }
        }
        int temp = data[min];
        data[min] = data[i];
        data[i] = temp;
    }
}
void insertionSort() {
    for (int i=1; i<jumData; i++) {
        int temp = data[i];
        int j = i;
        while (j>0 && data[j-1] > temp) {
            data[j] = data[j-1];
            j--;
        }
        data[j] = temp;
    }
}

class MainSorting14 {

    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting14 dataurut1 = new Sorting14(a, a.length);
        
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbeleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        Sorting14 dataurut2 = new Sorting14(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut2.tampil();

        int c[] = {40, 30, 2, 9, 16};
        Sorting14 dataurut3 = new Sorting14(c, c.length);
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut3.tampil();
    }
}
}