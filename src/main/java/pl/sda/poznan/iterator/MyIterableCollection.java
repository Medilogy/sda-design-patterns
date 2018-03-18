package pl.sda.poznan.iterator;

import java.lang.Iterable;
import java.util.Iterator;

public class MyIterableCollection implements Iterable<String> {
    private int index = 0;
    private String[] elements = new String[10];

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
}
