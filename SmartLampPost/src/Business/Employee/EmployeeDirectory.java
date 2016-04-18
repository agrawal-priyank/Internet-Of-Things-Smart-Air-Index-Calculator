/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeDirectory;

    public EmployeeDirectory() {
        employeeDirectory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public Employee createEmployee(String employeeName) {
        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        this.employeeDirectory.add(employee);
        return employee;
    }

    public Employee createEmployee(String employeeName, String phoneNumber) {
        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        employee.setPhoneNumber(phoneNumber);
        this.employeeDirectory.add(employee);
        return employee;
    }

    public void removeEmployee(Employee employee) {
        this.employeeDirectory.remove(employee);
    }

    public Employee searchEmployee(String employeeName) {
        for (Employee employee : employeeDirectory) {
            if (employee.getEmployeeName() == employeeName) {
                return employee;
            }
        }
        return null;
    }
}
