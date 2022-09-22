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
        ArrayList<String> target = FileHandler.getNamesInFileAsList(path); // Target <-- kanske blir lite fel dock

        // 1 param == expected (target), 2 param == actual result of test, whatever it returns
        assertEquals(target, FileHandler.getNamesInFileAsList(path));

        // Kollar så att listan vi får tbx inte är tom för de förväntar vi oss inte
        assertEquals(target.isEmpty(), FileHandler.getNamesInFileAsList(path).isEmpty());
    }
}