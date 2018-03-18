package pl.sda.poznan.files;

import java.io.*;

public class StreamIntro {

    public static void main(String[] args) throws IOException {

        File plik = new File("plik.txt");
        InputStream inputStream = new FileInputStream(plik);

        byte [] buffer = new byte[255];
        int read = inputStream.read(buffer);
        inputStream.close();

        char [] charBuffor = new char[255];
        FileReader reader = new FileReader(plik);
        reader.read(charBuffor);

        BufferedReader bf;

    }
}
