/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RealEstateAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public class RealEstateAdminOrganization extends Organization {
    
    public RealEstateAdminOrganization() {
        super(Type.RealEstate.getValue(),Type.RealEstate);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RealEstateAdminRole());
        return roles;
    }

    
    
}
