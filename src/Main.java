import FileService.FileHandler;
import Person.Person;
import Person.PersonService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
/*      1. Skapa en textfil som innehåller namn på ett antal personer.
            Skriv ett namn på varje rad i filen.
            Skriv minst en person som har efternamnet ”Al Hakim”.

        2. Skriv ett program som läser in alla namn och placerar dem i en lista.

        3. Programmet skall skriva ut alla namn i terminalen i omvänd ordning.

        4. Skriv ut hur många personer som finns i listan.

        5. Skriv ut hur många av dessa namn har efternamnet ”Al Hakim”.
        */


        // 1,2,4 Skapar listan samt skriver ut hur många namn som finns i listan.
        ArrayList<String> names = FileHandler.getNamesInFileAsList("src/FileService/names.txt"); //Utgår från ListorDemo mappen
        System.out.println("Antal namn i listan: " + names.size());

        // 3. Skriv ut alla namn i omvänd ordning i terminalen
        System.out.println("\nListan i ordning");
        PersonService.printAllNames(names);

        System.out.println("\nListan i bakvänt");
        PersonService.printAllNamesReversed(names);

        System.out.println("\nListan i bakvänt med Collections");
        PersonService.printAllNamesReversedWithCollections(names);

        // 5.
        System.out.println("\nAntal ggr Al Hakim i listan: " + PersonService.getNameCountInList(names, "Al Hakim"));

        System.out.println("\nAntal ggr Al Hakim i listan med Stream: " +
                PersonService.getNameCountInListStream(names, "Al Hakim"));


        // Egna labbar
        // 1. Skapa en metod som tar in en lista samt en bokstav,
        //    returnerar hur många namn som börjar på tex bokstav A (count), samt namnen

        // 1a Count
        int count = PersonService.getCountOfNamesThatStartsWithLetter(names, 'a');
        System.out.println("\nAntal namn som börjar på A ink dubbletter: " + count);

        // 1.b + 2. Ta reda på om Al Hakim finns i listan eller inte
        System.out.println("\nAntal namn som börjar på A utan dubbletter");
        Set<String> unikaNamn = PersonService.collectUniqueNamesThatStartsWithLetter(names, 'a');
        System.out.println(unikaNamn);
        System.out.println(unikaNamn.size() + " st");

        String hasAlHakim = unikaNamn.contains("Al Hakim") ? "Al Hakim finns i Set" : "Al Hakim finns inte i Set"; // Ternary Operator
        System.out.println(hasAlHakim + "\n");


        // Map hela filen med -> Hur många namn som börjar på A, B, C osv.
        HashMap<Character, Integer> mapOfNamesBeginningLetterToCount = PersonService.mapBeginningLetterOfNameToCount(names);
        System.out.println(mapOfNamesBeginningLetterToCount);

        // Vi kan kontrollera att tex Z bara har 31 namn genom facit med vår andra metod Person.PersonService.getCountOfNamesThatStartsWithLetter(names, 'z');
        System.out.println("Namn på Z: " + PersonService.getCountOfNamesThatStartsWithLetter(names, 'z') + "\n");


        // -- Just nu är bara listan med Namn == String, gör några Person.Person objekt medhjälp av Filen!
        // 1. Skapa Person.Person objekt av dem första 100 namnen i filen.
        // 2. Spara alla i en Lista och sedan printa ut namnen från listan.

        // 1.
        List<Person> hundredFirstPersons = PersonService.createListOf100FirstPersonsFromFile();

        // 2.
        hundredFirstPersons.forEach(person -> System.out.println(person.getName()));
        System.out.println("Person List size: " + hundredFirstPersons.size()+"\n");


        // TODO Skapa ett program som tar in alla namn från names.txt som sedan skapar en ny textfil animals.txt
        // 1. Som sparar alla namn + mellanslag + Katt/Hund + mellanslag + ålder
        // 2. Skapa en klass Animal som har attributen Namn + ålder
        // 3. Klass Dog/Cat som har foodPreference eller något annat som inte är i superClass, ärver det andra av Animal
        // 4. Löper igenom den nya filen och skapar upp Cat/Dog och sorterar dem i listor av Cats / Dogs separat
        // 5. Skriv ut listorna till terminalen
        // 6. Om de finns tid, kolla Sigrun's Github och implementera ngt testcase (Junit)


        // 1.
        FileHandler.handleCreateAnimalFile();


    }
}