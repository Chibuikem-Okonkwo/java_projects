package com.melodia;

import Beans.BankBean;
import Beans.BranchBean;
import DAO.BranchDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BranchDialog extends JDialog implements ActionListener {

    private JPanel mainPanel, northPanel, centerPanel, southPanel;
    private JButton btnLoad, btnSubmit, btnUpdate, btnDelete, btnReset;
    private JLabel lblBankCode, lblBranchCode, lblBranch, lblLocation;
    private JTextField txtBankCode, txtBranchCode, txtBranch, txtLocation;
    private JComboBox comboBankCode;

    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    BranchDAO bdao = new BranchDAO();

    public BranchDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        mainPanel = new JPanel();
        northPanel = new JPanel();
        centerPanel = new JPanel();
        southPanel = new JPanel();

        String[] codes = {"Select Bank ID", "10002", "10009", "057", "056"};
        comboBankCode = new JComboBox(codes);
        btnLoad = new JButton("Load");

        btnSubmit = new JButton("Submit");
        btnUpdate = new JButton("Update");
        btnReset = new JButton("Reset");
        btnDelete = new JButton("Delete");

        lblBankCode = new JLabel("Bank Code: ");
        lblBranchCode = new JLabel("Branch Code: ");
        lblBranch = new JLabel("Branch: ");
        lblLocation = new JLabel("Location: ");

        txtBankCode = new JTextField(15);
        txtBranchCode = new JTextField(15);
        txtBranch = new JTextField(15);
        txtLocation = new JTextField(15);

        btnLoad.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnReset.addActionListener(this);
        btnSubmit.addActionListener(this);

        mainPanel.setLayout(new BorderLayout());

        northPanel.setBackground(Color.MAGENTA);
        mainPanel.add(northPanel, BorderLayout.NORTH);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        southPanel.setBackground(Color.gray);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        northPanel.add(btnLoad);
        northPanel.add(comboBankCode);

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbl.setConstraints(lblBankCode, gbc);
        centerPanel.add(lblBankCode);
        centerPanel.setLayout(gbl);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbl.setConstraints(txtBankCode, gbc);
        centerPanel.add(txtBankCode);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbl.setConstraints(lblBranchCode, gbc);
        centerPanel.add(lblBranchCode);
        centerPanel.setLayout(gbl);        gbc.gridx = 2;
        gbc.gridy = 2;
        gbl.setConstraints(txtBranchCode, gbc);
        centerPanel.add(txtBranchCode);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbl.setConstraints(lblBranch, gbc);
        centerPanel.add(lblBranch);
        centerPanel.setLayout(gbl);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbl.setConstraints(txtBranch, gbc);
        centerPanel.add(txtBranch);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbl.setConstraints(lblLocation, gbc);
        centerPanel.add(lblLocation);
        centerPanel.setLayout(gbl);
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbl.setConstraints(txtLocation, gbc);
        centerPanel.add(txtLocation);

        southPanel.add(btnSubmit);
        southPanel.add(btnUpdate);
        southPanel.add(btnDelete);
        southPanel.add(btnReset);
        getContentPane().add(mainPanel);

        setSize(400, 300);
        setLocationRelativeTo(null);    //Sets Location to the center of the screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object clicked = ae.getSource();

        if (clicked == btnLoad) {
            //JOptionPane.showMessageDialog(null, "HJ");
            String bc = comboBankCode.getSelectedItem().toString();
            int bankCode = Integer.parseInt(bc);
            
            BranchBean bean = bdao.getBranch(bankCode);
            
            if (bean != null) {
                
                txtBankCode.setText(String.valueOf(bean.getBankCode()));
                txtBranchCode.setText(String.valueOf(bean.getBranchCode()));
                txtBranch.setText(bean.getBranch());
                txtLocation.setText(bean.getLocation());
            }
        }
        if (clicked == btnDelete) {
            //JOptionPane.showMessageDialog(null, "HJ");
            String id = txtBranchCode.getText();
            int branchCode = Integer.parseInt(id);
            
            int status = bdao.deleteBranch(branchCode);
            
            if(status == 0){
                resetFields();
                JOptionPane.showMessageDialog(null, "Record deleted");
            }else{
                JOptionPane.showMessageDialog(null, "Record not Deleted");
            }
        }
        if (clicked == btnUpdate) {
            //JOptionPane.showMessageDialog(null, "HJ");
            String str1 = txtBankCode.getText();
            int bankCode = Integer.parseInt(str1);
            
            String str2 = txtBranchCode.getText();
            int branchCode = Integer.parseInt(str2);
            
            String branch = txtBranch.getText();
            String location = txtLocation.getText();

            BranchBean bean = new BranchBean(branchCode, bankCode, branch, location);
            
            int status = bdao.updateBranch(bean);

            if (status == 0) {
                resetFields();
                JOptionPane.showMessageDialog(null, "Record Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Record not updated");
            }
        }
        if (clicked == btnReset) {
            //JOptionPane.showMessageDialog(null, "HJ");
        }
        if (clicked == btnSubmit) {
            //JOptionPane.showMessageDialog(null, "HJ");
            int bankCode = Integer.parseInt(txtBankCode.getText());
            int branchCode = Integer.parseInt(txtBranchCode.getText());
            
            String branch = txtBranch.getText();
            String location = txtLocation.getText();

            BranchBean bean = new BranchBean(branchCode, bankCode, branch, location);
            int status = bdao.addBranch(bean);

            if (status == 0) {
                resetFields();
                JOptionPane.showMessageDialog(null, "Record Added");
            } 
            else {
                JOptionPane.showMessageDialog(null, "Record not Added");
            }
        }
    }

    public void resetFields() {

        txtBankCode.setText("");
        txtBranchCode.setText("");
        txtBranch.setText("");
        txtLocation.setText("");
    }
}
