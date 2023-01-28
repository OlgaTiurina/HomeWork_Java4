//4.Отсортировать по возрасту используя дополнительный список индексов.

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        try {
            File file = new File("ex2.txt");

            ArrayList<String> lines = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Integer> decreasing = new ArrayList<>();

            int index = 0;
            Scanner scanner = new Scanner(file, Charset.forName("UTF-8").name());

            while (scanner.hasNextLine()) {
                String line_inner = scanner.nextLine();
                lines.add(line_inner);
                String[] parts = line_inner.split(" ");
                age.add(Integer.parseInt(parts[3]));
                decreasing.add(index);
                index++;    
        }
        scanner.close();

        for (int i = 0; i < age.size(); i++) {
            for (int j = i + 1; j < age.size(); j++) {
                if (age.get(i) < age.get(j)) {
                    int tempAge = age.get(i);
                    int tempIndex = decreasing.get(i);
                    age.set(i, age.get(j));
                    decreasing.set(i, decreasing.get(j));
                    age.set(j, tempAge);
                    decreasing.set(j, tempIndex);
                }
            }
        }
        ArrayList<String> sortedLines  = new ArrayList<>();
        for (int i : decreasing) {
            sortedLines.add(lines.get(i));
        }

        for (String line : sortedLines) {
            String[] parts = line.split(" ");
            System.out.println(parts[0] + " " + parts[1].charAt(0) + ". " + parts[2].charAt(0) + ". " + parts[3] + " " + parts[4]);
        }
    }
    catch (IOException e) {
        e.printStackTrace();
      }
    }
}
