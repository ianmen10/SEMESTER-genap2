package Pertemuan16;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting14 {
    public static void main(String[] args) {
 
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        System.out.println("Setelah diurutkan (String): " + daftarSiswa);

        // Pengurutan data objek Customer14 berdasarkan nama
        ArrayList<Customer14> customers = new ArrayList<>();
        customers.add(new Customer14(3, "Zainab"));
        customers.add(new Customer14(1, "Andi"));
        customers.add(new Customer14(2, "Rara"));

        // Mengurutkan berdasarkan nama (atribut 'nama')
        customers.sort((c1, c2) -> c1.nama.compareTo(c2.nama));
        System.out.println("Setelah diurutkan (Customer): " + customers);
    }
}