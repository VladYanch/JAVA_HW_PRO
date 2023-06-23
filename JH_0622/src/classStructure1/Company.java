package classStructure1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
//import lombok.Getter;
//import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Company {
    private String name;
    private Set<Employee> employeeSet;
    private Set<Department> departments;

    public Company(String name, Set<Employee> employeeSet, Set<Department> departments) {
        this.name = name;
        this.employeeSet = employeeSet;
        this.departments = departments;
    }
}
