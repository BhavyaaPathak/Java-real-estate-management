/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
//import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;

/**
 *
 * @author kanikamakhija
 */
public class UserAccount {

    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;

    public UserAccount() {
        workQueue = new WorkQueue();
        person = new Employee();
        employeeDirectory = new EmployeeDirectory();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    @Override
    public String toString() {
        return person.getFirstName();
    }

}
