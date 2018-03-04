package pl.sda.poznan.singleton;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumDemo {

    public static void main(String[] args) {
        CompanyWriter writer = EnumFactory.INSTANCE.create(".xml");
        Employee dyrektor = new Employee("Jan", "Nowak", "nowak@gmail.com", 10000d);
        Employee kierownik = new Employee("Alicja", "Kowalska", "kowalska@gmail.com", 20000d);

        Company company = new Company();
        company.addEmployee(dyrektor);
        company.addEmployee(kierownik);

        Class<? extends EnumFactory> aClass = EnumFactory.INSTANCE.getClass();
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            c.setAccessible(true);
        }
        Constructor<?> declaredConstructor = declaredConstructors[0];
        try {
            Object o = declaredConstructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        writer.write(company);
    }
}
