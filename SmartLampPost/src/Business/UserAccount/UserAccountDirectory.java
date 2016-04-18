/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Resident.Resident;
import Business.Role.Role;
import Business.Street.Street;
import java.util.ArrayList;

/**
 *
 * @author priyank
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        this.userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(String username, String password, Street streetLocation, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setStreetLocation(streetLocation);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        this.userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(String username, String password, Street streetLocation, Resident resident, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setStreetLocation(streetLocation);
        userAccount.setResident(resident);
        userAccount.setRole(role);
        this.userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : this.userAccountList) {
            if ((ua.getUsername().equals(username)) && (ua.getPassword().equals(password))) {
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount searchUser(Street street){
         for (UserAccount ua : this.userAccountList) {
            if (ua.getStreetLocation() == street) {
                return ua;
            }
        }
        return null;
    }
    
//    public UserAccount searchUser(Role.RoleType roleType){
//         for (UserAccount ua : this.userAccountList) {
//            if (ua.getRole().) {
//                return ua;
//            }
//        }
//        return null;
//    }
//    
    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : this.userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
