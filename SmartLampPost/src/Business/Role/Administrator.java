/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdministratorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Administrator.AdministratorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Priyank
 */
public class Administrator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new AdministratorWorkAreaJPanel(userProcessContainer, userAccount, (AdministratorOrganization) organization, enterprise, ecoSystem);
    }

    @Override
    public String toString() {
        return "Administrator";
    }
}
