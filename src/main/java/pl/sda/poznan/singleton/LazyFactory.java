package pl.sda.poznan.singleton;

import pl.sda.poznan.factory.CompanyWriterFactory;
import pl.sda.poznan.factory.Factory;

public class LazyFactory implements Factory<String, CompanyWriterFactory> {

    private static LazyFactory instance = null;

    public static LazyFactory getInstance() {
        if (instance == null) {
            instance = new LazyFactory();
        }
        return instance;
    }

    @Override
    public CompanyWriterFactory create(String key) {
        return null;
    }
}
