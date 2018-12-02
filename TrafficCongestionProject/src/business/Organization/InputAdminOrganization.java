/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.ConstructionManagerRole;
import business.Role.InputEnterpriseAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author VARSHA PREMANI
 */
public class InputAdminOrganization extends Organization {
     public InputAdminOrganization() 
    {
        super(Organization.OrganizationType.InputEnterpriseAdminOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InputEnterpriseAdminRole());
        return roles;    }
}
