/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Engineer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class EngineerOrganization extends Organization {

    public EngineerOrganization() {
        super(Organization.Type.Engineer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Engineer());
        return roles;
    }
}
