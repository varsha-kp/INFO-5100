/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ConstructionManagerRole;

import business.CongestionSolutionConstruction.CongestionSolutionConstruction;
import business.Organization.ConstructionEmployeeOrganization;
import business.CongestionSolutionConstruction.CongestionSolutionConstructionDirectory;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.ConstructionManagerOrganization;
import business.Organization.Organization;
import business.Organization.TrafficCongestionManagementOrganization;
import business.Route.Route;
import business.UserAccount.UserAccount;
import business.WorkQueue.CongestionSolutionWorkRequest;
import business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ConstructionManagerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private ConstructionManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private CongestionSolutionConstructionDirectory congestionSolutionConstructionDirectory;
    /**
     * Creates new form ConstructionManagerWorkAreaJPanel
     */
    public ConstructionManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ConstructionManagerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business=business;
        congestionSolutionConstructionDirectory=organization.getCongestionsolutionconstructiondirectory();
        populateConstructionTable();
        addCongestionSolutionsConstruction();
        populateconstructionEmployeeComboBox();
    }

    public void populateConstructionTable(){
        DefaultTableModel defaultTableModel=(DefaultTableModel)constructionTable.getModel();
        
        defaultTableModel.setRowCount(0);
            for(WorkRequest workRequest:organization.getWorkQueue().getWorkRequestList()){
                Object row[]=new Object[8];
                row[0]=((CongestionSolutionWorkRequest)workRequest).getRoute();
                row[1]=((CongestionSolutionWorkRequest)workRequest).getRoute().isCongestion();
                row[2]=workRequest.getProblem();
                row[3]=workRequest.getRequestDate();
                row[4]=workRequest.getResolveDate();
                row[5]=workRequest.getSender();
                row[6]=workRequest.getReceiver();
                row[7]=(CongestionSolutionWorkRequest)workRequest;
               
//                row[2]=route.getDistance();
                defaultTableModel.addRow(row);
            
        }
    }
    
    public void addCongestionSolutionsConstruction()
    {
        if(congestionSolutionConstructionDirectory.getCongestionSolutionConstructionList().isEmpty()){
        CongestionSolutionConstruction cp11=congestionSolutionConstructionDirectory.addCongestionSolutionConstruction();
        cp11.setSolutionName("Add Lane");
        CongestionSolutionConstruction cp12=congestionSolutionConstructionDirectory.addCongestionSolutionConstruction();
        cp12.setSolutionName("Upgrade road");
        CongestionSolutionConstruction cp13=congestionSolutionConstructionDirectory.addCongestionSolutionConstruction();
        cp13.setSolutionName("Build Overpass");
        CongestionSolutionConstruction cp14=congestionSolutionConstructionDirectory.addCongestionSolutionConstruction();
        cp14.setSolutionName("Build High Occupancy Lane");
        CongestionSolutionConstruction cp15=congestionSolutionConstructionDirectory.addCongestionSolutionConstruction();
        cp15.setSolutionName("Build Underpass");
        }
    }
    
//    public void populateConstructionComboBox(){
//        constructionEmployeeComboBox.removeAllItems();
//        for(CongestionSolutionConstruction congestionSolutionConstruction:congestionSolutionConstructionDirectory.getCongestionSolutionConstructionList())
//        {
//            constructionEmployeeComboBox.addItem(congestionSolutionConstruction);
//        }
//    }
    public void populateconstructionEmployeeComboBox()
    {constructionEmployeeComboBox.removeAllItems();
        for(Organization og:enterprise.getOrganizationDirectory().getOrganizationList()){
        for(UserAccount ua:og.getUserAccountDirectory().getUserAccountList())
        {
           if(ua.getRole().toString().equalsIgnoreCase("business.Role.ConstructionEmployee"))
            {
                constructionEmployeeComboBox.addItem(ua);
            }
            
//            if(ua.getRole().equals("business.Role.ConstructionEmployee"))
//            {
//                constructionEmployeeComboBox.addIt
//            }
        }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        constructionEmployeeComboBox = new javax.swing.JComboBox();
        btnassignemployee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        constructionTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Construction Manager Work Area:");

        constructionEmployeeComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        constructionEmployeeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        constructionEmployeeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constructionEmployeeComboBoxActionPerformed(evt);
            }
        });

        btnassignemployee.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnassignemployee.setText("Assign employee");
        btnassignemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignemployeeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Select Employee:");

        constructionTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        constructionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route Name", "Congested?", "Type of Problem", "Start date", "End date", "Sender", "Receiver", "Proposed Solution"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(constructionTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnassignemployee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(constructionEmployeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(constructionEmployeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnassignemployee)
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnassignemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignemployeeActionPerformed
        // TODO add your handling code here:
        UserAccount ua=(UserAccount)constructionEmployeeComboBox.getSelectedItem();
      // CongestionSolutionConstruction congestionSolutionConstruction=(CongestionSolutionConstruction)constructionEmployeeComboBox.getSelectedItem();
        int selectedRow=constructionTable.getSelectedRow();
        if(selectedRow>=0){
        CongestionSolutionWorkRequest workRequest=(CongestionSolutionWorkRequest)constructionTable.getValueAt(selectedRow, 7);
        Route route=(Route)constructionTable.getValueAt(selectedRow,0);
        if(route.isCongestion()==true){
        workRequest.setReceiver(ua);
       // workRequest.setSolution(congestionSolutionConstruction.getSolutionName());
        Date date= new Date();
        workRequest.setResolveDate(date);
        
      //  route.setCongestion(false);
        route.setCongestionProblem("");
      //  route.setEventHandlerSolution(congestionSolutionConstruction.getSolutionName());
        route.setResolveDate(date);
        route.setReceiver(ua);
        ua.incrementSolved();
        populateConstructionTable();
       Organization org=null;
                for(Network network:business.getNetworkList()){
                    for(Enterprise enter:network.getEnterpriseDirectory().getEnterpriseList()){
                        for(Organization organization : enter.getOrganizationDirectory().getOrganizationList()){
                         //   System.out.println(organization);
                            if(organization instanceof ConstructionEmployeeOrganization){
                                org=organization;
                                System.out.println(org);
                                break;
                                    
                            }
                        }
                    }
                }
               
                if(org!=null){
                    org.getWorkQueue().getWorkRequestList().add(workRequest);
                    ua.getWorkQueue().getWorkRequestList().add(workRequest);
                   populateConstructionTable();
                    JOptionPane.showMessageDialog(null, "Congestion Problem reported successfully", "Succes", JOptionPane.INFORMATION_MESSAGE);
                }
        }
        }
    }//GEN-LAST:event_btnassignemployeeActionPerformed
    
    private void constructionEmployeeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constructionEmployeeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constructionEmployeeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnassignemployee;
    private javax.swing.JComboBox constructionEmployeeComboBox;
    private javax.swing.JTable constructionTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}