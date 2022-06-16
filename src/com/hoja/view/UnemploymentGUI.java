package com.hoja.view;

import com.hoja.ents.UnemploymentEnt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UnemploymentGUI extends JFrame implements ActionListener{
    private String user;
    public String getUser() {
        return user;
    }
    public UnemploymentGUI setUser(String user) {
        this.user = user;
        return this;
    }


    private JPanel panel;
    private JLabel Alert;
    private JButton submit;
    private JButton reset;
    private JButton edit;
    private JButton search;
    private JButton mainMenu;
    private JTextField Amount_Employed1397;
    private JTextField Amount_Employed1398;
    private JTextField Amount_Employed1399;
    private JTextField Amount_Employed1400;
    private JTextField Amount_Employed1401;
    private JTextField Amount_Unemployed1397;
    private JTextField Amount_Unemployed1398;
    private JTextField Amount_Unemployed1399;
    private JTextField Amount_Unemployed1400;
    private JTextField Amount_Unemployed1401;
    private JLabel rowss;
    private JLabel C1397;
    private JLabel C1398;
    private JLabel C1399;
    private JLabel C1400;
    private JLabel C1401;
    private JTextArea Unemployment_Percentage1397;
    private JTextArea Unemployment_Percentage1398;
    private JTextArea Unemployment_Percentage1399;
    private JTextArea Unemployment_Percentage1400;
    private JTextArea Unemployment_Percentage1401;
    private String data[][]={{"سال","تعداد افراد شاغل","تعداد افراد بیکار"},
            {"1397","",""},
            {"1398","",""},
            {"1399","",""},
            {"1400","",""},
            {"1401","",""}};
    private String column[]={"YEAR","No.Unemployed","No.Employed"};
    public UnemploymentGUI() {
        //construct components]
        panel = new JPanel();
        Alert = new JLabel ("مامور گرامی , لطفا اطلاعات زیر را طیق مستندات ارائه شده تکمیل نمایید");

        submit = new JButton ("ثبت اطلاعات");
        reset = new JButton ("پاک کردن همه");
        edit = new JButton("تغییر");
        search = new JButton("نمایش اظلاعات");
        mainMenu = new JButton("منوی اصلی");
        Amount_Employed1397 = new JTextField (1);
        Amount_Employed1398 = new JTextField (1);
        Amount_Employed1399 = new JTextField (1);
        Amount_Employed1400 = new JTextField (1);
        Amount_Employed1401 = new JTextField (1);
        Amount_Unemployed1397 = new JTextField (1);
        Amount_Unemployed1398 = new JTextField (5);
        Amount_Unemployed1399 = new JTextField (5);
        Amount_Unemployed1400 = new JTextField (5);
        Amount_Unemployed1401 = new JTextField (1);
        rowss = new JLabel ("درصد بیکاری                تعداد افراد شاغل                تعداد افراد بیکار             سال");
        C1397 = new JLabel ("1397");
        C1398 = new JLabel ("1398");
        C1399 = new JLabel ("1399");
        C1400 = new JLabel ("1400");
        C1401 = new JLabel ("1401");
        Unemployment_Percentage1397 = new JTextArea (1, 1);
        Unemployment_Percentage1398 = new JTextArea (1, 1);
        Unemployment_Percentage1399 = new JTextArea (1, 1);
        Unemployment_Percentage1400 = new JTextArea (1, 1);
        Unemployment_Percentage1401 = new JTextArea (1, 1);

        //adjust size and set layout
        panel.setPreferredSize (new Dimension (944, 733));
        panel.setLayout (null);


//add components
        panel.add (Alert);
        panel.add (submit);
        panel.add (reset);
        panel.add (search);
        panel.add (edit);
        panel.add (mainMenu);
        panel.add (Amount_Employed1397);
        panel.add (Amount_Employed1398);
        panel.add (Amount_Employed1399);
        panel.add (Amount_Employed1400);
        panel.add (Amount_Employed1401);
        panel.add (Amount_Unemployed1397);
        panel.add (Amount_Unemployed1398);
        panel.add (Amount_Unemployed1399);
        panel.add (Amount_Unemployed1400);
        panel.add (Amount_Unemployed1401);
        panel.add (rowss);
        panel.add (C1397);
        panel.add (C1398);
        panel.add (C1399);
        panel.add (C1400);
        panel.add (C1401);
        panel.add (Unemployment_Percentage1397);
        panel.add (Unemployment_Percentage1398);
        panel.add (Unemployment_Percentage1399);
        panel.add (Unemployment_Percentage1400);
        panel.add (Unemployment_Percentage1401);


        //set component bounds (only needed by Absolute Positioning)
        Alert.setBounds (260, 10, 410, 30);
        submit.setBounds (200, 300, 100, 25);
        reset.setBounds (415, 300, 100, 25);
        search.setBounds(200,330,100,25);
        edit.setBounds(415,330,100,25);
        mainMenu.setBounds(10,10,80,20);
        Amount_Employed1397.setBounds (290, 155, 110, 20);
        Amount_Employed1398.setBounds (290, 175, 110, 20);
        Amount_Employed1399.setBounds (290, 195, 110, 20);
        Amount_Employed1400.setBounds (290, 215, 110, 20);
        Amount_Employed1401.setBounds (290, 235, 110, 20);
        Amount_Unemployed1397.setBounds (400, 155, 110, 20);
        Amount_Unemployed1398.setBounds (400, 175, 110, 20);
        Amount_Unemployed1399.setBounds (400, 195, 110, 20);
        Amount_Unemployed1400.setBounds (400, 215, 110, 20);
        Amount_Unemployed1401.setBounds (400, 235, 110, 20);
        rowss.setBounds (255, 130, 355, 25);
        C1397.setBounds (255, 155, 40, 20);
        C1398.setBounds (255, 175, 35, 20);
        C1399.setBounds (255, 195, 35, 20);
        C1400.setBounds (255, 215, 40, 20);
        C1401.setBounds (255, 235, 40, 20);
        Unemployment_Percentage1397.setBounds (510, 155, 110, 20);
        Unemployment_Percentage1398.setBounds (510, 175, 110, 20);
        Unemployment_Percentage1399.setBounds (510, 195, 110, 20);
        Unemployment_Percentage1400.setBounds (510, 215, 110, 20);
        Unemployment_Percentage1401.setBounds (510, 235, 110, 20);

        reset.addActionListener(this);
        mainMenu.addActionListener(this);


        Unemployment_Percentage1397.setEditable(false);
        Unemployment_Percentage1398.setEditable(false);
        Unemployment_Percentage1399.setEditable(false);
        Unemployment_Percentage1400.setEditable(false);
        Unemployment_Percentage1401.setEditable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add (panel);
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


    public String getAmount_Employed1397(){return Amount_Unemployed1397.getText();}
    public String getAmount_Employed1398(){return Amount_Unemployed1398.getText();}
    public String getAmount_Employed1399(){return Amount_Unemployed1399.getText();}
    public String getAmount_Employed1400(){return Amount_Unemployed1400.getText();}
    public String getAmount_Employed1401(){return Amount_Unemployed1401.getText();}

    public String getAmount_Unemployed1397(){return Amount_Employed1397.getText();   }
    public String getAmount_Unemployed1398(){return Amount_Employed1398.getText();   }
    public String getAmount_Unemployed1399(){return Amount_Employed1399.getText();   }
    public String getAmount_Unemployed1400(){return Amount_Employed1400.getText();   }
    public String getAmount_Unemployed1401(){return Amount_Employed1401.getText();   }

    public void setUnemployment_Percentage1397(String rePercentage){ Unemployment_Percentage1397.setText(rePercentage);}
    public void setUnemployment_Percentage1398(String rePercentage){ Unemployment_Percentage1398.setText(rePercentage);}
    public void setUnemployment_Percentage1399(String rePercentage){ Unemployment_Percentage1399.setText(rePercentage);}
    public void setUnemployment_Percentage1400(String rePercentage){ Unemployment_Percentage1400.setText(rePercentage);}
    public void setUnemployment_Percentage1401(String rePercentage){ Unemployment_Percentage1401.setText(rePercentage);}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reset){

            Amount_Employed1397.setText("");
            Amount_Employed1398.setText("");
            Amount_Employed1399.setText("");
            Amount_Employed1400.setText("");
            Amount_Employed1401.setText("");

            Amount_Unemployed1397.setText("");
            Amount_Unemployed1398.setText("");
            Amount_Unemployed1399.setText("");
            Amount_Unemployed1400.setText("");
            Amount_Unemployed1401.setText("");

            Unemployment_Percentage1397.setText("");
            Unemployment_Percentage1398.setText("");
            Unemployment_Percentage1399.setText("");
            Unemployment_Percentage1400.setText("");
            Unemployment_Percentage1401.setText("");

        }else if (e.getSource() == mainMenu){
            dispose();
            MenuGUI gui = new MenuGUI().setLogInUser(user);
            gui.setUser();
        }

    }
    public void setter(UnemploymentEnt ent1397,
                       UnemploymentEnt ent1398,
                       UnemploymentEnt ent1399,
                       UnemploymentEnt ent1400,
                       UnemploymentEnt ent1401){

        Amount_Employed1397.setText(String.valueOf(ent1397.getAmountOfEmployment()));
        Amount_Employed1398.setText(String.valueOf(ent1398.getAmountOfEmployment()));
        Amount_Employed1399.setText(String.valueOf(ent1399.getAmountOfEmployment()));
        Amount_Employed1400.setText(String.valueOf(ent1400.getAmountOfEmployment()));
        Amount_Employed1401.setText(String.valueOf(ent1401.getAmountOfEmployment()));

        Amount_Unemployed1397.setText(String.valueOf(ent1397.getAmountOfUnemployment()));
        Amount_Unemployed1398.setText(String.valueOf(ent1398.getAmountOfUnemployment()));
        Amount_Unemployed1399.setText(String.valueOf(ent1399.getAmountOfUnemployment()));
        Amount_Unemployed1400.setText(String.valueOf(ent1400.getAmountOfUnemployment()));
        Amount_Unemployed1401.setText(String.valueOf(ent1401.getAmountOfUnemployment()));

        Unemployment_Percentage1397.setText(String.valueOf(ent1397.getUnemploymentPercentage()));
        Unemployment_Percentage1398.setText(String.valueOf(ent1398.getUnemploymentPercentage()));
        Unemployment_Percentage1399.setText(String.valueOf(ent1399.getUnemploymentPercentage()));
        Unemployment_Percentage1400.setText(String.valueOf(ent1400.getUnemploymentPercentage()));
        Unemployment_Percentage1401.setText(String.valueOf(ent1401.getUnemploymentPercentage()));
    }
}








