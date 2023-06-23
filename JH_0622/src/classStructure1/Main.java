package classStructure1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new LinkedHashSet<>();
        employeeSet.add(new Employee("Jessika",Department.FrontEnd,Position.Junior, 2000.0));
        employeeSet.add(new Employee("Lena",Department.FrontEnd,Position.Middle, 3000.0));
        employeeSet.add(new Employee("Olya",Department.FrontEnd,Position.Senior, 5000.0));
        employeeSet.add(new Employee("Angela",Department.FrontEnd,Position.Junior, 2200.0));
        employeeSet.add(new Employee("Lysa",Department.FrontEnd,Position.Middle, 3300.0));
        employeeSet.add(new Employee("Nika",Department.FrontEnd,Position.Senior, 5300.0));

        employeeSet.add(new Employee("Ben",Department.BackEnd,Position.Junior, 2200.0));
        employeeSet.add(new Employee("Ivan",Department.BackEnd,Position.Middle, 3000.0));
        employeeSet.add(new Employee("Stepan",Department.BackEnd,Position.Senior, 5000.0));
        employeeSet.add(new Employee("John",Department.BackEnd,Position.Junior, 2200.0));
        employeeSet.add(new Employee("Den",Department.BackEnd,Position.Middle, 3300.0));
        employeeSet.add(new Employee("Mike",Department.FrontEnd,Position.Senior, 5300.0));
        Set<Department> departmentSet = new LinkedHashSet<>(Arrays.asList(Department.FrontEnd,Department.BackEnd));
        Company company = new Company("IT-Lux",employeeSet,departmentSet);
//        company.getEmployeeSet().forEach(s->System.out.println(s.getName()+": "+s.getSalary()));
        List<String> list = new ArrayList<String>();
        list.add("Documentation");
        list.add("Codding");
        list.add("Testing");
        Info info = new Info(new HashMap<>(),new List<String>);


    }
}