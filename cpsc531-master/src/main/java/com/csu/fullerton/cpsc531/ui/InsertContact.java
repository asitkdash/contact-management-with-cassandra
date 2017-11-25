/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csu.fullerton.cpsc531.ui;

import com.csu.fullerton.cpsc531.obj.Contact;
import com.csu.fullerton.cpsc531.database.Cassandra;

import com.csu.fullerton.cpsc531.ui.utils.ImageFilter;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
/**
 *
 * @author Peter
 */
public class InsertContact extends javax.swing.JFrame {

    /**
     * Creates new form InsertContact
     */
	Contact insContact = new Contact();
	Cassandra cassandra = new Cassandra();
	Image newimg = null;
	
    public InsertContact() {
    	
    	initComponents();
    	
    	    
//        cassandra.insertContact(insContact);
		
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JFormattedTextField();        
        jLabel9 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_company = new javax.swing.JFormattedTextField();
        txt_address1 = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_address2 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_email = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_cellphone = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_telephone = new javax.swing.JFormattedTextField();
        _btn_reset = new javax.swing.JButton();
        _btn_add = new javax.swing.JButton();
        _btn_cancel = new javax.swing.JButton();
        _btn_photo = new javax.swing.JButton();
        btn_removePhoto = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        combo_department = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        combo_report_to = new javax.swing.JComboBox<>();
        combo_role = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Contact");
        setResizable(false);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("First Name:");

        txt_firstname.setForeground(new java.awt.Color(0, 153, 51));
        txt_firstname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_firstname.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Last Name:");

        txt_lastname.setForeground(new java.awt.Color(0, 153, 51));
        txt_lastname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_lastname.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Company:");

        txt_company.setForeground(new java.awt.Color(0, 153, 51));
        txt_company.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_company.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        txt_address1.setForeground(new java.awt.Color(0, 153, 51));
        txt_address1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_address1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Address 1:");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Address 2:");

        txt_address2.setForeground(new java.awt.Color(0, 153, 51));
        txt_address2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_address2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Email:");

        txt_email.setForeground(new java.awt.Color(0, 153, 51));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_email.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Cell Phone:");

        txt_cellphone.setForeground(new java.awt.Color(0, 153, 51));
        txt_cellphone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cellphone.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Telephone:");

        txt_telephone.setForeground(new java.awt.Color(0, 153, 51));
        txt_telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_telephone.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        _btn_reset.setBackground(java.awt.SystemColor.activeCaption);
        _btn_reset.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        _btn_reset.setForeground(new java.awt.Color(0, 102, 51));
        _btn_reset.setMnemonic('r');
        _btn_reset.setText("RESET");
        _btn_reset.setMargin(new java.awt.Insets(0, 0, 0, 0));
        _btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btn_resetActionPerformed(evt);
            }
        });

        _btn_add.setBackground(java.awt.SystemColor.activeCaption);
        _btn_add.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        _btn_add.setForeground(new java.awt.Color(0, 102, 51));
        _btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        _btn_add.setMnemonic('A');
        _btn_add.setText("ADD");
        _btn_add.setMargin(new java.awt.Insets(0, 0, 0, 0));
        _btn_add.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_rollover.png"))); // NOI18N
        _btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					_btn_addActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        _btn_cancel.setBackground(java.awt.SystemColor.activeCaption);
        _btn_cancel.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        _btn_cancel.setForeground(new java.awt.Color(0, 102, 51));
        _btn_cancel.setMnemonic('C');
        _btn_cancel.setText("CANCEL");
        _btn_cancel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        _btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btn_cancelActionPerformed(evt);
            }
        });

        _btn_photo.setBackground(java.awt.SystemColor.activeCaption);
        _btn_photo.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        _btn_photo.setForeground(new java.awt.Color(0, 102, 51));
        _btn_photo.setMnemonic('r');
        _btn_photo.setText("+ Photo");
        _btn_photo.setActionCommand("");
        _btn_photo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        _btn_photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btn_photoActionPerformed(evt);
            }
        });

        btn_removePhoto.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_removePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        btn_removePhoto.setMnemonic('A');
        btn_removePhoto.setToolTipText("Remove photo");
        btn_removePhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_removePhoto.setIconTextGap(0);
        btn_removePhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_removePhotoMouseEntered(evt);
            }
        });
        btn_removePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removePhotoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Department:");

        combo_department.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        combo_department.setForeground(new java.awt.Color(0, 153, 51));
        combo_department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planning", "Development", "Testing", "Integration", "Management" }));
        
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Reports to:");

        combo_report_to.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        combo_report_to.setForeground(new java.awt.Color(0, 153, 51));
        combo_report_to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        
        combo_role.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        combo_role.setForeground(new java.awt.Color(0, 153, 51));
        combo_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Manager", "Supervisor", "CEO", "CFO", "Other" }));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Role:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_btn_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_removePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_lastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                        .addComponent(txt_company, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(_btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(_btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_telephone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_cellphone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_address2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_address1, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_role, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_report_to, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_department, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(_btn_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_removePhoto))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_company, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_address2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_department, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_report_to, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_role, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private static void setFirstname(JFormattedTextField txt_firstname2) {
		// TODO Auto-generated method stub
		
