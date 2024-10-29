package com.mycompany.librarysystem;

//Menambahkan variabel alamat

public abstract class LibraryMember {
    private String name;
    private int memberId;
    private String alamat;

    public LibraryMember(String name, int memberId, String alamat) {
        this.name = name;
        this.memberId = memberId;
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Abstraksi metode umum yang harus diimplementasikan oleh subclass
    public abstract void borrowBook(Book book);
}
