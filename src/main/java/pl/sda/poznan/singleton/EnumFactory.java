package pl.sda.poznan.singleton;

import pl.sda.poznan.factory.Factory;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;
import pl.sda.poznan.factory.writer.XmlCompanyWriter;

public enum EnumFactory implements Factory<String, CompanyWriter> {
    INSTANCE;

    @Override
    public CompanyWriter create(String path) {
        if (path.endsWith(".txt")) {
            return new TxtCompanyWriter(path);
        } else if (path.endsWith(".xml")) {
            return new XmlCompanyWriter(path);
        }
        return null;
    }
}
