/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class NetworkDirectory {

    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        this.networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network addNetwork(City city) {
        for (Network network : networkList) {
            if (network.getCity().equals(city)) {
                return null;
            }
        }
        Network network = new Network(city);
        networkList.add(network);
        return network;
    }

}
