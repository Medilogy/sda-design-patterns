package pl.sda.poznan.files.fileoperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHelper {

    // OLD IO
    public static List<String> readAllLines(String path) {

        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = null;

            // w warunku while musimy przypisac watosc do zmiennej line i sprawdzic czy to co wczytalismy jest rozne od null
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static List<String> splitLinesIntoWords(List<String> lines) {

        List<String> wordsResults = new ArrayList<>();
        for (String line : lines) {
            String[] words = line.split("\\s|\\, |\\. ");
            List<String> c = Arrays.asList(words);

            wordsResults.addAll(c);
        }

        return wordsResults;

    }

}
