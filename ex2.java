//2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. 
//Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try {
            File file = new File("ex2.txt");
            Scanner scanner = new Scanner(file, Charset.forName("UTF-8").name());
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(" ");
                System.out.println(parts[0] + " " + parts[1].charAt(0) + ". " + parts[2].charAt(0) + ". " + parts[3] + " " + parts[4]);
            }
            scanner.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
