/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization.Type;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TenantWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author bhavyapathak
 */
public class RealEstateEnterprise extends Enterprise {

    public RealEstateEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.RealEstate);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    
    @Override
    public ArrayList<Type> getSupportedOrganization() {
        ArrayList<Type> list =  new ArrayList<>();
        list.add(Type.Agent);
        list.add(Type.Tenant);
        list.add(Type.Management);
        return list;
    }

    public void addWorkRequest(TenantWorkRequest tenantWorkRequest){
        this.getWorkQueue().getWorkRequestList().add(tenantWorkRequest);
        UserAccount admin = this.getUserAccountDirectory().getUserAccountList().get(0);
        admin.getWorkQueue().getWorkRequestList().add(tenantWorkRequest);
    }
   

}
