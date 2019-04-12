/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
//import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    //private CustomerDirectory customerDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;
    private Type type;
    

    public enum Type {
        Admin("Admin Organization"),
        RealEstate("RealEstate Organization"), 
        Management("Management Organization"), 
        Tenant("Tenant Organization"),
        Agent("Agent Organization"),
        
        
        Maintenance("Maintenance Organization"),
        MaintenanceAdmin("MaintenanceAdmin Organization"),
        
        CleaningAndTrash("Cleaning and trash"),
        Laundry("Laundry"),
        Electricity("Electricity");
        
        
        
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name,Type type) {
//        this.type = type;
//        this.name = type.getValue();
        this.name = name;
        this.type = type;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }


    public Type getType() {
        return type;
    }

}
