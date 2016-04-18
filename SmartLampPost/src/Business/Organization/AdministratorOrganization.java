/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Administrator;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class AdministratorOrganization extends Organization {

    public AdministratorOrganization() {
        super(Organization.Type.Administrator.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Administrator());
        return roles;
    }
}
