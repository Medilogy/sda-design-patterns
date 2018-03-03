package pl.sda.poznan.factory.writer;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TxtCompanyWriter implements CompanyWriter {

    private final String path;

    public TxtCompanyWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(Company company) {

        // podejscie implementacyjne
        List<String> strings = new ArrayList<>();
        for (Employee employee : company.getEmployees()) {
            strings.add(employee.toString());
        }
        //podejscie deklaratywne / funkcyjne - od Javy 8
        List<String> collect = company.getEmployees()
                .stream()
         //       .map(e ->e.toString())
                .map(Employee::toString)
                .collect(Collectors.toList());
        try {
            // metoda write przyjmuje sciezke do pliku i Iterable<> extends CharSequence>
            //drugi zapis oznacza , ze mozemy tutaj podac liste ale tylko taka
            //ktora przechowuje typ dziedziczny po CharSequence (np. String)
            Files.write(Paths.get(path), strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}