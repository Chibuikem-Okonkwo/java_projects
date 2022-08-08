package com.melodia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class BankManager implements ActionListener {

    private JFrame frame;
    private JPanel mainPanel, northPanel, centerPanel, southPanel;
    private JMenuBar menuBar;
    private JMenu menuFile, menuUpdate, menuTools, menuReport, menuHelp;
    private JMenuItem miNew, miQuit;
    private JMenuItem miBank, miBranch;
    private JToolBar toolBar;
    private JButton btnNew, btnQuit, btnBank, btnBranch;

    public BankManager() {

        frame = new JFrame("Notepad 1.0");

        menuBar = new JMenuBar();
        
        menuFile = new JMenu("File");
        menuUpdate = new JMenu("Update");
        menuTools = new JMenu("Tools");
        menuReport = new JMenu("Report");
        menuHelp = new JMenu("Help");
        
        miNew = new JMenuItem("New");
        miQuit = new JMenuItem("Quit");
        
        //miNew.addActionListener(this);  //Action Listener
        miQuit.addActionListener(this);
        
        miBank = new JMenuItem("Manage bank");
        miBank.addActionListener(this);
        
        miBranch = new JMenuItem("Manage branch");
        miBranch.addActionListener(this);
        
        menuBar.add(menuFile);
        menuBar.add(menuUpdate);
        menuBar.add(menuTools);
        menuBar.add(menuReport);
        menuBar.add(menuHelp);
        
        menuFile.add(miNew);
        menuFile.add(miQuit);
        
        menuUpdate.add(miBank);
        menuUpdate.add(miBranch);
        
        frame.setJMenuBar(menuBar);
        
        toolBar = new JToolBar();
        
        btnNew = new JButton("New");
        btnQuit = new JButton("Quit");
        btnQuit.addActionListener(this);
        btnBank = new JButton("Bank");
        btnBank.addActionListener(this);
        btnBranch = new JButton("Branch");
        btnBranch.addActionListener(this);
        
        toolBar.add(btnNew);
        toolBar.add(btnQuit);
        toolBar.add(btnBank);
        toolBar.add(btnBranch);

        mainPanel = new JPanel();
        northPanel = new JPanel();
        centerPanel = new JPanel();
        southPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());    //setting border layout on mainPanel
        //mainPanel.setLayout(new GridLayout(1,3)); //grid layout rows, columns.

        northPanel.setBackground(Color.red);
        mainPanel.add(toolBar, BorderLayout.NORTH);

        centerPanel.setBackground(Color.gray);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        southPanel.setBackground(Color.GREEN);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        mainPanel.setBackground(Color.cyan);
        frame.getContentPane().add(mainPanel);

        frame.setSize(frame.getToolkit().getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.getContentPane();
    }

    public static void main(String[] args) {

        new BankManager();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object clicked = ae.getSource();
        
        if (clicked == miBank || clicked == btnBank) {
//            JOptionPane.showMessageDialog(null, "Menu New Clicked");
            new BankDialog(frame, "Bank Dialog", true);
        }
        if (clicked == miBranch || clicked == btnBranch) {
            new BranchDialog(frame, "Branch Dialog", true);
        }
        if (clicked == miQuit || clicked == btnQuit) {
            //JOptionPane.showMessageDialog(null, "Menu Quit Clicked");
            System.exit(0);
        }
    }

}