// ===========================================
// TASK 4 - Collections Framework & Generics
// ===========================================

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// ===========================================
// Employee Class
// ===========================================
class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.id, e.id);
    }

    @Override
    public String toString() {
        return id + " : " + name + " (" + department + ")";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Employee))
            return false;

        Employee e = (Employee) obj;

        return id == e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

// ===========================================
// Generic DataSorter Class
// ===========================================
class DataSorter<T extends Comparable<T>> {

    public List<T> sortList(List<T> list) {
        Collections.sort(list);
        return list;
    }

    public List<T> sortList(List<T> list, Comparator<? super T> comparator) {
        list.sort(comparator);
        return list;
    }

    // ===========================================
    // Enhancement - Generic Filter Method
    // ===========================================
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {

        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}

// ===========================================
// Main Class
// ===========================================
public class Task4 {

    public static void main(String[] args) {

        // ===========================================
        // Q1 - Employee Database using List
        // ===========================================

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "Alice", "Engineering"));
        employeeList.add(new Employee(103, "Bob", "Marketing"));
        employeeList.add(new Employee(102, "Charlie", "HR"));

        System.out.println("Original Employee List");

        employeeList.forEach(System.out::println);

        // ===========================================
        // Q2 - Store Unique Employees using Set
        // ===========================================

        Set<Employee> employeeSet = new HashSet<>(employeeList);

        employeeSet.add(new Employee(101, "Alice", "Engineering"));

        System.out.println("\nUnique Employees");

        employeeSet.forEach(System.out::println);

        // ===========================================
        // Q3 - Employee Database using Map
        // ===========================================

        Map<Integer, Employee> employeeMap = new HashMap<>();

        for (Employee e : employeeList) {
            employeeMap.put(e.getId(), e);
        }

        System.out.println("\nEmployee with ID 102");

        System.out.println(employeeMap.get(102));

        // ===========================================
        // Q4 - Generic DataSorter
        // ===========================================

        DataSorter<Employee> sorter = new DataSorter<>();

        List<Employee> sortedById =
                sorter.sortList(new ArrayList<>(employeeList));

        System.out.println("\nSorted By ID");

        sortedById.forEach(System.out::println);

        List<Employee> sortedByName =
                sorter.sortList(
                        new ArrayList<>(employeeList),
                        Comparator.comparing(Employee::getName));

        System.out.println("\nSorted By Name");

        sortedByName.forEach(System.out::println);

        // ===========================================
        // Q5 - Stream API (Group By Department)
        // ===========================================

        Map<String, List<Employee>> byDepartment =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("\nEmployees By Department");

        byDepartment.forEach((dept, list) ->
                System.out.println(dept + " : " + list));

        // ===========================================
        // Q6 - TreeMap Enhancement
        // ===========================================

        TreeMap<Integer, Employee> treeMap =
                new TreeMap<>(employeeMap);

        System.out.println("\nTreeMap");

        treeMap.forEach((id, emp) ->
                System.out.println(id + " -> " + emp));

        // ===========================================
        // Q7 - Generic Filter Utility
        // ===========================================

        List<Employee> engineeringEmployees =
                DataSorter.filter(
                        employeeList,
                        e -> e.getDepartment().equals("Engineering"));

        System.out.println("\nEngineering Employees");

        engineeringEmployees.forEach(System.out::println);

        // ===========================================
        // Q8 - Type Safe Map
        // ===========================================

        Map<Integer, Employee> safeMap =
                Collections.checkedMap(
                        new HashMap<>(),
                        Integer.class,
                        Employee.class);

        safeMap.putAll(employeeMap);

        System.out.println("\nChecked Map Created");

        // ===========================================
        // Q9 - Immutable List
        // ===========================================

        List<Employee> immutableList =
                List.copyOf(employeeList);

        System.out.println("\nImmutable List");

        immutableList.forEach(System.out::println);

        // ===========================================
        // Q10 - Concurrent HashMap
        // ===========================================

        Map<Integer, Employee> concurrentMap =
                new ConcurrentHashMap<>();

        concurrentMap.putAll(employeeMap);

        System.out.println("\nConcurrent HashMap");

        concurrentMap.forEach((id, emp) ->
                System.out.println(id + " -> " + emp));

        // ===========================================
        // Q11 - Debugging Exercise (Fixed Version)
        // ===========================================

        List<Employee> fixedList = new ArrayList<>();

        fixedList.add(new Employee(101, "Alice", "Engineering"));
        fixedList.add(new Employee(102, "Bob", "Marketing"));

        DataSorter<Employee> fixedSorter = new DataSorter<>();

        fixedSorter.sortList(fixedList);

        System.out.println("\nDebugging Exercise Output");

        fixedList.forEach(System.out::println);
    }
}