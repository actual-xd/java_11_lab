import java.io.*;
import java.util.ArrayList;

public class FileProcessor {
    String filePath = "library.txt";

    void write(Book book) {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
            } else {
                System.out.println("Файл уже существует!");
            }
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(book.name + " ");
            writer.write(book.author + " ");
            writer.write(book.year_published + " ");
            writer.write(book.genre + "\n");

            writer.close();
            System.out.println("Успешно записано в файл.");

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом.");
            e.printStackTrace();
        }
    }

    public long getLineCountByReader(String fileName) throws IOException {
        try (var lnr = new LineNumberReader(new FileReader(fileName))) {
            while (lnr.readLine() != null) ;
            return lnr.getLineNumber();
        }
    }

    public void delete(String lineToRemove) {
        try {
            ArrayList list = new ArrayList();

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (!currentLine.contains(lineToRemove)) {
                    list.add(currentLine);
                }
            }
            reader.close();
            FileWriter writer = new FileWriter(filePath);
            for (Object element : list) {
                writer.write(element.toString() + "\n");
            }
            writer.close();


            System.out.println("Книга " + lineToRemove + " удалена из библиотеки " + filePath);

        } catch (IOException ex) {
            System.out.println("Ошибка при удалении строки из файла " + filePath);
            ex.printStackTrace();
        }
    }

    public void print() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("Ваша библиотека: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с фалом " + filePath);
            e.printStackTrace();
        }
    }
}

