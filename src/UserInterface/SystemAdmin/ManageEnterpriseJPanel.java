/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Government;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Government system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, Government system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateEnterprise();
        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getCity();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        //enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

//        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
//            enterpriseTypeJComboBox.addItem(type);
//        }

    }
    
    private void populateEnterprise(){
        EnterpriseType[] values = EnterpriseType.values();
        enterpriseTypeJComboBox.removeAllItems();
        for (EnterpriseType enterprisType : values) {
            enterpriseTypeJComboBox.addItem(enterprisType);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        networkJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(920, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBackground(new java.awt.Color(153, 204, 255));
        enterpriseJTable.setFont(new java.awt.Font("Al Tarikh", 1, 12)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Type", "Enterprise Name ", "Network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 570, 95));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 133, 136, -1));

        nameJTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(153, 204, 255)));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 223, 200, -1));

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 178, 136, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        jPanel19.setBackground(new java.awt.Color(0, 4, 68));

        jLabel18.setFont(new java.awt.Font("Al Tarikh", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("CREATE ENTERPRISE ");

        jPanel20.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(1073, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        jLabel13.setFont(new java.awt.Font("Al Tarikh", 1, 14)); // NOI18N
        jLabel13.setText("Enterprise Name");
        jLabel13.setPreferredSize(new java.awt.Dimension(70, 20));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, 20));

        jLabel14.setFont(new java.awt.Font("Al Tarikh", 1, 14)); // NOI18N
        jLabel14.setText("Enterprise Type");
        jLabel14.setPreferredSize(new java.awt.Dimension(70, 20));
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, 20));

        jLabel15.setFont(new java.awt.Font("Al Tarikh", 1, 14)); // NOI18N
        jLabel15.setText("Network");
        jLabel15.setPreferredSize(new java.awt.Dimension(70, 20));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 20));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 30, 30));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        try{
            String name = nameJTextField.getText();
            if(!name.isEmpty()){
                
                Network network = (Network) networkJComboBox.getSelectedItem();
                
                Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
                Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
                
                if (network == null || type == null) {
                    JOptionPane.showMessageDialog(null, "Invalid Input!");
                    return;
               }
                 populateTable();
            }
            
        else {
                throw new Exception();
             }
        
    } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fields can not be left blank.", "Warning", JOptionPane.WARNING_MESSAGE);
         
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
