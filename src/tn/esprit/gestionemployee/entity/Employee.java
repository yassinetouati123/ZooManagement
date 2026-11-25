package tn.esprit.gestionemployee.entity;

public class Employee implements Comparable<Employee> {

    private int id;
    private String lastName;
    private String firstName;
    private String departmentName;
    private int grade;

    public Employee() {
    }

    public Employee(int id, String lastName, String firstName,
                    String departmentName, int grade) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.departmentName = departmentName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /* Two employees are equal if they have the same id and the same name. */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) obj;

        return id == other.id
                && java.util.Objects.equals(lastName, other.lastName)
                && java.util.Objects.equals(firstName, other.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, lastName, firstName);
    }

    /* Natural order: by id (used by sortEmployeeById). */
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(id, other.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
