package Person.test;

import FileService.FileHandler;
import Person.PersonService;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    void testGetNameCountInListWithSpecificNameEqualsCorrect() throws FileNotFoundException {
        // Eftersom vi på förhand vet att vi lagt in Al Hakim 3 ggr i filen
        // Oftast får man göra flera tester för kan bli falskt positiva
        // Då vet man om 1 test failar att något kan va fel på metoden osv.

        int target = 3;
        ArrayList<String> names = FileHandler.getNamesInFileAsList("src/FileService/names.txt");

        assertEquals(target, PersonService.getNameCountInList(names, "Al Hakim"));
    }
}