import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    void write(Book book) {
        String filePath = "library.txt";
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
            } else {
                System.out.println("Файл уже существует!");
            }
            FileWriter writer = new FileWriter(filePath);
            writer.write(book.name +  " ");
            writer.write(book.author + " ");
            writer.write(book.year_published + " ");
            writer.write(book.genre + " ");

            writer.close();
            System.out.println("Успешно записано в файл.");


        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом.");
            e.printStackTrace();
        }
    }
}
