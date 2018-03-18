package pl.sda.poznan.iterator;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Playground {

    // var - args

    public static void foo(String... mojeNapisy) {
        for (String s : mojeNapisy) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        //1
        foo("piotr");
        foo("piotr", "Ela");
        foo("piotr", "Ela", "12312312", "0213");

        Arrays.asList("Piotr");
        List<String> names = Arrays.asList("Piotr", "Jan", "Ala");

        System.out.println("Petla for each ..........");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("Z uzyciem iteratora:.....");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("Pobrana watosc to: " + next);
        }

        // z uzyciem wlasnego iteratora
        MyCollection imiona = new MyCollection();
        imiona.addElement("Lidia");
        imiona.addElement("Agata");
        imiona.addElement("Alicja");

        pl.sda.poznan.iterator.Iterator<String> imionaIterator = imiona.getIterator();
        while (imionaIterator.hasNextElement()){
            String elem = imionaIterator.getNextElement();
            System.out.println(elem);
        }
        MyIterableCollection collection = new MyIterableCollection();

        for (String s : collection){

        }


    }
}
