/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.ConstructionAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author VARSHA PREMANI
 */
public class ConstructionAdminOrganization extends Organization {
     
    
    public ConstructionAdminOrganization() 
    {
        super(Organization.OrganizationType.ConstructionAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ConstructionAdminRole());
        return roles;    }
    
}
