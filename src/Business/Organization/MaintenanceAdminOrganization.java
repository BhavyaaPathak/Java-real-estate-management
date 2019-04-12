/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MaintenanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class MaintenanceAdminOrganization extends Organization {

    public MaintenanceAdminOrganization() {
        super(Type.Maintenance.getValue(),Type.Maintenance);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roles = new ArrayList();
        roles.add(new MaintenanceRole());
        return roles;
    }

}
