/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.TenantDirectory;
import Business.Role.ManagementRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public class ManagementOrganization extends Organization {

    private TenantDirectory tenantDirectory;

    public ManagementOrganization() {
        super(Type.Management.getValue(),Type.Management);
        tenantDirectory = new TenantDirectory();
    }



    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roles = new ArrayList();
        roles.add(new ManagementRole());
        return roles;
    }

}
