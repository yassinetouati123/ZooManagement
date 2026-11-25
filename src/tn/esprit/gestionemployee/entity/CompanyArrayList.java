package tn.esprit.gestionemployee.entity;

import java.util.ArrayList;
import java.util.Collections;

public class CompanyArrayList implements IGestion<Employee> {

    private final ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        if (employee == null) {
            System.out.println("The employee cannot be null");
            return;
        }

        if (employees.contains(employee)) {
            System.out.println("Employee already exists: " + employee.getLastName());
            return;
        }

        employees.add(employee);
    }

    /* Searches by last name. */
    @Override
    public boolean searchEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getLastName().equalsIgnoreCase(name)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean searchEmployee(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        if (employees.remove(employee)) {
            System.out.println("Employee deleted: " + employee.getLastName());
        } else {
            System.out.println("Employee not found: " + employee.getLastName());
        }
    }

    @Override
    public void displayEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void sortEmployeeById() {
        Collections.sort(employees);
    }

    @Override
    public void sortEmployeeByDepartementNameAndGrade() {
        employees.sort(new EmployeeDepartmentGradeComparator());
    }
}
