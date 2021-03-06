/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Resident;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.ResidentOrganization;
import Business.Resident.Resident;
import Business.Resident.ResidentDirectory;
import Business.Role.Role;
import Business.Street.Street;
import Business.Street.StreetDirectory;
import Business.UserAccount.UserAccount;
import Business.Validation.Validation;
import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Priyank
 */
public class ResidentSignUpJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ResidentOrganization residentOrganization;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;
    private Organization organization;
    private OrganizationDirectory organizationDirectory;
    private StreetDirectory streetDirectory;
    private Validation validation;

    /**
     * Creates new form ResidentWorkAreaJPanel
     */
    public ResidentSignUpJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization,
            Enterprise enterprise, EcoSystem ecoSystem, StreetDirectory streetDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.streetDirectory = streetDirectory;

        populateCombo();
        organizationJCombo.setVisible(false);
        for (Street street : enterprise.getStreetDirectory().getStreetList()) {
            streetNameJComboBox.addItem(street);
        }

        countryJTextField.setText("United States");
        stateJTextField.setText("Massachusetts");
        cityJTextField.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        signUpJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        passwordJPasswordField = new javax.swing.JPasswordField();
        rePasswordJPasswordField = new javax.swing.JPasswordField();
        organizationJCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        streetNameJComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stateJTextField = new javax.swing.JTextField();
        cityJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        countryJTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setText("Sign Up");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("First Name");

        firstNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstNameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameJTextFieldFocusLost(evt);
            }
        });
        firstNameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameJTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameJTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Last Name");

        lastNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastNameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameJTextFieldFocusLost(evt);
            }
        });
        lastNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameJTextFieldActionPerformed(evt);
            }
        });
        lastNameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameJTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Street");

        usernameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameJTextFieldFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Re-Password");

        signUpJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signUpJButton.setText("Sign Up");
        signUpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        passwordJPasswordField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordJPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordJPasswordFieldFocusLost(evt);
            }
        });

        rePasswordJPasswordField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rePasswordJPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rePasswordJPasswordFieldFocusLost(evt);
            }
        });

        organizationJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        streetNameJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("City");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("State");

        stateJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        stateJTextField.setEnabled(false);

        cityJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cityJTextField.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel12.setText("Login Details");

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel13.setText("Personal Details");

        countryJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        countryJTextField.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Country");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(backJButton)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rePasswordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel8)))
                                        .addGap(23, 23, 23)
                                        .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(streetNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(signUpJButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(organizationJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel3)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(organizationJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(streetNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(countryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(rePasswordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backJButton)
                            .addComponent(signUpJButton))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameJTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    public void populateCombo() {
        organizationJCombo.removeAllItems();
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof ResidentOrganization) {
                organizationJCombo.addItem(o);
            }
        }
    }

    private void signUpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpJButtonActionPerformed
        if (!Validation.isEmpty(firstNameJTextField) || !Validation.isEmpty(lastNameJTextField)
                || !Validation.isEmpty(usernameJTextField) || !Validation.isEmpty(passwordJPasswordField)
                || !Validation.isEmpty(passwordJPasswordField)) {
            JOptionPane.showMessageDialog(null, "Highlighted fields are mandatory. Please fill them.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (passwordJPasswordField.getText().equals(rePasswordJPasswordField.getText())) {
                residentOrganization = (ResidentOrganization) organizationJCombo.getSelectedItem();
                Resident resident = residentOrganization.getResidentDirectory().createResident();
                resident.setFirstName(firstNameJTextField.getText());
                resident.setLastName(lastNameJTextField.getText());
                resident.setStreetAddress(streetNameJComboBox.getSelectedItem().toString());
                resident.setUsername(usernameJTextField.getText());
                resident.setPassword(passwordJPasswordField.getText());
                resident.setRePassword(rePasswordJPasswordField.getText());

                residentOrganization.getUserAccountDirectory().createUserAccount(usernameJTextField.getText(), passwordJPasswordField.getText(), (Street) streetNameJComboBox.getSelectedItem(), resident, residentOrganization.getSupportedRole().get(0));

                JOptionPane.showMessageDialog(null, "Profile created.", "Congratulations", JOptionPane.INFORMATION_MESSAGE);

                firstNameJTextField.setText("");
                lastNameJTextField.setText("");
                streetNameJComboBox.removeAllItems();
                usernameJTextField.setText("");
                passwordJPasswordField.setText("");
                rePasswordJPasswordField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Password do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_signUpJButtonActionPerformed

    private void firstNameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameJTextFieldKeyPressed
    }//GEN-LAST:event_firstNameJTextFieldKeyPressed

    private void firstNameJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameJTextFieldKeyTyped
        Validation.restrictAlphabetinTxtFields(evt);
    }//GEN-LAST:event_firstNameJTextFieldKeyTyped

    private void lastNameJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameJTextFieldKeyTyped
        Validation.restrictAlphabetinTxtFields(evt);
    }//GEN-LAST:event_lastNameJTextFieldKeyTyped

    private void firstNameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameJTextFieldFocusLost
        Validation.isEmptyFieldOnFocusLost(evt);
    }//GEN-LAST:event_firstNameJTextFieldFocusLost

    private void lastNameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameJTextFieldFocusLost
        Validation.isEmptyFieldOnFocusLost(evt);
    }//GEN-LAST:event_lastNameJTextFieldFocusLost

    private void usernameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameJTextFieldFocusLost
        Validation.isEmptyFieldOnFocusLost(evt);
        boolean name = false;
        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (usernameJTextField.getText().equals(userAccount.getUsername())) {
                            name = true;
                            break;
                        }
                    }
                }
            }
        }

        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (usernameJTextField.getText().equals(userAccount.getUsername())) {
                        name = true;
                        break;
                    }
                }
            }
        }
        if (name == true) {
            JOptionPane.showMessageDialog(null, "Username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            usernameJTextField.setText("");
        }

    }//GEN-LAST:event_usernameJTextFieldFocusLost

    private void passwordJPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldFocusLost
        Validation.isEmptyFieldOnFocusLost(evt);
    }//GEN-LAST:event_passwordJPasswordFieldFocusLost

    private void rePasswordJPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rePasswordJPasswordFieldFocusLost
        Validation.isEmptyFieldOnFocusLost(evt);
    }//GEN-LAST:event_rePasswordJPasswordFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JTextField countryJTextField;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JComboBox organizationJCombo;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JPasswordField rePasswordJPasswordField;
    private javax.swing.JButton signUpJButton;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JComboBox streetNameJComboBox;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
