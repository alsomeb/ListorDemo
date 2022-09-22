package Animal.test;

import Animal.AnimalOwner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalOwnerTest {
    // Testar metoderna i AnimalOwner, mest för att få lite feeling för JUNIT kanske inte världens bästa tests
    AnimalOwner bengt = new AnimalOwner("Bengt");

    @Test
    void testGetName() {
        assert(bengt.getName().equals("Bengt"));
    }

    @Test
    void testSetName() {
        String expected = "Håkan";
        bengt.setName("Håkan");
        String result = bengt.getName();

        assertEquals(expected, result);
    }

    @Test
    void testToString() {
        String expected = "Owners name: " + bengt.getName();
        assertEquals(expected, bengt.toString());
    }
}