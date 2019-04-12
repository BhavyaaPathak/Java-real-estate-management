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
import javax.swing.JPanel;

/**
 *
 * @author kanikamakhija
 */
public abstract class Role {

//     private String role;
    public enum RoleType {

        Admin("Admin"),
        RealEstate("RealEstate"),
        Management("Management"),
        Maintenance("Maintenance"),
        //        MaintenanceAdmin("Maintenance Admin"),
        Electricity("Electricity"),
        CleaningAndTrash("Cleaning and trash"),
        Laundry("Laundry"),
        PlumbingAndDrainageSystem("Plumbing and drainage"),
        Verification("Verification"),
        Agent("Agent"),
        Tenant("Tenant");

        private String value;

        private RoleType(String value) {
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

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            Organization organization,
            Enterprise enterprise,
            Network netWork,
            UserAccount userAccount,
            Government govt);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
