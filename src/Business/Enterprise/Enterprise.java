/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private final OrganizationDirectory organizationDirectory;
    private EnterpriseDirectory enterpriseDirectory;
//    private final WorkQueue workQueue;


    public enum EnterpriseType {

        RealEstate("Real Estate"),
        Verification("Verification"),
        Maintenance("Maintenance");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name,null);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
//        workQueue = new WorkQueue();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    
//    public Enterprise(String name, EnterpriseType type) {
//        this.enterpriseType = type;
//        organizationDirectory = new OrganizationDirectory();
//        workQueue = new WorkQueue();
//    }
//    public OrganizationDirectory getOrganizationDirectory() {
//        return organizationDirectory;
//    }
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    public void setEnterpriseType (EnterpriseType enterpriseType){
        this.enterpriseType=enterpriseType;
    }
    
    public abstract ArrayList<Organization.Type> getSupportedOrganization();
//    public void addWorkRequest(WorkRequest workRequest){
//        this.workQueue.getWorkRequestList().add(workRequest);
//        for (Organization organization : this.organizationDirectory.getOrganizationList()) {
//            final Organization.Type type = organization.getType(); 
//                if(type.equals(Organization.Type.MaintenanceAdmin) || type.equals(Organization.Type.RealEstateAdmin) || type.equals(Organization.Type.Verification)){
//                    organization.getWorkQueue().getWorkRequestList().add(workRequest);
//                    break;
//                }
//        }
//    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
}
