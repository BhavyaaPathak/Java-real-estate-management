/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TenantWorkRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhavyapathak
 */
public class MaintenanceEnterprise extends Enterprise {

    public MaintenanceEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Maintenance);
    }

    @Override
    public ArrayList<Type> getSupportedOrganization() {
        ArrayList<Type> list =  new ArrayList<Type>();
        list.add(Type.Electricity);
        list.add(Type.Laundry);
        list.add(Type.CleaningAndTrash);
        list.add(Type.MaintenanceAdmin);
        return list;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addWorkRequest(TenantWorkRequest tenantWorkRequest){
        this.getWorkQueue().getWorkRequestList().add(tenantWorkRequest);
        UserAccount admin = this.getUserAccountDirectory().getUserAccountList().get(0);
        admin.getWorkQueue().getWorkRequestList().add(tenantWorkRequest);
    }

    
    
}
