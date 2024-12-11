
public class FullTimeEmployee extends Employee {

    private final double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary, String employee_type) {
        super(name, id, employee_type);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

}
