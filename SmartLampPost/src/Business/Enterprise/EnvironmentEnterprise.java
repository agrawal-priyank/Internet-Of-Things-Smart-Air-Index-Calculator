/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class EnvironmentEnterprise extends Enterprise {

    public EnvironmentEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Environment);
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
