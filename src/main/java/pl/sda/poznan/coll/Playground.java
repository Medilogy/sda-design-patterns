package pl.sda.poznan.coll;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Playground {

    public static void main(String[] args) {
        Person student = new Person("Michal", "Madajewski", 29);
        Person student2 = new Person("Lidia", "Zietek", 29);
        Person student3 = new Person("Agata", "Klimaszewska", 27);

        List<Person> people = Arrays.asList(student, student2, student3);
        // sortowanie z uzyciem Collections.sort
        Collections.sort(people);
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //przekazanie funkcji do funkcji przy uzyciu lambdy
        people.sort((person1, person2) -> person1.getName().compareTo(person2.getName()));

        // boolean Test(T t);
        people.stream()
                .filter(p -> p.getAge() > 28)
                .filter(p -> p.getName().startsWith("L"))
                .filter(p -> p.getSurname().equals("Zietek"));




    }
}
