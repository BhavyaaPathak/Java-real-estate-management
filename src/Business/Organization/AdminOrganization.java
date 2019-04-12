/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author kanikamakhija
 */
public class AdminOrganization extends Organization {

    public AdminOrganization() {
        super(Type.Admin.getValue(),Type.Admin);
    }

//    @Override
//    public ArrayList<Business.Role.Role> getSuportedRole() {
//        ArrayList<Business.Role.Role> roles = new ArrayList();
//        roles.add(new AdminRole());
//        return roles;
//    }
    @Override
    public ArrayList<Business.Role.Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }

}
