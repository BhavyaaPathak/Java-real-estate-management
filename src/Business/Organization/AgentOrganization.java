/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public class AgentOrganization extends Organization {

    public AgentOrganization() {
        super(Type.Agent.getValue(),Type.Agent);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roles = new ArrayList();
        roles.add(new AgentRole());
        return roles;
    }

}
