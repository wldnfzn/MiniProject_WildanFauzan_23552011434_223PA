package com.mycompany.librarysystem;

//mengubah nama file Teacher menjadi Lecturer
//Menambahkan variabel kodeDosen

public class Lecturer extends LibraryMember {
    
    private String kodeDosen;
    
    public Lecturer(String name, int memberId, String alamat, String kodeDosen) {
        super(name, memberId, alamat);
        this.kodeDosen = kodeDosen;
    }
    
    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }
    
    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Teacher) has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }
}