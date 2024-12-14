package se8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public interface ValidEmployee {

    List<Employee> getEmployees(List<Employee> empList);

}

class ValidEmployeeImpl {

    public static final ValidEmployee validEmpl = (empList) -> empList.stream().distinct()
            .filter(emp -> !emp.getName().equals(emp.getLastname())
                    && !"LR".equalsIgnoreCase(emp.getLastname())).collect(Collectors.toList());


    public static void main(String[] args) {

        List<Employee> empLst = Arrays.asList(
                new Employee(1, "HR", "TR"), new Employee(2, "HRR","TR"),
                new Employee(3, "KR","KR"), new Employee(4, "KR","LR"),
                new Employee(5, "SC","SCC"), new Employee(5, "SC","SCC"));

        List<Employee> validEmp = validEmpl.getEmployees(empLst);
        validEmp.forEach(System.out::println);
    }

}
