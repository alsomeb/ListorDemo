import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
/*      1. Skapa en textfil som innehåller namn på ett antal personer.
            Skriv ett namn på varje rad i filen.
            Skriv minst en person som har efternamnet ”Al Hakim”.

        2. Skriv ett program som läser in alla namn och placerar dem i en lista.

        3. Programmet skall skriva ut alla namn i terminalen i omvänd ordning.

        4. Skriv ut hur många personer som finns i listan.

        5. Skriv ut hur många av dessa namn har efternamnet ”Al Hakim”.
        */


        // 1,2,4 Skapar listan samt skriver ut hur många namn som finns i listan.
        ArrayList<String> names = FileHandler.getNamesInFileAsList("src/names.txt"); //Utgår från ListorDemo mappen
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

        // Vi kan kontrollera att tex Z bara har 31 namn genom facit med vår andra metod PersonService.getCountOfNamesThatStartsWithLetter(names, 'z');
        System.out.println("Namn på Z: " + PersonService.getCountOfNamesThatStartsWithLetter(names, 'z'));


    }
}