package com.mycompany.librarysystem;
//Memanggil semua file di Main file
//Menambahkan list buku menggunakan Array
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi sistem perpustakaan dan buku
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Novel klasik Amerika", 100000));
        books.add(new Book("1984", "George Orwell", "Dystopian novel", 85000));

        // Menampilkan daftar buku
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                               ", Deskripsi: " + book.getDeskripsi() + ", Harga: " + book.getHarga());
        }

        // Inisialisasi anggota perpustakaan
        Student student = new Student("Alice", 1001, "Jl. Sudirman", "12345");
        Lecturer lecturer = new Lecturer("Mr. Smith", 2001, "Jl. Merdeka", "D987");

        // Contoh peminjaman buku
        student.borrowBook(books.get(0));  // Alice (Student) meminjam "The Great Gatsby"
        lecturer.borrowBook(books.get(0)); // Buku "The Great Gatsby" sudah dipinjam, jadi Mr. Smith tidak bisa meminjamnya
        lecturer.borrowBook(books.get(1)); // Mr. Smith (Lecturer) meminjam "1984"

        // Menghitung denda keterlambatan
        DendaKeterlambatan feeCalculator  = new DendaKeterlambatan();
        int keterlambatan = 3; // Misal, terlambat 3 hari
        double lateFee = feeCalculator.DendaTerlambat(keterlambatan);
        System.out.println("Denda keterlambatan untuk " + keterlambatan + " hari: " + lateFee);
    }
}
