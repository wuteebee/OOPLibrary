public class ManagerAccount {
    private String managerID;
    private float salary;
    private final String role = "manager";

    public ManagerAccount(String managerID, float salary) {
        this.managerID = managerID;
        this.salary = salary;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
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
        return "ManagerAccount{" +
                "managerID='" + managerID + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }
}