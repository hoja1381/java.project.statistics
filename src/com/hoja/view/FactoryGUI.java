package com.hoja.view;

import com.hoja.ents.FactoryEnt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FactoryGUI extends JFrame implements ActionListener {

    private String user;
    public String getUser() {
        return user;
    }
    public FactoryGUI setUser(String user) {
        this.user = user;
        return this;
    }

    private JPanel panel;
    private JLabel jcomp1;
    private JLabel Submission_code;
    private JTextField Submission_codeR;
    private JLabel Factory_Name;
    private JTextField Factory_NameR;
    private JTextField addressR;
    private JLabel address;
    private JTable table;
    private JButton reset;
    private JButton submit;
    private JButton edit;
    private JButton search;
    private JButton mainMenu;
    private JTextArea jcomp3;
    private JTextField jcomp2;
    private JTextField No_Employees1397;
    private JTextField No_Employees1398;
    private JTextField No_Employees1399;
    private JTextField No_Employees1400;
    private JTextField No_Employees1401;
    private JTextField Income1397;
    private JTextField Income1398;
    private JTextField Income1399;
    private JTextField Income1400;
    private JTextField Income1401;
    private JTextField Expense1397;
    private JTextField Expense1398;
    private JTextField Expense1399;
    private JTextField Expense1400;
    private JTextField Expense1401;
    private JLabel rowss;
    private JLabel C1397;
    private JLabel C1398;
    private JLabel C1399;
    private JTextArea Net1397;
    private JTextArea Net1398;
    private JTextArea Net1399;
    private JTextArea Net1400;
    private JTextArea Net1401;
    private JLabel C1400;
    private JLabel C1401;
    private JLabel must;

    public FactoryGUI() {
        //construct components
        panel = new JPanel();
        must = new JLabel("!لازم برای جستوجو ");
        jcomp1 = new JLabel ("مامور گرامی , لطفا اطلاعات زیر را طیق مستندات ارائه شده تکمیل نمایید");
        Submission_code = new JLabel ("کد ثبت :");
        Factory_Name = new JLabel ("نام کارخانه/شرکت :");
        Submission_codeR = new JTextField (1);
        Factory_NameR = new JTextField (1);
        addressR = new JTextField (1);
        address = new JLabel ("محل کارخانه/شرکت :");

        edit = new JButton("تغییر");
        search = new JButton("جستوجو");
        mainMenu = new JButton("منوی اصلی");
        reset = new JButton ("پاک کردن همه");
        submit = new JButton ("ثبت");
        jcomp3 = new JTextArea (5, 5);
        jcomp2 = new JTextField (5);
        No_Employees1397 = new JTextField (1);
        No_Employees1398 = new JTextField (1);
        No_Employees1399 = new JTextField (1);
        No_Employees1400 = new JTextField (1);
        No_Employees1401 = new JTextField (1);
        Income1397 = new JTextField (1);
        Income1398 = new JTextField (1);
        Income1399 = new JTextField (1);
        Income1400 = new JTextField (1);
        Income1401 = new JTextField (1);
        Expense1397 = new JTextField (1);
        Expense1398 = new JTextField (5);
        Expense1399 = new JTextField (5);
        Expense1400 = new JTextField (5);
        Expense1401 = new JTextField (1);
        rowss = new JLabel ("سود خالص       مخارج سال       در آمد سال      تعداد کارمندان        سال");
        C1397 = new JLabel ("1397");
        C1398 = new JLabel ("1398");
        C1399 = new JLabel ("1399");
        Net1397 = new JTextArea (1, 1);
        Net1398 = new JTextArea (1, 1);
        Net1399 = new JTextArea (1, 1);
        Net1400 = new JTextArea (1, 1);
        Net1401 = new JTextArea (1, 1);
        C1400 = new JLabel ("1400");
        C1401 = new JLabel ("1401");



        //adjust size and set layout
        panel.setPreferredSize (new Dimension (944, 557));
        panel.setLayout (null);



//add components
        panel.add (jcomp1);
        panel.add (Submission_code);
        panel.add (Submission_codeR);
        panel.add (addressR);
        panel.add (address);
        panel.add (reset);
        panel.add (submit);
        panel.add (search);
        panel.add (edit);
        panel.add (mainMenu);
        panel.add (Factory_Name);
        panel.add (Factory_NameR);
        panel.add (No_Employees1397);
        panel.add (No_Employees1398);
        panel.add (No_Employees1399);
        panel.add (No_Employees1400);
        panel.add (No_Employees1401);
        panel.add (Income1397);
        panel.add (Income1398);
        panel.add (Income1399);
        panel.add (Income1400);
        panel.add (Income1401);
        panel.add (Expense1397);
        panel.add (Expense1398);
        panel.add (Expense1399);
        panel.add (Expense1400);
        panel.add (Expense1401);
        panel.add (rowss);
        panel.add (C1397);
        panel.add (C1398);
        panel.add (C1399);
        panel.add (Net1397);
        panel.add (Net1398);
        panel.add (Net1399);
        panel.add (Net1400);
        panel.add (Net1401);
        panel.add (C1400);
        panel.add (C1401);
        panel.add(must);




        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (285, 20, 290, 25);
        Submission_code.setBounds (525, 70, 100, 25);
        Submission_codeR.setBounds (400, 70, 100, 25);
        must.setBounds(300,70,100,25);
        Factory_Name.setBounds (525, 100, 100, 25);
        Factory_NameR.setBounds (400, 100, 100, 25);
        addressR.setBounds (205, 290, 410, 110);
        address.setBounds (670, 290, 100, 25);
        reset.setBounds (510, 480, 100, 25);
        submit.setBounds (305, 480, 100, 25);
        search.setBounds(305,510,100,25);
        edit.setBounds(510,510,100,25);
        mainMenu.setBounds(10,10,80,20);
        No_Employees1397.setBounds (290, 155, 65, 20);
        No_Employees1398.setBounds (290, 175, 65, 20);
        No_Employees1399.setBounds (290, 195, 65, 20);
        No_Employees1400.setBounds (290, 215, 65, 20);
        No_Employees1401.setBounds (290, 235, 65, 20);
        Income1397.setBounds (355, 155, 65, 20);
        Income1398.setBounds (355, 175, 65, 20);
        Income1399.setBounds (355, 195, 65, 20);
        Income1400.setBounds (355, 215, 65, 20);
        Income1401.setBounds (355, 235, 65, 20);
        Expense1397.setBounds (420, 155, 65, 20);
        Expense1398.setBounds (420, 175, 65, 20);
        Expense1399.setBounds (420, 195, 65, 20);
        Expense1400.setBounds (420, 215, 65, 20);
        Expense1401.setBounds (420, 235, 65, 20);
        rowss.setBounds (255, 130, 355, 25);
        C1397.setBounds (255, 155, 40, 20);
        C1398.setBounds (255, 175, 35, 20);
        C1399.setBounds (255, 195, 35, 20);
        Net1397.setBounds (485, 155, 65, 20);
        Net1398.setBounds (485, 175, 65, 20);
        Net1399.setBounds (485, 195, 65, 20);
        Net1400.setBounds (485, 215, 65, 20);
        Net1401.setBounds (485, 235, 65, 20);
        C1400.setBounds (255, 215, 40, 20);
        C1401.setBounds (255, 235, 40, 20);


        reset.addActionListener(this);
        mainMenu.addActionListener(this);


        Net1397.setEditable(false);
        Net1398.setEditable(false);
        Net1399.setEditable(false);
        Net1400.setEditable(false);
        Net1401.setEditable(false);

        setTitle("ورود اطلاعات شرکت ها و کارخانه ها");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        getContentPane().add (this.panel);
        pack();
        setVisible (true);
    }
    public void submitlistener(ActionListener submitlistener) {
        submit.addActionListener( submitlistener);
    }
    public void searchListener(ActionListener searchlistener ){search.addActionListener(searchlistener);}
    public void editListener(ActionListener editlistener ){edit.addActionListener(editlistener);}
    public void errorMassage (String errorMassage ){
        JOptionPane.showMessageDialog(this,errorMassage);
    }

    public String getSubmission_code (){
        return Submission_codeR.getText();
    }
    public String getFactory_Name(){return Factory_NameR.getText();}
    public String getAddress(){
        return addressR.getText();
    }

    public String getNo_Employees1397(){return No_Employees1397.getText();}
    public String getNo_Employees1398(){return No_Employees1398.getText();}
    public String getNo_Employees1399(){return No_Employees1399.getText();}
    public String getNo_Employees1400(){return No_Employees1400.getText();}
    public String getNo_Employees1401(){return No_Employees1401.getText();}

    public String getIncome1397(){return Income1397.getText();}
    public String getIncome1398(){return Income1398.getText();}
    public String getIncome1399(){return Income1399.getText();}
    public String getIncome1400(){return Income1400.getText();}
    public String getIncome1401(){return Income1401.getText();}

    public String getExpense1397(){return Expense1397.getText();}
    public String getExpense1398(){return Expense1398.getText();}
    public String getExpense1399(){return Expense1399.getText();}
    public String getExpense1400(){return Expense1400.getText();}
    public String getExpense1401(){return Expense1401.getText();}

    public void setNET1397(String ReNet){Net1397.setText(ReNet);}
    public void setNET1398(String ReNet){Net1398.setText(ReNet);}
    public void setNET1399(String ReNet){Net1399.setText(ReNet);}
    public void setNET1400(String ReNet){Net1400.setText(ReNet);}
    public void setNET1401(String ReNet){Net1401.setText(ReNet);}

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()==reset) {
         Submission_codeR.setText("");
         Factory_NameR.setText("");
         addressR.setText("");

         No_Employees1397.setText("");
         No_Employees1398.setText("");
         No_Employees1399.setText("");
         No_Employees1400.setText("");
         No_Employees1401.setText("");

         Income1397.setText("");
         Income1398.setText("");
         Income1399.setText("");
         Income1400.setText("");
         Income1401.setText("");

         Expense1397.setText("");
         Expense1398.setText("");
         Expense1399.setText("");
         Expense1400.setText("");
         Expense1401.setText("");

         Net1397.setText("");
         Net1398.setText("");
         Net1399.setText("");
         Net1400.setText("");
         Net1401.setText("");
     }else if (e.getSource()==mainMenu){
         dispose();
         MenuGUI gui = new MenuGUI().setLogInUser(user);
         gui.setUser();
     }

    }
    public void setter (FactoryEnt ent){
        Submission_codeR.setText(String.valueOf(ent.getSubmission_code()));
        Factory_NameR.setText(ent.getName());
        addressR.setText(ent.getAddress());

        No_Employees1397.setText(String.valueOf(ent.getNo_Employers_1397()));
        No_Employees1398.setText(String.valueOf(ent.getNo_Employers_1398()));
        No_Employees1399.setText(String.valueOf(ent.getNo_Employers_1399()));
        No_Employees1400.setText(String.valueOf(ent.getNo_Employers_1400()));
        No_Employees1401.setText(String.valueOf(ent.getNo_Employers_1401()));

        Income1397.setText(String.valueOf(ent.getIncome_1397()));
        Income1398.setText(String.valueOf(ent.getIncome_1398()));
        Income1399.setText(String.valueOf(ent.getIncome_1399()));
        Income1400.setText(String.valueOf(ent.getIncome_1400()));
        Income1401.setText(String.valueOf(ent.getIncome_1401()));

        Expense1397.setText(String.valueOf(ent.getExpenses_1397()));
        Expense1398.setText(String.valueOf(ent.getExpenses_1398()));
        Expense1399.setText(String.valueOf(ent.getExpenses_1399()));
        Expense1400.setText(String.valueOf(ent.getExpenses_1400()));
        Expense1401.setText(String.valueOf(ent.getExpenses_1401()));

        Net1397.setText(String.valueOf(ent.getNet_1397()));
        Net1398.setText(String.valueOf(ent.getNet_1398()));
        Net1399.setText(String.valueOf(ent.getNet_1399()));
        Net1400.setText(String.valueOf(ent.getNet_1400()));
        Net1401.setText(String.valueOf(ent.getNet_1401()));
    }                                              
                                                   
                                                   
}                                                  