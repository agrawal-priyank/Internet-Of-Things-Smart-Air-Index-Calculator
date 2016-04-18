/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import com.db4o.foundation.Environment;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Environment) {
            enterprise = new EnvironmentEnterprise(name);
            this.enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public void removeEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Environment) {
            this.enterpriseList.remove(name);
        }
    }

    public Enterprise searchEnterprise(String enterpriseName) {
        for (Enterprise enterprise : this.enterpriseList) {
            if (enterprise.getName().equalsIgnoreCase(enterpriseName)) {
                return enterprise;
            }
        }
        return null;
    }
}
