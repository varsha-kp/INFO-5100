/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author barkhasamyani
 */
public class PoliceDepartment extends Enterprise {

    public PoliceDepartment(String name) {
      super(name,Enterprise.EnterpriseType.PoliceDepartment);
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
