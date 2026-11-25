package tn.esprit.gestionemployee.main;

import tn.esprit.gestionemployee.entity.CompanyArrayList;
import tn.esprit.gestionemployee.entity.Employee;

public class Main {

    public static void main(String[] args) {

        CompanyArrayList company = new CompanyArrayList();

        Employee e1 = new Employee(3, "Ben Ali", "Sami", "IT", 2);
        Employee e2 = new Employee(1, "Trabelsi", "Nour", "HR", 3);
        Employee e3 = new Employee(2, "Gharbi", "Mehdi", "IT", 1);

        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);
        company.addEmployee(new Employee(3, "Ben Ali", "Sami", "Finance", 5)); // duplicate

        System.out.println("--- Initial list ---");
        company.displayEmployee();

        System.out.println("\n--- Sorted by id ---");
        company.sortEmployeeById();
        company.displayEmployee();

        System.out.println("\n--- Sorted by department then grade ---");
        company.sortEmployeeByDepartementNameAndGrade();
        company.displayEmployee();

        System.out.println("\nSearch 'Gharbi': " + company.searchEmployee("Gharbi"));
        System.out.println("Search e2: " + company.searchEmployee(e2));

        System.out.println();
        company.deleteEmployee(e2);
        System.out.println("Search e2 after delete: " + company.searchEmployee(e2));

        System.out.println("\n--- Final list ---");
        company.displayEmployee();
    }
}
