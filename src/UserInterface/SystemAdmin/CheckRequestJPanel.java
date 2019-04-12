/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Enterprise.Enterprise;
import Business.Enterprise.RealEstate;
import Business.Government;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhavyapathak
 */
public class CheckRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckRequestJPanel
     */
    private JPanel userProcessContainer;
    private Government system;

    public CheckRequestJPanel(JPanel userProcessContainer, Government system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        String host = "pop.gmail.com";// change accordingly
        String mailStoreType = "pop3";
        String username
                = "codeblueecocystem@gmail.com";// change accordingly
        String password = "ecosystem11";// change accordingly

        //Call method fetch
        fetch(host, mailStoreType, username, password);
    }

    public void fetch(String pop3Host, String storeType, String user, String password) {
        try {
            // create properties field
            Properties properties = new Properties();
            properties.put("mail.store.protocol", "pop3");
            properties.put("mail.pop3.host", pop3Host);
            properties.put("mail.pop3.port", "995");
            properties.put("mail.pop3.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);
         // emailSession.setDebug(true);

            // create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("pop3s");

            store.connect(pop3Host, user, password);

            // create the folder object and open it
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    System.in));

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            for (int i = 0; i < messages.length; i++) {
                Message msg = messages[i];
                Address[] fromAddress = msg.getFrom();
                String from = fromAddress[0].toString();
                String subject = msg.getSubject();
                String toList = parseAddresses(msg
                        .getRecipients(RecipientType.TO));
                String ccList = parseAddresses(msg
                        .getRecipients(RecipientType.CC));
                String sentDate = msg.getSentDate().toString();

                String contentType = msg.getContentType();
                String messageContent = "";

                if (contentType.contains("text/plain")
                        || contentType.contains("text/html")) {
                    try {
                        Object content = msg.getContent();
                        if (content != null) {
                            messageContent = content.toString();
                        }
                    } catch (Exception ex) {
                        messageContent = "[Error downloading content]";
                        ex.printStackTrace();
                    }
                }

                // print out details of each message
                System.out.println("Message #" + (i + 1) + ":");
                System.out.println("\t From: " + from);
                System.out.println("\t To: " + toList);
                System.out.println("\t CC: " + ccList);
                System.out.println("\t Subject: " + subject);
                System.out.println("\t Sent Date: " + sentDate);
                System.out.println("\t Message: " + messageContent);

                populateTable(from, toList, sentDate, subject);
            }

            // close the store and folder objects
            emailFolder.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String parseAddresses(Address[] address) {
        String listAddress = "";

        if (address != null) {
            for (int i = 0; i < address.length; i++) {
                listAddress += address[i].toString() + ", ";
            }
        }
        if (listAddress.length() > 1) {
            listAddress = listAddress.substring(0, listAddress.length() - 2);
        }

        return listAddress;
    }

    public void populateTable(String from, String toList, String sentDate, String subject) {
        DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();

        model.setRowCount(0);

        Object[] row = new Object[3];
        row[0] = from;
        row[1] = subject;
        row[2] = sentDate;
//        row[3] = subject;

        model.addRow(row);

//        for (Network network : system.getNetworkList()) {
//            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                Object[] row = new Object[3];
//                row[0] = enterprise.getName();
//                row[1] = network.getCity();
//                row[2] = enterprise.getEnterpriseType().getValue();
//
//                model.addRow(row);
//            }
//        }
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
        requestJTable = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(920, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestJTable.setBackground(new java.awt.Color(153, 204, 255));
        requestJTable.setFont(new java.awt.Font("Al Tarikh", 1, 12)); // NOI18N
        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "Subject", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 133, 493, 99));

        btnAccept.setBackground(new java.awt.Color(204, 204, 204));
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jPanel19.setBackground(new java.awt.Color(0, 4, 68));

        jLabel18.setFont(new java.awt.Font("Al Tarikh", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("CHECK REQUEST");

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
                .addContainerGap(1206, Short.MAX_VALUE))
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
                .addContainerGap(10, Short.MAX_VALUE))
        );

        add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 70));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 30, 30));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        btnReject.setBackground(new java.awt.Color(204, 204, 204));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

//        int selectedRow = requestJTable.getSelectedRow();
//        if (selectedRow >= 0) {
//
//            UserAccount userAccount = (UserAccount) requestJTable.getValueAt(selectedRow, 0);
//            RealEstate area = (RealEstate) requestJTable.getValueAt(selectedRow, 3);
//            Enterprise.EnterpriseType[] values = Enterprise.EnterpriseType.values();
//            RequestDetailsJPanel viewPanel = new RequestDetailsJPanel(this.userProcessContainer, userAccount, area, values);
//            this.userProcessContainer.add("View Request Panel", viewPanel);
//            CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
//            layout.next(userProcessContainer);
//        } else {
//            JOptionPane.showMessageDialog(null, "Please select a Row!!");
//        }
        if(requestJTable.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();
        String username = (String)model.getValueAt(requestJTable.getSelectedRow(), 0);
//        String username = emailJTextField.getText();
        sendEmailConfirmation(username);
    }//GEN-LAST:event_btnAcceptActionPerformed
    public static void sendEmailConfirmation(String email) {
        String to = email;//change accordingly  
        String from = "bhavya.pathak29@gmail.com";//change accordingly  

        final String username = "bhavya.pathak29@gmail.com";
        final String password = "bppp0605";
        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(username, password);
                    }
                });

        //compose the message  
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Request Approved");
            message.setText("Hello, Your Request is approved. You will recieve another email reagrding your login credentials.");

            // Send message  
            Transport.send(message);
            System.out.println("message sent successfully....");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
    
    public static void sendEmailConfirmation2(String email) {
        String to = email;//change accordingly  
        String from = "bhavya.pathak29@gmail.com";//change accordingly  

        final String username = "bhavya.pathak29@gmail.com";
        final String password = "bppp0605";
        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(username, password);
                    }
                });

        //compose the message  
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Request Rejected");
            message.setText("Sorry your request has been denied.");

            // Send message  
            Transport.send(message);
            System.out.println("message sent successfully....");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        if(requestJTable.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();
        String username = (String)model.getValueAt(requestJTable.getSelectedRow(), 0);
//        String username = emailJTextField.getText();
        sendEmailConfirmation2(username);
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestJTable;
    // End of variables declaration//GEN-END:variables
}
