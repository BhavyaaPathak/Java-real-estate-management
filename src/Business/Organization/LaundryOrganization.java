/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LaundryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhavyapathak
 */
public class LaundryOrganization extends Organization {
    public LaundryOrganization() {
        super(Type.Laundry.getValue(),Type.Laundry);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roles = new ArrayList();
        roles.add(new LaundryRole());
        return roles;
    }
}
