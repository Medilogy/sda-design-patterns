package pl.sda.poznan.factory.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Company {

    private String name;
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee (Employee e) {
        this.employees.add(e);
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }
}
