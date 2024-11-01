import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int state = 0;
        while (state != 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Добро пожаловать в библиотеку!");
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Посмотреть книги");
            System.out.println("3. Удалить книгу");
            System.out.println("4. Выход");

            System.out.print("Выберите номер действия: ");
            state = scanner.nextInt();
            switch (state) {
                case 1:
                    Book book = new Book();
                    book.insert();
                    break;
                case 2:
                    System.out.println("xd");
                    break;
                case 3:

                case 4:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный ввод! Попробуйте еще раз.");
            }
        }
    }
}
