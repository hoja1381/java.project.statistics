package com.hoja.view;



import com.hoja.ents.InflationEnt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InflationGUI extends JFrame implements ActionListener {
    private String user;
    public String getUser() {
        return user;
    }
    public InflationGUI setUser(String user) {
        this.user = user;
        return this;
    }


    private JPanel panel ;
    private JLabel Alert;
    private JLabel factory_Name;
    private JLabel product_name;
    private JTextField product_nameR;
    private JTextField factory_nameR;
    private JButton submit;
    private JButton reset;
    private JButton edit;
    private JButton search;
    private JButton mainMenu;
    private JTextField Price_1397;
    private JTextField Price_1398;
    private JTextField Price_1399;
    private JTextField Price_1400;
    private JTextField Price_1401;
    private JLabel rowss;
    private JLabel C1397;
    private JLabel C1398;
    private JLabel C1399;
    private JLabel C1400;
    private JLabel C1401;
    private JTextArea rate_97_98;
    private JTextArea rate_98_99;
    private JTextArea rate_99_1400;
    private JTextArea rate_1400_1401;
    private JLabel t97_98;
    private JLabel t98_99;
    private JLabel t99_00;
    private JLabel t00_01;
    private JLabel avg_RateL;
    private JTextField avg_Rate;
    private JLabel must;


    public InflationGUI() {
        //construct components
        panel = new JPanel();
        must = new JLabel("!لازم برای جستوجو ");
        Alert = new JLabel ("مامور گرامی , لطفا اطلاعات زیر را طیق مستندات ارائه شده تکمیل نمایید");
        factory_Name = new JLabel ("نام کارخانه/شرکت :");
        product_name = new JLabel ("نام محصول  :");
        product_nameR = new JTextField (1);
        factory_nameR = new JTextField (1);
        submit = new JButton ("ثبت اطلاعات");
        reset = new JButton ("پاک کردن همه");
        edit = new JButton("تغییر");
        search = new JButton("جستوجو");
        mainMenu = new JButton("منوی اصلی");

        Price_1397 = new JTextField (1);
        Price_1398 = new JTextField (1);
        Price_1399 = new JTextField (1);
        Price_1400 = new JTextField (1);
        Price_1401 = new JTextField (1);
        rowss = new JLabel ("                    قیمت                   سال  ");
        C1397 = new JLabel ("1397");
        C1398 = new JLabel ("1398");
        C1399 = new JLabel ("1399");
        C1400 = new JLabel ("1400");
        C1401 = new JLabel ("1401");
        rate_97_98 = new JTextArea (1, 1);
        rate_98_99 = new JTextArea (1, 1);
        rate_99_1400 = new JTextArea (1, 1);
        rate_1400_1401 = new JTextArea (1, 1);
        t97_98 = new JLabel ("درصد تورم 97_98 : ");
        t98_99 = new JLabel ("درصد تورم 98_99 : ");
        t99_00 = new JLabel ("درصد تورم 99_00 : ");
        t00_01 = new JLabel ("درصد تورم 00_01 : ");
        avg_RateL = new JLabel ("متوسط تورم : ");
        avg_Rate = new JTextField (1);

        //set components properties
        rate_1400_1401.setEnabled (false);
        rate_99_1400.setEnabled (false);
        rate_98_99.setEnabled (false);
        rate_97_98.setEnabled (false);

        rate_97_98.setBackground(Color.gray);
        rate_98_99.setBackground(Color.gray);
        rate_99_1400.setBackground(Color.gray);
        rate_1400_1401.setBackground(Color.gray);


        //adjust size and set layout
        panel.setPreferredSize (new Dimension (944, 733));
        panel.setLayout (null);


        //add components
        panel.add (Alert);
        panel.add (must);
        panel.add (factory_Name);
        panel.add (product_name);
        panel.add (product_nameR);
        panel.add (factory_nameR);
        panel.add (submit);
        panel.add (reset);
        panel.add (search);
        panel.add (edit);
        panel.add (mainMenu);
        panel.add (Price_1397);
        panel.add (Price_1398);
        panel.add (Price_1399);
        panel.add (Price_1400);
        panel.add (Price_1401);
        panel.add (rowss);
        panel.add (C1397);
        panel.add (C1398);
        panel.add (C1399);
        panel.add (C1400);
        panel.add (C1401);
        panel.add (rate_97_98);
        panel.add (rate_98_99);
        panel.add (rate_99_1400);
        panel.add (rate_1400_1401);
        panel.add (t97_98);
        panel.add (t98_99);
        panel.add (t99_00);
        panel.add (t00_01);
        panel.add (avg_RateL);
        panel.add (avg_Rate);
        panel.add (must);


//set component bounds (only needed by Absolute Positioning)
        Alert.setBounds (260, 10, 410, 30);
        factory_Name.setBounds (580, 110, 100, 25);
        product_name.setBounds (580, 160, 100, 25);
        product_nameR.setBounds (445, 160, 100, 25);
        must.setBounds(360,160,100,25);
        factory_nameR.setBounds (445, 115, 100, 25);
        submit.setBounds (250, 360, 100, 25);
        reset.setBounds (465, 360, 100, 25);
        search.setBounds(250,390,100,25);
        edit.setBounds(465,390,100,25);
        mainMenu.setBounds(10,10,80,20);
        Price_1397.setBounds (290, 195, 110, 20);
        Price_1398.setBounds (290, 215, 110, 20);
        Price_1399.setBounds (290, 235, 110, 20);
        Price_1400.setBounds (290, 255, 110, 20);
        Price_1401.setBounds (290, 275, 110, 20);
        rowss.setBounds (255, 170, 355, 25);
        C1397.setBounds (255, 195, 40, 20);
        C1398.setBounds (255, 215, 35, 20);
        C1399.setBounds (255, 235, 35, 20);
        C1400.setBounds (255, 255, 40, 20);
        C1401.setBounds (255, 275, 40, 20);
        rate_97_98.setBounds (400, 205, 110, 20);
        rate_98_99.setBounds (400, 225, 110, 20);
        rate_99_1400.setBounds (400, 245, 110, 20);
        rate_1400_1401.setBounds (400, 265, 110, 20);
        t97_98.setBounds (510, 205, 100, 20);
        t98_99.setBounds (510, 225, 105, 20);
        t99_00.setBounds (510, 245, 110, 20);
        t00_01.setBounds (510, 265, 100, 20);
        avg_RateL.setBounds (435, 320, 100, 25);
        avg_Rate.setBounds (335, 320, 100, 25);




        reset.addActionListener(this);
        mainMenu.addActionListener(this);

        avg_Rate.setEditable(false);

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

    public void setAvg_Rate(String RE_avr_Rate){avg_Rate.setText(RE_avr_Rate);}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reset) {
            product_nameR.setText("");
            factory_nameR.setText("");

            Price_1397.setText("");
            Price_1398.setText("");
            Price_1399.setText("");
            Price_1400.setText("");
            Price_1401.setText("");

            rate_97_98.setText("");
            rate_98_99.setText("");
            rate_99_1400.setText("");
            rate_1400_1401.setText("");


            avg_Rate.setText("");
        }else if (e.getSource() == mainMenu){
            dispose();
            MenuGUI gui = new MenuGUI().setLogInUser(user);
            gui.setUser();
        }
    }



    public String getProduct_Name(){return product_nameR.getText();}
    public String getFactory_Name(){return factory_nameR.getText();}

    public void setrate_97_98(String RErate_97_98){rate_97_98.setText(RErate_97_98);}
    public void setrate_98_99(String RErate_98_99){rate_98_99.setText(RErate_98_99);}
    public void setrate_99_1400(String RErate_99_1400){rate_99_1400.setText(RErate_99_1400);}
    public void setrate_1400_1401(String RErate_1400_1401){rate_1400_1401.setText(RErate_1400_1401);}

    public String getPrice_1397(){return Price_1397.getText();}
    public String getPrice_1398(){return Price_1398.getText();}
    public String getPrice_1399(){return Price_1399.getText();}
    public String getPrice_1400(){return Price_1400.getText();}
    public String getPrice_1401(){return Price_1401.getText();}

    public void setter(InflationEnt ent){
        product_nameR.setText(ent.getProduct_Name());
        factory_nameR.setText(ent.getCompany_Name());

        Price_1397.setText(String.valueOf(ent.getPrice_1397()));
        Price_1398.setText(String.valueOf(ent.getPrice_1398()));
        Price_1399.setText(String.valueOf(ent.getPrice_1399()));
        Price_1400.setText(String.valueOf(ent.getPrice_1400()));
        Price_1401.setText(String.valueOf(ent.getPrice_1401()));

        rate_97_98.setText(String.valueOf(ent.getRate_97_98()));
        rate_98_99.setText(String.valueOf(ent.getRate_98_99()));
        rate_99_1400.setText(String.valueOf(ent.getRate_99_1400()));
        rate_1400_1401.setText(String.valueOf(ent.getRate_1400_1401()));

        avg_Rate.setText(String.valueOf(ent.getAvg_Rate()));
    }


}