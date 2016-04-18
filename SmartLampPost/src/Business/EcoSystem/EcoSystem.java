/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdministrator;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    private EcoSystem() {
        super(null);
        this.networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createNetwork() {
        Network network = new Network();
        this.networkList.add(network);
        return network;
    }

    public void removeNetwork(Network network) {
        this.networkList.remove(network);
    }

    public Network searchNetwork(String networkName) {
        for (Network network : this.networkList) {
            if (network.getNetworkName().equalsIgnoreCase(networkName)) {
                return network;
            }
        }
        return null;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdministrator());
        return roleList;

    }
}
