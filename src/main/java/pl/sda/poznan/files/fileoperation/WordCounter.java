package pl.sda.poznan.files.fileoperation;


import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class WordCounter {

    public static void main(String[] args) {

        System.out.println("Word counter");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj sciezke do pliku");
        String path = scanner.next();
        List<String> lines = FileHelper.readAllLines(path);
        lines.forEach(System.out::println);
        List<String> words = FileHelper.splitLinesIntoWords(lines);
        Map<String, Integer> wordsMap = StringHelper.getWordsMap(words);

        for (Entry<String, Integer> entry : wordsMap.entrySet()) {
            System.out.println(entry.getKey() + "-------> " + entry.getValue());
        }
    }
}
