/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CongestionSolutionConstruction;

/**
 *
 * @author Swarup
 */
public class CongestionSolutionConstruction {
    private String solutionName;

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    @Override
    public String toString() {
        return solutionName ;
    }
    
}
