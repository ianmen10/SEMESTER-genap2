package Pertemuan16;

import java.util.ArrayList;

public class DemoArrayList14 {
    public static void main(String[] args) {
        
        ArrayList<Customer14> customers = new ArrayList<>(2);

        Customer14 customer1 = new Customer14(1, "Zakia");
        Customer14 customer2 = new Customer14(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        // Menambahkan customer baru
        customers.add(new Customer14(4, "Cica"));
        // Menambahkan customer baru
        customers.add(new Customer14(100, "Rosa"));

        //Mengetahui posisi objek
        System.out.println(customers.indexOf(customer2));

        //Menegembalikan object pada index tertentu
        Customer14 customer = customers.get(1);
        System.out.println(customer.nama);
        customer.nama = "Budi Utomo";

        ArrayList<Customer14> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer14(201, "Della"));
        newCustomers.add(new Customer14(202, "Victor"));
        newCustomers.add(new Customer14(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer14 cust : customers) {
            System.out.println(cust.toString());
        }
        System.out.println(customers);
    }
}