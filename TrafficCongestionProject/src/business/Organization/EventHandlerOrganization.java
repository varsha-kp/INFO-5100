/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.EventHandlerTeamRole;
import business.Role.Role;
import java.util.ArrayList;


public class EventHandlerOrganization extends Organization {
    public EventHandlerOrganization()
    {
        super(Organization.OrganizationType.EventHandler.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new EventHandlerTeamRole());
        return roles;
    }
}
