/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Administrator.getValue())) {
            organization = new AdministratorOrganization();
            this.organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Engineer.getValue())) {
            organization = new EngineerOrganization();
            this.organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.LocalOfficial.getValue())) {
            organization = new LocalOfficialOrganization();
            this.organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Researcher.getValue())) {
            organization = new ResearchOrganization();
            this.organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Resident.getValue())) {
            organization = new ResidentOrganization();
            this.organizationList.add(organization);
        }
        return organization;
    }

    public Organization searchOrganization(Organization org) {
        for (Organization o : organizationList) {
            if (o.equals(org)) {
                return o;
            }
        }
        return null;
    }

    public Organization searchOrganization(Type type) {
        for (Organization o : organizationList) {
            if (o.equals(type)) {
                return o;
            }
        }
        return null;
    }
}
