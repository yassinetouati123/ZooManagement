package tn.esprit.gestionemployee.entity;

import java.util.Comparator;

/* Sorts by department name first, then by grade. */
public class EmployeeDepartmentGradeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int result = e1.getDepartmentName().compareTo(e2.getDepartmentName());

        if (result != 0) {
            return result;
        }

        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}
