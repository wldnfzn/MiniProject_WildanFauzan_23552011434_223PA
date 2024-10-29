package com.mycompany.librarysystem;

//Menambahkan variabel nim

public class Student extends LibraryMember {
    
    private String nim;
    
    public Student(String name, int memberId, String alamat, String nim) {
        super(name, memberId, alamat);
        this.nim = nim;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Student) has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }
}
