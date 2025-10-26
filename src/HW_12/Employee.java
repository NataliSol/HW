package HW_12;

import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private String department;
   private Double salary;
    private  List<String> skills;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = new ArrayList<>();
    }
    public Double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public List<String>  getskillsList(){
        return skills;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }
}


