/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.City;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public class Government extends Organization {

    private static Government business;
    private ArrayList<Network> networkList;

    public static Government getInstance() {
        if (business == null) {
            business = new Government();
        }
        return business;
    }

    public Network createAndAddNetwork(City city) {
//        for (Network network : networkList) {
//            if (network.getCity().equals(city)) {
//                return null;
//            }
//        }
        Network network = new Network(city);
        networkList.add(network);
        return network;
    }

    private Government() {
        super("Government", null);
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

}
