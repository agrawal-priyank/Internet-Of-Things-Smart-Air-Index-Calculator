/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Resident.ResidentDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public abstract class Organization {

    private String name;
    private EmployeeDirectory employeeDirectory;
    private ResidentDirectory residentDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private static int count = 0;
    private int id;

    public enum Type {

        Administrator("AdministratorOrganization"), Resident("Resident Organization"), Engineer("Engineer Organization"),
        Researcher("Research Organization"), LocalOfficial("LocalOfficial Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.residentDirectory = new ResidentDirectory();
        this.workQueue = new WorkQueue();
        count++;
        id = count;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public ResidentDirectory getResidentDirectory() {
        return residentDirectory;
    }

    public void setResidentDirectory(ResidentDirectory residentDirectory) {
        this.residentDirectory = residentDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
