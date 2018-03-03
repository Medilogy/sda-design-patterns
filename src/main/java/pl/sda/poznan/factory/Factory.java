package pl.sda.poznan.factory;

public interface Factory<K, V> {

    V create(K key);

}
