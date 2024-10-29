package com.mycompany.librarysystem;

//menambahkan variabel deskripsi dan harga buku

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private String deskripsi;
    private double harga;

    // Constructor
    public Book(String title, String author, String deskripsi, double harga) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default: Book is available when created
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setdeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Setter to change availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
