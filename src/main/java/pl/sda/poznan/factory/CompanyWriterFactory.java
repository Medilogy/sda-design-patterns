package pl.sda.poznan.factory;

import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;
import pl.sda.poznan.factory.writer.XmlCompanyWriter;

public class CompanyWriterFactory implements Factory<String, CompanyWriter> {

    @Override
    public CompanyWriter create(String path) {
        if (path.endsWith(".txt")){
            return new TxtCompanyWriter(path);
        } else if (path.endsWith(".xml")){
            return new XmlCompanyWriter(path);
        }else {
            throw new IllegalArgumentException("Not supported file type");
        }
    }
}
