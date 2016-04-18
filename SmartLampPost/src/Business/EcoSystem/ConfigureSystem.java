/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Employee.Employee;
import Business.Role.Administrator;
import Business.Role.SystemAdministrator;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Priyank
 */
public class ConfigureSystem {

    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdministrator());
        return system;
    }
}
