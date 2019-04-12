/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TenantRole;
import java.util.ArrayList;

/**
 *
 * @author bhavyapathak
 */
public class TenantOrganization extends Organization{
    public TenantOrganization() {
        super(Type.Tenant.getValue(),Type.Tenant);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roles = new ArrayList();
        roles.add(new TenantRole());
        return roles;
    }
}

