package FileService.test;
import FileService.FileHandler;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {
    // Want to test 1 single scenario usually in unitTests

    @Test
    void testGetNamesInFileAsListReturnsList() throws FileNotFoundException {
        String path = "src/FileService/names.txt";
        ArrayList<String> target = FileHandler.getNamesInFileAsList(path); // Target <-- kanske blir lite dåligt test case dock

        // 1 param == expected (target), 2 param == actual result of test, whatever it returns

        // Kollar om båda är av typen ArrayList pga vi vill ha en ArrayList ?
        assertEquals(target.getClass(), FileHandler.getNamesInFileAsList(path).getClass());

        // Kollar så att listan vi får tbx inte är tom för de förväntar vi oss inte
        assertEquals(target.isEmpty(), FileHandler.getNamesInFileAsList(path).isEmpty());

        // Kollar så den kastar FileNotFoundException + lambda, pga andra param tar in anonym funk med felaktig param == program crash
        assertThrows(FileNotFoundException.class, () -> {
            FileHandler.getNamesInFileAsList("wrong.txt");
        });
    }
}