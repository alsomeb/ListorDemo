package FileService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileHandler {

    public static ArrayList<String> getNamesInFileAsList(String pathName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(pathName));
        ArrayList<String> names = new ArrayList<>();

        while (scan.hasNextLine()) {
            names.add(scan.nextLine());
        }

        return names;
    }


    private static void createAnimalFile() throws IOException {
        ArrayList<String> names = getNamesInFileAsList("src/FileService/names.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("src/FileService/animals.txt")));

        for(String name : names) {
            String randomAnimal = getRandomCatOrDog();
            int randomAge = getRandomAgeBetweenOneAndTen();

            pw.println(name + " " + randomAnimal + " " + randomAge);
        }
        pw.close();
    }

    public static String getRandomCatOrDog() {
        ArrayList<String> animals = new ArrayList<>(List.of("Cat", "Dog"));
        Random random = new Random();
        return animals.get(random.nextInt(animals.size()));
    }

    public static int getRandomAgeBetweenOneAndTen() {
        Random rand = new Random();
        return rand.nextInt(1, 11);
    }

    public static boolean checkIfAnimalsFileExist() {
        File animalFile = new File("src/FileService/animals.txt");
        return animalFile.exists();
    }

    public static void handleCreateAnimalFile() throws IOException {
        if (!FileHandler.checkIfAnimalsFileExist()) {
            createAnimalFile(); // Om filen redan finns så kör ej skapande av fil igen
        }
    }
}
