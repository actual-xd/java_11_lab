import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int state = 0;
        Scanner scanner = new Scanner(System.in);
        FileProcessor processor = new FileProcessor();
        while (state != 4) {

            System.out.println("\nДобро пожаловать в библиотеку!");
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Посмотреть книги");
            System.out.println("3. Удалить книгу");
            System.out.println("4. Выход");

            System.out.print("Выберите номер действия: ");
            state = scanner.nextInt();
            switch (state) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String name = scanner.next();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.next();
                    System.out.print("Введите год публикации книги: ");
                    long year_published = Long.parseLong(scanner.next());
                    System.out.print("Введите жанр книги: ");
                    String genre = scanner.next();
                    Book book = new Book(name, author, year_published, genre);
                    processor.write(book);
                    break;
                case 2:
                    processor.print();  // не смотреть библиотеку без создания файла ;))))))
                    break;
                case 3:
                    System.out.print("Введите название книги, которую нужно удалить: ");
                    String lineToRemove = scanner.next();
                    processor.delete(lineToRemove);
                    break;
                case 4:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный ввод! Попробуйте еще раз.");
            }
        }
        scanner.close();
    }
}
