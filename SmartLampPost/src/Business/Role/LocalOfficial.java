/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LocalOfficialOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.LocalOfficial.LocalOfficialWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Priyank
 */
public class LocalOfficial extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new LocalOfficialWorkAreaJPanel(userProcessContainer, userAccount, (LocalOfficialOrganization) organization, enterprise, ecoSystem);
    }

    @Override
    public String toString() {
        return "Local Official";
    }
}
