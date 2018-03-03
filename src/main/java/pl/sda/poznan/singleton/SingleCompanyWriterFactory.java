package pl.sda.poznan.singleton;

import pl.sda.poznan.factory.Factory;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;
import pl.sda.poznan.factory.writer.XmlCompanyWriter;

public class SingleCompanyWriterFactory implements Factory<String, CompanyWriter> {

    // reczne utworzenie instancji
    // jedyne urzycuie konstruktora
    private final static SingleCompanyWriterFactory INSTANCE = new SingleCompanyWriterFactory();

    // prywatny konstruktor zeby wylaczyc na zewnatrz mozliwosc tworzenia obiektow
    public SingleCompanyWriterFactory() {
    }

    // metoda dostepowa do jedyneh instancji
    public static SingleCompanyWriterFactory getInstance(){
        return INSTANCE;
    }

    @Override
    public CompanyWriter create (String key) {
        if (key.endsWith(".txt")){
            return new TxtCompanyWriter(key);
        } else if (key.endsWith(".xml")){
            return new XmlCompanyWriter(key);
        }else {
            throw new IllegalArgumentException("Not supported file type");
        }
    }
}
