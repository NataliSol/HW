package HW_12;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployee(int number) {
        return employees.get(number);
    }

    public List<Employee> getEmployeeList() {
        return employees;
    }
}

