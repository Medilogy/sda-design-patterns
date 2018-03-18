package pl.sda.poznan.iterator;

public interface Iterator<T> {

    T getNextElement();

    boolean hasNextElement();
}
