package pl.sda.poznan.singleton;

import java.lang.reflect.Constructor;

import pl.sda.poznan.factory.model.Employee;

public class ReflectionPlayground {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("pl.sda.poznan.factory.model.Employee");
        Employee employee = (Employee) clazz.newInstance();

        if (employee instanceof Employee) {
            System.out.println("o jest typu Employee");
        }

        SingleCompanyWriterFactory instance = SingleCompanyWriterFactory.getInstance();
        Constructor<?>[] declaredConstructors = SingleCompanyWriterFactory.class
                .getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            c.setAccessible(true);
        }

        Constructor<?> declaredConstructor = declaredConstructors[0];
        SingleCompanyWriterFactory o = (SingleCompanyWriterFactory) declaredConstructor.newInstance();
        if (instance == o) {
            System.out.println("Ten sam obiekt");
        } else {
            System.out.println("Nie ten sam obiekt");
        }
    }
}