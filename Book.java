import java.util.Scanner;

public class Book {
    String name;
    String author;
    long year_published;
    String genre;


    void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        this.name = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        this.author = scanner.nextLine();
        System.out.print("Введите жанр книги: ");
        this.genre = scanner.nextLine();
        System.out.print("Введите год публикации книги: ");
        this.year_published = scanner.nextLong();
        insert_in_file(this);
    }

    void insert_in_file(Book book) {
        Writer writer = new Writer();
        writer.write(book);
    }

    void print() {
        System.out.println("Название книги: " + this.name);
        System.out.println("Автор книги: " + this.author);
        System.out.println("Год публикации книги: " + this.year_published);
        System.out.println("Жанр книги: " + this.genre);
    }

}
