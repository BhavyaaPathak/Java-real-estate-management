/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public class OrganizationDirectory {
 private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Management.getValue())){
            organization = new ManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Agent.getValue())){
            organization = new AgentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Tenant.getValue())){
            organization = new TenantOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Laundry.getValue())){
            organization = new LaundryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Electricity.getValue())){
            organization = new ElectricityOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CleaningAndTrash.getValue())){
            organization = new CleaningAndTrashOrganization();
            organizationList.add(organization);
        }
        return organization;
    }   
}
