/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class EnterpriseDirectory {

    private ArrayList<MaintenanceDepartment> maintenanceDepartments;
    private RealEstateDirectory realEstateDirectory;
    private VerificationDepartment verificationDepartment;
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        maintenanceDepartments = new ArrayList<MaintenanceDepartment>();
        realEstateDirectory = new RealEstateDirectory();
        enterpriseList = new ArrayList<Enterprise>();
    }

    public MaintenanceDepartment addMaintenanceDept() {
        MaintenanceDepartment acc = new MaintenanceDepartment();
        this.maintenanceDepartments.add(acc);
        return acc;
    }


    public ArrayList<MaintenanceDepartment> getMaintenanceDept() {
        return maintenanceDepartments;
    }

    public RealEstateDirectory getRealEstateDirectory() {
        return realEstateDirectory;
    }
    
    public void addVerificationDepartment(){
        this.verificationDepartment = new VerificationDepartment();
    }
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.RealEstate){
            enterprise=new RealEstateEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Maintenance){
            enterprise=new MaintenanceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Verification){
            enterprise=new VerificationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
