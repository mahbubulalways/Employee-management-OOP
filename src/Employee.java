
abstract class Employee {

    private String name;
    private String employee_type;
    private int id;

    public Employee(String name, int id, String employee_type) {
        this.name = name;
        this.id = id;
        this.employee_type = employee_type;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee {"
                + "\n"
                + "id: " + id + "\n"
                + "name: " + name + "\n"
                + "employee_type: " + employee_type + "\n"
                + "salary: " + calculateSalary() + "\n"
                + "}";

    }

}
