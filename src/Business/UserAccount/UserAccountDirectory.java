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
import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public class UserAccountDirectory {
   
     private ArrayList<UserAccount> userAccountList;
     private EmployeeDirectory employeeDirectory;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
        employeeDirectory = new EmployeeDirectory();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    
    
}
