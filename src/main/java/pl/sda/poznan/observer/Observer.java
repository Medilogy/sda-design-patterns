package pl.sda.poznan.observer;

public interface Observer <T> {
    void handle(PropertyChangedEventArgs<T> args);
}
