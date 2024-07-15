package com.objects;

public class Book {
    private String title;
    private String author;
    private String price;

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String displayDetails() {
        return "com.objects.Book name is " + title + " Price is " + price + " Author is " + author;
    }

    public static void main(String[] args) {
        Book think = new Book("Think and Grow Rich", "Napoleon Hill", "165");
        System.out.println(think.displayDetails());
        Book mind = new Book("Power of Subconscious Mind", "Joseph Murphy", "225");
        System.out.println(mind.displayDetails());
    }
}
