/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Researcher.ResearcherWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Priyank
 */
public class Research extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new ResearcherWorkAreaJPanel(userProcessContainer, userAccount, (ResearchOrganization) organization, enterprise, ecoSystem);
    }

    @Override
    public String toString() {
        return "Researcher";
    }
}
