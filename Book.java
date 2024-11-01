import java.util.Scanner;

public class Book {
    String name;
    String author;
    long year_published;
    String genre;

    Book(String name, String author, long year_published, String genre) {
        this.name = name;
        this.author = author;
        this.year_published = year_published;
        this.genre = genre;
    }
}
