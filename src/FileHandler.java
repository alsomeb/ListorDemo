import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
}
