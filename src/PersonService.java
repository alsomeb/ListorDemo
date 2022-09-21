import java.util.*;
import java.util.stream.Collectors;

public class PersonService {
    // Metoder som används på listan med Persons

    public static void printAllNames(List<String> lista) {
        lista.forEach(name -> System.out.println(name));
    }

    public static void printAllNamesReversed(List<String> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }


    public static void printAllNamesReversedWithCollections(List<String> lista) {
        List<String> listReversed = new ArrayList<>(lista);
        Collections.reverse(listReversed);
        listReversed.forEach(name -> System.out.println(name));
    }

    public static Long getNameCountInListStream(List<String> lista, String searchName) {
        return lista.stream().filter(name -> name.equalsIgnoreCase(searchName)).count();
    }

    public static int getNameCountInList(List<String> lista, String searchName) { // Mer kod än streams!
        int count = 0;
        for (String namn : lista) {
            if(namn.equalsIgnoreCase(searchName)) {
                count++;
            }
        }
        return  count;
    }


    public static int getCountOfNamesThatStartsWithLetter(List<String> lista, char letter) {
        int count = 0;
        char upperCaseLetter = Character.toUpperCase(letter);

        for(String namn : lista) {
            if(namn.startsWith(String.valueOf(upperCaseLetter))) { // Konverterar till string
                count++;
            }
        }
        return count;
    }


    public static Set<String> collectUniqueNamesThatStartsWithLetter(List<String> lista, char letter) {
        char upperCaseLetter = Character.toUpperCase(letter); // Håller den hela tiden till uppercase

        return lista.stream()
                .filter(namn -> namn.startsWith(String.valueOf(upperCaseLetter)))
                .collect(Collectors.toSet());
    }

    public static HashMap<Character, Integer> mapBeginningLetterOfNameToCount(List<String> lista) {
        HashMap<Character, Integer> mapOfNamesFirstLetterToCount = new HashMap<>();

        for (String namn : lista) {
            char currentChar = namn.charAt(0);
            int currentCount = mapOfNamesFirstLetterToCount.getOrDefault(currentChar, 0); // Om den inte finns så ge value 0, default (Första gången får alla bokstäver detta)
            mapOfNamesFirstLetterToCount.put(currentChar, currentCount+1); // Om den finns så +1 hela tiden, räknar totalen
        }

        return mapOfNamesFirstLetterToCount;
    }
}

