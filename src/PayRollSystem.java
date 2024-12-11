
import java.util.ArrayList;

public class PayRollSystem {

    private ArrayList<Employee> employees;

    public PayRollSystem() {
        employees = new ArrayList<>();
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);

    }

    public void removeEmployee(int id) {
        // * Using foreach
        // Employee remove = null;
        // for (Employee employee : employees) {
        //     if (employee.getID() == id) {
        //         remove = employee;
        //         break;
        //     }
        // }
        // if (remove != null) {
        //     employees.remove(remove);
        // }
        // *************************************************

        // // * Using Iterator
        // Iterator< Employee> iterator = employees.iterator();
        // while (iterator.hasNext()) {
        //     Employee employee = iterator.next();
        //     if (employee.getID() == id) {
        //         iterator.remove();
        //     }
        // }
        // *************************************************
        // // * Using remove method
        // employees.removeIf(employee -> employee.getID() == id);
    }

    // * GET LIST
    public void employeeList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