//	}

	private void _btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btn_resetActionPerformed

    }//GEN-LAST:event__btn_resetActionPerformed

    private void _btn_addActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event__btn_addActionPerformed
    	
    	UUID contactId = UUID.randomUUID();
    	insContact.setContactId(contactId);
    	
    	String firstname = txt_firstname.getText();
    	insContact.setFirstname(firstname);
        
        String lastname = txt_lastname.getText();
        insContact.setLastname(lastname);
        
        String company = txt_company.getText();
        insContact.setCompany(company);
        
        String address1 = txt_address1.getText();
        insContact.setAddress1(address1);
        
        String address2 = txt_address2.getText();
        insContact.setAddress2(address2);
        
        String email = txt_email.getText();
        insContact.setEmail(email);
        
        String telephone = txt_telephone.getText();
        insContact.setTelephone(telephone);
        
        String cellphone = txt_cellphone.getText();
        insContact.setCellphone(cellphone);
        
        String department_code = (String)combo_department.getSelectedItem();
        insContact.setDepartment_code(department_code); 
        
        String report_to = (String)combo_report_to.getSelectedItem();
        insContact.setReport_to(report_to);
        
        String role = (String)combo_role.getSelectedItem();
        insContact.setRole(role);
    
        BufferedImage originalImage = convertToBufferedImage(newimg);
        ByteArrayOutputStream imageStream = new ByteArrayOutputStream();
    	ImageIO.write(originalImage, "JPG", imageStream );
    	imageStream.flush();
    	byte[] imageInByte = imageStream.toByteArray();
//    	ByteBuffer buffer = ByteBuffer.wrap(imageInByte);
    	
    	Blob photo = null;
    	
    	try {
			photo = new javax.sql.rowset.serial.SerialBlob(imageInByte);
		} catch (SerialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		
		insContact.setPhoto(photo);
    	
    	cassandra.insertContact(insContact);
  
    }//GEN-LAST:event__btn_addActionPerformed
    
    public static BufferedImage convertToBufferedImage(Image image)
    {
        BufferedImage newImage = new BufferedImage(
            image.getWidth(null), image.getHeight(null),
            BufferedImage.TYPE_INT_ARGB);
        
        return newImage;
    }
    
    
    private void _btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btn_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__btn_cancelActionPerformed

    private void _btn_photoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btn_photoActionPerformed
        JFileChooser fc = new JFileChooser();
        File workingDirectory = new File(System.getProperty("user.dir"));
        fc.setCurrentDirectory(workingDirectory);
        fc.setFileFilter(new ImageFilter());
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(ImageIO.read(file));
                Image img = icon.getImage();
                newimg = img.getScaledInstance(165, 165, java.awt.Image.SCALE_SMOOTH);
                
                _btn_photo.setText("");
                _btn_photo.setIcon(new ImageIcon(newimg));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event__btn_photoActionPerformed

    private void btn_removePhotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removePhotoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removePhotoMouseEntered

    private void btn_removePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removePhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removePhotoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InsertContact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btn_add;
    private javax.swing.JButton _btn_cancel;
    private javax.swing.JButton _btn_photo;
    private javax.swing.JButton _btn_reset;
    private javax.swing.JButton btn_removePhoto;
    private javax.swing.JComboBox<String> combo_department;
    private javax.swing.JComboBox<String> combo_report_to;
    private javax.swing.JComboBox<String> combo_role;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txt_address1;
    private javax.swing.JFormattedTextField txt_address2;
    private javax.swing.JFormattedTextField txt_cellphone;
    private javax.swing.JFormattedTextField txt_company;
    private javax.swing.JFormattedTextField txt_email;
    private javax.swing.JFormattedTextField txt_firstname;
    private javax.swing.JFormattedTextField txt_lastname;
    private javax.swing.JFormattedTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
}
