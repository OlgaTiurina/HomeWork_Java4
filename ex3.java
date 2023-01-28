//3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, 
//отчества, возрас и пол в отдельных списках.

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<String> surnames = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> genders = new ArrayList<>();

          try {
            File file = new File("ex2.txt");
            Scanner scanner = new Scanner(file, Charset.forName("UTF-8").name());
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(" ");
                surnames.add(parts[0]);
                names.add(parts[1]);
                patronymic.add(parts[2]);
                age.add(Integer.valueOf(parts[3]));
                genders.add(parts[4]);
          }
          scanner.close();

          for (int i = 0; i < surnames.size(); i++) {
            System.out.println(surnames.get(i) + " " + names.get(i).charAt(0) + ". " + patronymic.get(i).charAt(0) + ". " + age.get(i) + " " + genders.get(i));
          }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    
}
}