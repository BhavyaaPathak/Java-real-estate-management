/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Government;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.RealEstateAdminRole.RealEstateMainJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kanikamakhija
 */

  public class RealEstateAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Organization organization, Enterprise enterprise,Network network, UserAccount userAccount, Government govt) {
        return new RealEstateMainJPanel(userProcessContainer, organization, enterprise, network, userAccount, govt); //To change body of generated methods, choose Tools | Templates.
    }




    
    

}
