public class EmployeeAccount {
    private String employeeID;
    private float salary;
    private final String role = "staff";

    public EmployeeAccount(String employeeID, float salary) {
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "EmployeeAccount{" +
                "employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }
}
