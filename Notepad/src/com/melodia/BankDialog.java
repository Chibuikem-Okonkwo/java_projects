package com.melodia;

import Beans.BankBean;
import Beans.BranchBean;
import DAO.BankDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankDialog extends JDialog implements ActionListener {

    private JPanel mainPanel, northPanel, centerPanel, southPanel, centerUpPanel, centerDownPanel;
    private JMenuBar menuBar;
    private JButton btnLoad, btnSubmit, btnUpdate, btnDelete, btnReset;
    private JLabel lblBankCode, lblBank;
    private JTextField bankCodeField, bankField;
    private JComboBox comboBankCode;

    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    BankDAO bdao = new BankDAO();

    public BankDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        mainPanel = new JPanel();
        northPanel = new JPanel();
        centerPanel = new JPanel();
        southPanel = new JPanel();
        centerUpPanel = new JPanel();
        centerDownPanel = new JPanel();
        
        centerDownPanel.setBackground(Color.CYAN);
         
        centerPanel.setLayout(new GridLayout(2,1));
        centerPanel.add(centerUpPanel);
        centerPanel.add(centerDownPanel);

        String[] codes = {"Select Bank ID", "011", "041", "35", "39", "40"};
        comboBankCode = new JComboBox(codes);
        btnLoad = new JButton("Load");

        lblBankCode = new JLabel("Bank Code: ");
        bankCodeField = new JTextField(15);

        lblBank = new JLabel("Bank: ");
        bankField = new JTextField(15);

        btnSubmit = new JButton("Submit");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnReset = new JButton("Reset");

        btnSubmit.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnReset.addActionListener(this);
        btnLoad.addActionListener(this);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.red);

        northPanel.setBackground(Color.MAGENTA);
        mainPanel.add(northPanel, BorderLayout.NORTH);

        //centerPanel.setBackground(Color.pink);
        //centerPanel.setLayout(new GridLayout(2,2,50,50));
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        southPanel.setBackground(Color.gray);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        //setJMenuBar(menuBar);
        northPanel.add(comboBankCode);
        northPanel.add(btnLoad);

        centerUpPanel.setLayout(gbl);
        //centerPanel.setLayout(new GridLayout(2, 2));
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbl.setConstraints(lblBankCode, gbc);
        centerUpPanel.add(lblBankCode);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbl.setConstraints(bankCodeField, gbc);
        centerUpPanel.add(bankCodeField);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbl.setConstraints(lblBank, gbc);
        centerUpPanel.add(lblBank);
        //centerPanel.setLayout(gbl);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbl.setConstraints(bankField, gbc);
        centerUpPanel.add(bankField);

//        //centerPanel.add(bankCodeField);
//        centerPanel.add(lblBank);
//        centerPanel.add(bankField);
        southPanel.add(btnSubmit);
        southPanel.add(btnUpdate);
        southPanel.add(btnDelete);
        southPanel.add(btnReset);

        getContentPane().add(mainPanel);

        setSize(400, 550);
        setLocationRelativeTo(null);    //Sets Location to the center of the screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object clicked = ae.getSource();
        if (clicked == btnLoad) {
            //JOptionPane.showMessageDialog(null, "Load Button Clicked");
            String bankCode = comboBankCode.getSelectedItem().toString();
            BankBean bean = bdao.getBank(bankCode);
            
            if (bean != null) {
                
                bankCodeField.setText(bean.getBankCode());
                bankField.setText(bean.getBank());
            }
        }
        if (clicked == btnSubmit) {
            //JOptionPane.showMessageDialog(null, "Submit button clicked");
            String bankCode = bankCodeField.getText();
            String bank = bankField.getText();

            BankBean bean = new BankBean(bankCode, bank);
            int status = bdao.addBank(bean);
            
            if (status == 0) {
                resetFields();
                JOptionPane.showMessageDialog(null, "Record Added");
            }
            else{
                JOptionPane.showMessageDialog(null, "Record not submitted");
            }
        }
        if (clicked == btnUpdate) {
            //JOptionPane.showMessageDialog(null, "Update button clicked");
            String bankCode = bankCodeField.getText();
            String bank = bankField.getText();

            BankBean bean = new BankBean(bankCode, bank);
            int status = bdao.updateBank(bean);
            
            if (status == 0) {
                resetFields();
                JOptionPane.showMessageDialog(null, "Record Updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "Record not updated");
            }
        }
        if (clicked == btnReset) {
            resetFields();
            //JOptionPane.showMessageDialog(null, "Reset button clicked");
        }
        if (clicked == btnDelete) {
            //JOptionPane.showMessageDialog(null, "Delete button clicked");
            String bankCode = bankCodeField.getText();

            int status = bdao.deleteBank(bankCode);
            
            if (status == 0) {
                resetFields();
                JOptionPane.showMessageDialog(null, "Record Deleted");
            }
            else{
                JOptionPane.showMessageDialog(null, "Record not deleted");
            }
        }
    }

    public void resetFields(){
        
        bankCodeField.setText("");
        bankField.setText("");
    }
}
