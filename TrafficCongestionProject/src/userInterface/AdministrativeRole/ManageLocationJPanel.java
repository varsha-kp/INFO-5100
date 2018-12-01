/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeRole;

import business.Location.Location;
import business.Location.LocationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageLocationJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private LocationDirectory locationDirectory;
   
    private String dest;
    String value;
   /**
     * Creates new form ManageLocationJPanel
     */
    
    public ManageLocationJPanel(JPanel userProcessContainer, LocationDirectory locationDirectory ) {
       
        initComponents();
       
        this.userProcessContainer=userProcessContainer;
        this.locationDirectory=locationDirectory;
        
        populateLocationTable();
       
    }
    
    public void populateLocationTable()
    {
        String Location_type = Location_type_jCombobox.getSelectedItem().toString();
      
            
        DefaultTableModel model = (DefaultTableModel) locationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Location location : locationDirectory.getLocationList()){
           if(Location_type.equalsIgnoreCase(location.getLocationType())){
            Object[] row = new Object[2];
            row[0] = location;  
            row[1]=location.getLocationType();
            model.addRow(row);
        }}
        
    
       
    
        
    }
//       public void interpopulateLocationTable()
//    {
//        try{
//        DefaultTableModel model = (DefaultTableModel) locationJTable.getModel();
//        
//        model.setRowCount(0);
//        
//        for (InterLocation interlocation : interLocationDirectory.getLocationList()){
//            Object[] row = new Object[1];
//            row[0] = interlocation;            
//            model.addRow(row);
//        }}
//        catch(Exception e)
//                {
//                    JOptionPane.showMessageDialog(null, "No data as of now");
//                }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        locationJTable = new javax.swing.JTable();
        btnAddLocation = new javax.swing.JButton();
        txtLocationName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnManageRoute = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        Location_type_jCombobox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(252, 244, 217));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel1.setText("Manage Locations:");

        locationJTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        locationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location Name", "Location_type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(locationJTable);

        btnAddLocation.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnAddLocation.setText("Add Location");
        btnAddLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLocationActionPerformed(evt);
            }
        });

        txtLocationName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setText("Location name:");

        btnManageRoute.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnManageRoute.setText("Manage Routes for Selected Location");
        btnManageRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRouteActionPerformed(evt);
            }
        });

        backJButton1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        backJButton1.setText("Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        Location_type_jCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Intercity", "Withen" }));
        Location_type_jCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Location_type_jComboboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Location TYpe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnAddLocation)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Location_type_jCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(backJButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnManageRoute)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Location_type_jCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addComponent(btnAddLocation))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageRoute)
                    .addComponent(backJButton1))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRouteActionPerformed
        int selectedRow=locationJTable.getSelectedRow();
        if(selectedRow>=0)
        {
            
            Location location=(Location)locationJTable.getValueAt(selectedRow,0);
            ManageLocationRoutesJPanel manageLocationRoutesJPanel = new ManageLocationRoutesJPanel(userProcessContainer, location);
            userProcessContainer.add("manageLocationRoutesJPanel", manageLocationRoutesJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_btnManageRouteActionPerformed

    private void btnAddLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLocationActionPerformed

           String Location_type = Location_type_jCombobox.getSelectedItem().toString();
            String name=txtLocationName.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Can't be added. Input again!", "Blank input", JOptionPane.ERROR_MESSAGE);
        }
        else{
        Location location =locationDirectory.addLocation();
        location.setLocationName(name);
        location.setLocationType(Location_type);
        txtLocationName.setText("");
        populateLocationTable();}

        
    }//GEN-LAST:event_btnAddLocationActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void Location_type_jComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Location_type_jComboboxActionPerformed
        // TODO add your handling code here:
         populateLocationTable();
    }//GEN-LAST:event_Location_type_jComboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Location_type_jCombobox;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnAddLocation;
    private javax.swing.JButton btnManageRoute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable locationJTable;
    private javax.swing.JTextField txtLocationName;
    // End of variables declaration//GEN-END:variables
}
