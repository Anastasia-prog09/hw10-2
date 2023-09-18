package ua.stokipna.hw10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2App {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        String jsonString = "[\n";
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            String[] lineParts = line.split(" ");
            if (lineParts.length != 2) {
                continue;
            }
            User user = new User(lineParts[0], Integer.parseInt(lineParts[1]));
            if (jsonString.equals("[\n")) {
                jsonString = jsonString + user.toJson();
            } else {
                jsonString = jsonString + ",\n" + user.toJson();
            }
        }
        jsonString = jsonString + "\n]";
        scanner.close();
        file = new File("user.json");
        PrintWriter pw = new PrintWriter(file);
        pw.println(jsonString);
        pw.close();
    }
}
