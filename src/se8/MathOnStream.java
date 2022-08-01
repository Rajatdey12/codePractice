package se8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MathOnStream {

  public static void main(String[] args) {
	  
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int sum = numbers.stream()
        .filter(n -> n % 2  == 0)
        .reduce(0, Integer::sum);

    System.out.println(sum);

    List<Employee> emp = Arrays.asList(
            new Employee(1, "HR", "TR1"), new Employee(2, "HR","TR"));

//    MathOnStream.removeDuplicates(emp);
//    MathOnStream.sortEmployee(emp);
    MathOnStream.iterParallel();
  }

  public static void removeDuplicates(List<Employee> emp) {
    List<Employee> remDupList = emp.stream().distinct().collect(Collectors.toList());
    for(Employee e : remDupList) {
      System.out.println(e.getName());
    }
  }

  public static void iterParallel() {
    List<Integer> ints = Arrays.asList(1,2,3,5,6,7);
    List<Integer> updatedInts = ints.parallelStream().collect(Collectors.toList());
    System.out.println(updatedInts);

  }

  public static void sortEmployee(List<Employee> emp) {
    emp.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getLastname));
    emp.stream().forEach(e -> System.out.println(e.getName() + "::" + e.getLastname()));
  }

  public static void firstLastOfArrayList(List<Integer> intArr) {
    OptionalInt max = IntStream.range(0, intArr.size()).max();
    OptionalInt min = IntStream.range(0, intArr.size()).min();
  }
}


class Employee {
  int id;
  String name;
  String lastname;

  Employee(int id, String name, String lName) {
    this.id = id;
    this.name = name;
    this.lastname = lName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return id == employee.id &&
            Objects.equals(name, employee.name)
            && Objects.equals(lastname, employee.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastname);
  }
}
