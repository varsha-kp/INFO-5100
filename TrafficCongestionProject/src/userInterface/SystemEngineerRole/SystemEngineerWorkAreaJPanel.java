/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemEngineerRole;

import business.CongestionProblem.CongestionProblem;
import business.CongestionProblem.CongestionProblemDirectory;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Location.Location;
import business.Location.LocationDirectory;
import business.Network.Network;
import business.Organization.CommuterOrganization;
import business.Organization.ConstructionManagerOrganization;
import business.Organization.TrafficCongestionManagementOrganization;
import business.Organization.Organization;
import business.Organization.SystemEngineerOrganization;
//import business.RandomData.RandomData;
import business.Route.Route;
//import business.Organization.InformationManagerOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CongestionSolutionWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class SystemEngineerWorkAreaJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
    private SystemEngineerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private String test;
    private String routeName;
    private String sender;
    private Route route;
    private EcoSystem business;
    private CongestionProblemDirectory congestionProblemDirectory;
    private CongestionProblem congestionProblem;
    
    /**
     * Creates new form InformationManagerWorkAreaJPanel
     */
    public SystemEngineerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SystemEngineerOrganization organization, Enterprise enterprise,EcoSystem business) {
    
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business=business;
        congestionProblemDirectory=enterprise.getCongestionProblemDirectory();
        enterprise.addCongestionProblems();
//        this.carDriverOrganization=organization;
        populateTable();
        
        
    }

   
 
     @Override
    public String toString() {
        return routeName;
    }
       public void populateTable(){
        Random random=new Random();
        ArrayList<String> routeNameList = new ArrayList<String>();
	for(Location location:enterprise.getLocationDirectory().getLocationList()){
            for(Route route:location.getRouteDirectory().getRouteList()){
                routeNameList.add(route.getRouteName());
            }
        }	
        ArrayList<String> congestionProblemList=new ArrayList<>();
        for(CongestionProblem congestionProblem:enterprise.getCongestionProblemDirectory().getCongestionProblemList()){
            congestionProblemList.add(congestionProblem.getProblemName());
        }
          int index = random.nextInt(routeNameList.size());
        int index1 = random.nextInt(congestionProblemList.size());
//        int index2 = random.nextInt(senderList.size());
        DefaultTableModel defaultTableModel=(DefaultTableModel)congestionProblemTable.getModel();
//        defaultTableModel.setRowCount(0);
        
            
                Object row[]=new Object[7];
                routeName=routeNameList.get(index);
                row[0]=routeName;
                row[1]="True";
                test=congestionProblemList.get(index1);
                row[2]=test;
                row[3]=new Date();
                row[4]="";
                row[5]=userAccount;
                row[6]="";
//                row[2]=route.getDistance();
                defaultTableModel.addRow(row);
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        congestionProblemTable = new javax.swing.JTable();
        btnReportProblem = new javax.swing.JButton();
        btnReportProblem1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        congestionProblemTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        congestionProblemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route Name", "Congested?", "Type of Problem", "Start date", "End date", "Sender", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(congestionProblemTable);

        btnReportProblem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReportProblem.setText("Report Problem");
        btnReportProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportProblemActionPerformed(evt);
            }
        });

        btnReportProblem1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReportProblem1.setText("Look for another Sensor problem");
        btnReportProblem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportProblem1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Sensor Input Work Area:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnReportProblem1)
                        .addGap(26, 26, 26)
                        .addComponent(btnReportProblem))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportProblem)
                    .addComponent(btnReportProblem1))
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportProblemActionPerformed
        // TODO add your handling code here:
                   int selectedRow=congestionProblemTable.getSelectedRow();
        if(selectedRow>=0){
            String route1=(String)congestionProblemTable.getValueAt(selectedRow,0);
            for(Location location:enterprise.getLocationDirectory().getLocationList()){
                for(Route route:location.getRouteDirectory().getRouteList()){
                    if(route.getRouteName().equals(route1)){
                        this.route=route;
                        break;
                    }
                }
            }
            route.setCongestion(true);
            route.setCongestionProblem(test);
            route.incrementProbCount();
            route.incrementProblemOccurence();
            String congestionProblem1=(String)congestionProblemTable.getValueAt(selectedRow,2);
            for(CongestionProblem congestionProblem:congestionProblemDirectory.getCongestionProblemList()){
                if(congestionProblem.getProblemName().equals(congestionProblem1)){
                    this.congestionProblem=congestionProblem;
                    break;
                }
            }
            congestionProblem.incrementProblemOccurrence();
            congestionProblem.incrementProblemCongestionCount();
            int decidingFactor=decideProblemType(test);

            CongestionSolutionWorkRequest congestionSolutionWorkRequest=new CongestionSolutionWorkRequest();
            congestionSolutionWorkRequest.setRoute(route);
            congestionSolutionWorkRequest.setProblem(test);
            Date date= new Date();
            congestionSolutionWorkRequest.setRequestDate(date);
            congestionSolutionWorkRequest.setSender(userAccount);
            route.setRequestDate(date);
            route.setCongestion(true);
            route.setCongestionProblem(test);
            route.setSender(userAccount);
            if(decidingFactor==1){
                Organization org=null;
                for(Network network:business.getNetworkList()){
                    for(Enterprise enter:network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization organization : enter.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof TrafficCongestionManagementOrganization){
                        org=organization;
                        break;
                    }}}
                }
                if(org!=null){
                    org.getWorkQueue().getWorkRequestList().add(congestionSolutionWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(congestionSolutionWorkRequest);
                    JOptionPane.showMessageDialog(null, "Sensor Input Successfully reported", "Success", JOptionPane.INFORMATION_MESSAGE);
                    //                    populateFinalCongestionProblemTable();
                }
            }
            else{
                Organization org=null;
                for(Network network:business.getNetworkList()){
                    for(Enterprise enter:network.getEnterpriseDirectory().getEnterpriseList()){
                        for(Organization organization : enter.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof ConstructionManagerOrganization){
                        org=organization;
                        break;
                    }
                }
                    }}
                if(org!=null){
                    org.getWorkQueue().getWorkRequestList().add(congestionSolutionWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(congestionSolutionWorkRequest);
                    JOptionPane.showMessageDialog(null, "Sensor Input Successfully reported", "Success", JOptionPane.INFORMATION_MESSAGE);
                                  //   populateFinalCongestionProblemTable();
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    
    }//GEN-LAST:event_btnReportProblemActionPerformed

    private void btnReportProblem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportProblem1ActionPerformed
        // TODO add your handling code here:
     populateTable();
    }//GEN-LAST:event_btnReportProblem1ActionPerformed
    public int decideProblemType(String test)
    {
        if(test.equals("Traffic Jam")||test.equals("Bad Traffic Signal")||test.equals("Too much Freight")||test.equals("Bottleneck")||test.equals("Traffic due to Parking")||test.equals("One way Needed")){
            return 1;
        }
        else{
            return 0;
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportProblem;
    private javax.swing.JButton btnReportProblem1;
    private javax.swing.JTable congestionProblemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}