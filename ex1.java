//1.Сохранить в файл строку и загрузить из файла строку 
//с выводом в консоль используя классы FileWriter и FileReader

import java.io.*;
import java.nio.charset.*;

public class ex1 {
    public static void main (String[] args) {
        try {
            FileWriter writer = new FileWriter("ex1.txt", Charset.forName("UTF-8"));
            writer.append("Тестовая загрузка строки в файл!");
            writer.flush();

            String str = "";
            FileReader reader = new FileReader("ex1.txt", Charset.forName("UTF-8"));
            while (reader.ready()) {
                str += (char)reader.read();
            }
            System.out.println("\n" + str);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}