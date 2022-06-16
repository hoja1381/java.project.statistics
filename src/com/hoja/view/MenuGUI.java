package com.hoja.view;

import com.hoja.cont.FactoryCont;
import com.hoja.cont.InflationCont;
import com.hoja.cont.UnemploymentCont;
import com.hoja.cont.peopleCont;
import com.hoja.ents.FactoryEnt;
import com.hoja.ents.InflationEnt;
import com.hoja.ents.PeopleEnt;
import com.hoja.ents.UnemploymentEnt;
import com.hoja.services.FactoryServ;
import com.hoja.services.InflationServ;
import com.hoja.services.PeopleServ;
import com.hoja.services.UnemploymentServ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGUI extends JFrame implements ActionListener {
    private String logInUser;
    public String getLogInUser() {
        return logInUser;
    }
   public MenuGUI setLogInUser(String logInUser) {
       this.logInUser = logInUser;
       return this;
   }

    private JPanel panel;
    private JList Tables_list;
    private JLabel textt;
    private JButton Submit;
    private JTextField User;
    private JLabel userR;

    public  MenuGUI()  {
        //construct preComponents
        String[] Tables_listItems = {"مردم", "کارخانه/شرکت", "تورم", "بیکاری"};

        //construct components
        User = new JTextField();
        userR = new JLabel("کاربر فعلی:");
        User.setEditable(false);
        panel = new JPanel();
        Tables_list = new JList (Tables_listItems);
        textt = new JLabel ("مامور گرامی , جدول مورد نظر را از جدول زیر انتخاب کنید :");
        Submit = new JButton ("تایید");

        //adjust size and set layout
        panel.setPreferredSize (new Dimension(944, 557));
        panel.setLayout (null);

        //add components
        panel.add (Tables_list);
        panel.add (textt);
        panel.add (Submit);
        panel.add(User);
        panel.add(userR);



        //set component bounds (only needed by Absolute Positioning)
        Tables_list.setBounds (420, 80, 85, 80);
        textt.setBounds (360, 45, 240, 30);
        Submit.setBounds (410, 180, 100, 25);
        User.setBounds(10,10,80,20);
        userR.setBounds(95,10,80,20);


        Submit.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add (panel);
        pack();
        setVisible (true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Tables_list.getAnchorSelectionIndex() == 0){
            this.dispose();
            PeopleGUI gui = new PeopleGUI().setUser(logInUser);
            PeopleEnt ent = new PeopleEnt().setLatest_Data_Changer(logInUser);
            PeopleServ serv = new PeopleServ();

            peopleCont cont = new peopleCont(serv,ent,gui);
        }else if (Tables_list.getAnchorSelectionIndex() == 1){
            this.dispose();
            FactoryGUI gui =new FactoryGUI().setUser(logInUser);
            FactoryEnt ent =new FactoryEnt().setLatest_Data_Changer(logInUser);;
            FactoryServ serv = new FactoryServ();

            FactoryCont factoryCont = new FactoryCont(serv,ent,gui);
        }else if (Tables_list.getAnchorSelectionIndex() == 2){
            this.dispose();
            InflationGUI gui = new InflationGUI().setUser(logInUser);
            InflationEnt ent =new InflationEnt().setLatest_Data_Changer(logInUser);;
            InflationServ serv = new InflationServ();

            InflationCont cont = new InflationCont(serv,ent,gui);
        }else if (Tables_list.getAnchorSelectionIndex() == 3){
            this.dispose();
            UnemploymentGUI gui = new UnemploymentGUI().setUser(logInUser);
            UnemploymentEnt ent = new UnemploymentEnt().setLatest_Date_Changer(logInUser);;
            UnemploymentServ serv = new UnemploymentServ();

            UnemploymentCont cont = new UnemploymentCont(serv,ent,gui);
        }

    }
    public void setUser(){
        User.setText(logInUser);
    }
}