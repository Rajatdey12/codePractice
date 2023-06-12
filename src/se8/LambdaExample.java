package se8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public interface LambdaExample {

    boolean getEmployees(List<Employee> empList);

}

class LambdaExampleImpl {

    public static final LambdaExample validEmployee = (empList) -> Objects.nonNull(empList)
            && empList.stream().anyMatch(emp -> !emp.getName().equals(emp.getLastname()))
            && empList.stream().distinct().count() > 1;


    public static void main(String[] args) {

        List<Employee> empLst = Arrays.asList(
                new Employee(1, "HR", "TR"), new Employee(2, "HRR","TR"),
                new Employee(3, "KR","KR"), new Employee(4, "KR","KR"));

        if (validEmployee.getEmployees(empLst)) {
            empLst.forEach(e -> System.out.println(e.getId() + ":::" + e.getName() + ":::" + e.getLastname()));
        } else {
            empLst.forEach(e -> System.out.println(e.getId() + ":::" + e.getName() + ":::" + e.getLastname()));
        }

        
    }

}
