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
import javax.swing.JPanel;

/**
 *
 * @author Priyank
 */
public abstract class Role {

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem);

    public enum RoleType {

        Administrator("Administrator"),
        Resident("Resident"),
        Engineer("Engineer"),
        Researcher("Researcher"),
        LocalOfficial("LocalOfficial");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
