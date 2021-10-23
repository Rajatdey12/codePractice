package se8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@FunctionalInterface
public interface LambdaExample {

    public boolean getEmployees(List<Employee> empList);
}

class LambdaExampleImpl {

    public static final LambdaExample validEmployee = (empList) -> Objects.nonNull(empList)
            && empList.stream().anyMatch(emp -> !emp.getName().equals(emp.getLastname()))
            && empList.stream().distinct().count() > 1;


    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee(1, "HR", "TR"), new Employee(2, "HRR","TR"));

        System.out.println("Is the Employee is valid :: " + validEmployee.getEmployees(emp));
    }
}
