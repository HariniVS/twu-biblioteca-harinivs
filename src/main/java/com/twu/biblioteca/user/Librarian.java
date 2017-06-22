package com.twu.biblioteca.user;

 public class Librarian extends User {

     private final String librarianId;

     Librarian(String librarianName, String emailId, String address, int phoneNumber, String librarianId) {
         super(librarianName, emailId, address, phoneNumber, librarianId);
         this.librarianId = librarianId;
     }

     String getLibrarianId() {
         return librarianId;
     }
 }
