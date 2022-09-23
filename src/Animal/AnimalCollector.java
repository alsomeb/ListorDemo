package Animal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCollector {
    // Skapa en statisk metod som löper igenom filen animals.txt och skapar upp Cat/Dog objekt och sorterar dem i listor av Cats / Dogs separat



    public static ArrayList<Cat> createListOfCats() throws FileNotFoundException {
        ArrayList<String> contentOfFile = getContentFromFile();
        ArrayList<Cat> cats = new ArrayList<>();

        for(String line : contentOfFile) {
            String[] rad = line.split(" ");
            handleCreateCat(rad, cats);
        }
        return cats;
    }

    private static void handleCreateCat(String[] rad, ArrayList<Cat> cats) {
        String name = rad[0];
        String animal = rad[1];
        int age = Integer.parseInt(rad[2]);

        if(animal.equals("Cat")) {
            cats.add(
                    new Cat(name, age, new AnimalOwner("Alex"), "Tonfisk")
            );
        }

    }

    private static ArrayList<String> getContentFromFile() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/FileService/animals.txt"));
        ArrayList<String> content = new ArrayList<>();

        while (scan.hasNextLine()) {
            content.add(scan.nextLine());
        }
        return content;
    }
}
