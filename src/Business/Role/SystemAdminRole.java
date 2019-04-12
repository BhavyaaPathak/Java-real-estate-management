/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Government;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminWorkAreaJPanel;
//import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Organization organization, Enterprise enterprise,Network network, UserAccount userAccount, Government govt) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, organization, enterprise, network, userAccount, govt); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
//        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
//    }
    
}
