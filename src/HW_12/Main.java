package HW_12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Employee("Ivan", "IT", 50000));
        company.addEmployee(new Employee("Anna", "HR", 45000));
        company.addEmployee(new Employee("Ira", "HR", 45000));
        company.addEmployee(new Employee("Sergey", "Finance", 120000));
        company.addEmployee(new Employee("Olga", "Marketing", 48000));

        company.getEmployee(0).addSkill("Java");
        company.getEmployee(3).addSkill("SQL");
        company.getEmployee(0).addSkill("SQL");
        company.getEmployee(1).addSkill("SQL");
        company.getEmployee(1).addSkill("SQL");
        company.getEmployee(3).addSkill("SEO");
        company.getEmployee(2).addSkill("SEO");
        company.getEmployee(3).addSkill("Content Marketing");
        company.getEmployee(2).addSkill("Content Marketing");

        List<Employee> employeeList = company.getEmployeeList();


        //Знайдіть 3 наймолодших працівників у відділі "IT" та виведіть їхні імена.
        employeeList.stream()
                .filter(e -> e.getSalary() > 0)
                .sorted(Comparator.comparing(Employee::getSalary))
                .limit(3)
                .forEach(employee -> System.out.println(employee.getSalary() + " " + employee.getName()));

        //Групування: Створіть Map, де ключем є назва відділу, а значенням — список працівників цього відділу.
        Map<String, List<Employee>> departmentSort = company.getEmployeeList()
                .stream().
                collect(Collectors.
                        groupingBy(Employee::getDepartment));

        departmentSort.forEach((department, employees) -> {
            System.out.println("Відділ: " + department);
            employees.forEach(e -> System.out.println("  " + e.getName()));
        });


        //Розгортання (flatMap): Зберіть унікальний список усіх навичок, якими володіють працівники компанії.
                List<String> skilllist = company.getEmployeeList().stream().flatMap(employee -> employee.getskillsList().stream()).distinct().toList();
        skilllist.forEach(System.out::println);

        //   Агрегація: Обчисліть середню зарплату всіх працівників у компанії.
        double avgSalary = company.getEmployeeList().stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println(avgSalary);
        //Пошук: Знайдіть, чи є хоча б один працівник з зарплатою понад 100000.
        boolean salaryHigher100000=company.getEmployeeList()
                .stream()
                .anyMatch(employee -> employee.getSalary()>100000.00);
        System.out.println(salaryHigher100000);
    }
}
