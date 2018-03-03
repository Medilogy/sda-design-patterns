package pl.sda.poznan.factory;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;
import pl.sda.poznan.factory.writer.XmlCompanyWriter;

public class App {

    public static void main(String[] args) {
        Employee dyrektor = new Employee("Jan", "Nowak", "nowak@gmail.com", 10000d);
        Employee kierownik = new Employee("Alicja", "Kowalska", "kowalska@gmail.com", 20000d);

        Company company = new Company();
        company.addEmployee(dyrektor);
        company.addEmployee(kierownik);

        CompanyWriter writer = new XmlCompanyWriter("firma.xml");
        writer.write(company);


    }
}
