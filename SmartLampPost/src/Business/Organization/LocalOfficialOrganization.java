/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LocalOfficial;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class LocalOfficialOrganization extends Organization {

    public LocalOfficialOrganization() {
        super(Organization.Type.LocalOfficial.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LocalOfficial());
        return roles;
    }
}
