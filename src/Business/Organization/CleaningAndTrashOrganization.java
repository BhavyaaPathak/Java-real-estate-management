/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CleaningAndTrashRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhavyapathak
 */
public class CleaningAndTrashOrganization extends Organization {
    public CleaningAndTrashOrganization() {
        super(Type.CleaningAndTrash.getValue(),Type.CleaningAndTrash);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roles = new ArrayList();
        roles.add(new CleaningAndTrashRole());
        return roles;
    }
}
