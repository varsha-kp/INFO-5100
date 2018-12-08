/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.ConstructionManagerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import business.Network.Network;
import userInterface.AdministrativeRole.InputEnterpriseAdminJPanel;


public class InputEnterpriseAdminRole extends Role {
    
    public static Organization.OrganizationType[] types = {Organization.OrganizationType.Commuter,Organization.OrganizationType.SystemEngineer};
     @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InputEnterpriseAdminJPanel(userProcessContainer, enterprise,business); }
    
}
