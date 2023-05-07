package se8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public interface LambdaExample {

    boolean getEmployees(List<Employee> empList);

    default void test1() {
        System.out.println("def 1 printed");
    }

    default void test2() {
        System.out.println("def 2 printed");
    }

    default void test3() {
        System.out.println("def 2 printed");
    }
}

class LambdaExampleImpl implements LambdaExample {

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

    @Override
    public boolean getEmployees(List<Employee> empList) {
        return false;
    }

}
