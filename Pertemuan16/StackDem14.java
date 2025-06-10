package Pertemuan16;

import java.util.Stack;

public class StackDem14 {
    public static void main(String[] args) {
        Book14 book1 = new Book14("1234", "Dasar Pemrograman");
        Book14 book2 = new Book14("7145", "Hafalan Shalat Delisa");
        Book14 book3 = new Book14("3562", "Muhammad Al-Fatih");

        Stack<Book14> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        // Menggunakan peek()
        Book14 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        // Menggunakan pop()
        Book14 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book14 book : books) {
            System.out.println(book.toString());
        }
        System.out.println(books);

        // Contoh pencarian elemen pada stack menggunakan search()
        int posisi = books.search(book1); 
        System.out.println("Posisi book1 dari atas stack: " + posisi);
    }
}