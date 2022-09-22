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

        int expectedCount = 3;
        ArrayList<String> names = FileHandler.getNamesInFileAsList("src/FileService/names.txt");
        int givenCount = PersonService.getNameCountInList(names, "Al Hakim");

        assertEquals(expectedCount, givenCount);
    }

    @Test
    void testCreateListOf100FirstPersonsFromFileReturnsListOf100Size() throws FileNotFoundException {
        int expectedCount = 100;
        int givenCount = PersonService.createListOf100FirstPersonsFromFile().size();

        assertEquals(expectedCount, givenCount);

    }
}