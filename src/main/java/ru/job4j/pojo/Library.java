package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("first", 10);
        Book second = new Book("second", 15);
        Book third = new Book("third", 25);
        Book cleanCode = new Book("Clean code", 30);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = cleanCode;
        for(int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getCount());
        }
        System.out.println("Move 0 and 3 index");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for(int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getCount());
        }
        System.out.println("Output the books with the name: Clean code");
        for(int index = 0; index < books.length; index++) {
            Book bo = books[index];
            if("Clean code".equals(bo.getName())) {
                System.out.println(bo.getName() + " - " + bo.getCount());
            }
        }
    }
}
