/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author parth
 */
public class Network {

    private City city;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(City city) {
        this.city = city;
        this.enterpriseDirectory = new EnterpriseDirectory();
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return this.city.toString();
    }
    
    
    
}
