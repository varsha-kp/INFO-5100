/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.TrafficCongestionManagementRole;

import business.CongestionSolutionEventHandler.CongestionSolutionEventHandler;
import business.CongestionSolutionEventHandler.CongestionSolutionEventHandlerDirectory;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.TrafficCongestionManagementOrganization;
import business.Route.Route;
import business.UserAccount.UserAccount;
import business.WorkQueue.CongestionSolutionWorkRequest;
import business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class TrafficCongestionManagementWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private TrafficCongestionManagementOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CongestionSolutionEventHandlerDirectory congestionSolutionEventHandlerDirectory;
    private EcoSystem business;
    /**
     * Creates new form EventHandlerTeamWorkAreaJPanel
     */
    public TrafficCongestionManagementWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, TrafficCongestionManagementOrganization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business=business;
        congestionSolutionEventHandlerDirectory=enterprise.getCongestionSolutionEventHandlerDirectory();
        populateEventHandlerTable();
        addCongestionSolutionsEventHandler();
        populateEventHandlerComboBox();
    }

//    public TrafficCongestionManagementWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, TrafficCongestionManagementOrganization trafficCongestionManagementOrganization, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    public void populateEventHandlerTable(){
        DefaultTableModel defaultTableModel=(DefaultTableModel)eventHandlerTable.getModel();
        
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
                defaultTableModel.addRow(row);
            
        }
    }
    
    public void addCongestionSolutionsEventHandler()
    {
        if(congestionSolutionEventHandlerDirectory.getCongestionSolutionEventHandlerList().isEmpty()){
        CongestionSolutionEventHandler cp1=congestionSolutionEventHandlerDirectory.addCongestionSolution();
        cp1.setSolutionName("Send Traffic onto Freeway");
        CongestionSolutionEventHandler cp2=congestionSolutionEventHandlerDirectory.addCongestionSolution();
        cp2.setSolutionName("Optimise Traffic Signal");
        CongestionSolutionEventHandler cp3=congestionSolutionEventHandlerDirectory.addCongestionSolution();
        cp3.setSolutionName("Send Event Handler team to handle Traffic incident");
        CongestionSolutionEventHandler cp4=congestionSolutionEventHandlerDirectory.addCongestionSolution();
        cp4.setSolutionName("Sent Traffic Police to manage Freight");
        CongestionSolutionEventHandler cp5=congestionSolutionEventHandlerDirectory.addCongestionSolution();
        cp5.setSolutionName("Move Median Barriers");
        CongestionSolutionEventHandler cp6=congestionSolutionEventHandlerDirectory.addCongestionSolution();
        cp6.setSolutionName("Reverse lane direction according to the flow of traffic");
        CongestionSolutionEventHandler cp7=congestionSolutionEventHandlerDirectory.addCongestionSolution();
        cp7.setSolutionName("Send Traffic police to handle bottleneck");
        
        }
    }
    
    public void populateEventHandlerComboBox(){
        eventHandlerComboBox.removeAllItems();
        for(CongestionSolutionEventHandler congestionSolutionEventHandler:congestionSolutionEventHandlerDirectory.getCongestionSolutionEventHandlerList()){
            eventHandlerComboBox.addItem(congestionSolutionEventHandler);
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
        btnHandleProblem = new javax.swing.JButton();
        eventHandlerComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventHandlerTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel1.setText("Event Handler Team Work Area:");

        btnHandleProblem.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnHandleProblem.setText("Handle Problem");
        btnHandleProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHandleProblemActionPerformed(evt);
            }
        });

        eventHandlerComboBox.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        eventHandlerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setText("Proposed Solution to given Problem:");

        eventHandlerTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        eventHandlerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(eventHandlerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(btnHandleProblem))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(eventHandlerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 227, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
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
                    .addComponent(eventHandlerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnHandleProblem)
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHandleProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHandleProblemActionPerformed
        // TODO add your handling code here:
        CongestionSolutionEventHandler congestionSolutionEventHandler=(CongestionSolutionEventHandler)eventHandlerComboBox.getSelectedItem();
        int selectedRow=eventHandlerTable.getSelectedRow();
        if(selectedRow>=0){
        CongestionSolutionWorkRequest workRequest=(CongestionSolutionWorkRequest)eventHandlerTable.getValueAt(selectedRow, 7);
        Route route=(Route)eventHandlerTable.getValueAt(selectedRow,0);
        if(route.isCongestion()==true){
        workRequest.setReceiver(userAccount);
        workRequest.setSolution(congestionSolutionEventHandler.getSolutionName());
        Date date= new Date();
        workRequest.setResolveDate(date);
        
        route.setCongestion(false);
        route.setCongestionProblem("");
        route.setEventHandlerSolution(congestionSolutionEventHandler.getSolutionName());
        route.setResolveDate(date);
        route.setReceiver(userAccount);
        userAccount.incrementSolved();
        populateEventHandlerTable();
        JOptionPane.showMessageDialog(null, "Congestion Problem solved Successfully!!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "No Congestion present!!", "Choose other Problem", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row first. If no row present, that means, no Congestion Problem is assigned to the workqueue as of now!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHandleProblemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHandleProblem;
    private javax.swing.JComboBox eventHandlerComboBox;
    private javax.swing.JTable eventHandlerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
