package tn.esprit.gestionemployee.entity;

public interface IGestion<T> {

    void addEmployee(T t);

    boolean searchEmployee(String name);

    boolean searchEmployee(T t);

    void deleteEmployee(T t);

    void displayEmployee();

    void sortEmployeeById(); // Comparable

    void sortEmployeeByDepartementNameAndGrade(); // Comparator
}
