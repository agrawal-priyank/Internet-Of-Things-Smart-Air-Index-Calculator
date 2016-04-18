/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdministrator.SystemAdministratorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Priyank
 */
public class SystemAdministrator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new SystemAdministratorWorkAreaJPanel(userProcessContainer, ecoSystem, organization);
    }

    @Override
    public String toString() {
        return "System Administrator";
    }
}
