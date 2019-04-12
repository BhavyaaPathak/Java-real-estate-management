/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class TenantDirectory {

    private ArrayList<Tenant> tenantDirectory;

    public TenantDirectory() {
        tenantDirectory = new ArrayList<>();
    }

    public ArrayList<Tenant> getTenantDirectory() {
        return tenantDirectory;
    }

    public void setTenantDirectory(ArrayList<Tenant> tenantDirectory) {
        this.tenantDirectory = tenantDirectory;
    }

    public Tenant addTenant() {
        Tenant tenant = new Tenant();
        this.tenantDirectory.add(tenant);
        return tenant;
    }

}
