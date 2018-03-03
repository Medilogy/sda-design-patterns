package pl.sda.poznan.factory;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;
import pl.sda.poznan.factory.writer.XmlCompanyWriter;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Employee dyrektor = new Employee("Jan", "Nowak", "nowak@gmail.com", 10000d);
        Employee kierownik = new Employee("Alicja", "Kowalska", "kowalska@gmail.com", 20000d);

        Company company = new Company();
        company.addEmployee(dyrektor);
        company.addEmployee(kierownik);

//        CompanyWriter writer = new XmlCompanyWriter("firma.xml");
//        writer.write(company);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku, do ktorego chcesz zapisac:");

        String filename = scanner.next();
        CompanyWriterFactory companyWriterFactory = new CompanyWriterFactory();
        try {
            CompanyWriter writer = companyWriterFactory.create(filename);
            writer.write(company);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
