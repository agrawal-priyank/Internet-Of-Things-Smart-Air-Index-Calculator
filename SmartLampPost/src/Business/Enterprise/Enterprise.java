/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Sensor.SensorDirectory;
import Business.Street.StreetDirectory;

/**
 *
 * @author Priyank
 */
public abstract class Enterprise extends Organization {

    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    private StreetDirectory streetDirectory;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        this.organizationDirectory = new OrganizationDirectory();
        this.streetDirectory = new StreetDirectory();
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public StreetDirectory getStreetDirectory() {
        return streetDirectory;
    }

    public void setStreetDirectory(StreetDirectory streetDirectory) {
        this.streetDirectory = streetDirectory;
    }
   
    public static enum EnterpriseType {

        Environment("Environment");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return this.value;
        }       
    }
}
