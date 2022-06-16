package com.hoja.view;


import com.hoja.ents.PeopleEnt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PeopleGUI extends JFrame implements ActionListener {
    private String user;
    public String getUser() {
        return user;
    }
    public PeopleGUI setUser(String user) {
        this.user = user;
        return this;
    }


    private JPanel panel;
    private JLabel alert;
    private JLabel jcomp2;
    private JTextField id_code;
    private JLabel name;
    private JTextField nameR;
    private JRadioButton carelabel;
    private JLabel care_Name;
    private JTextField care_NameR;
    private JComboBox genderR;
    private JLabel address;
    private JLabel jcomp11;
    private JLabel ch1;
    private JTextField ch1Name;
    private JComboBox ch1Age;
    private JLabel ch2;
    private JLabel ch3;
    private JTextField ch2Name;
    private JLabel ch4;
    private JLabel ch5;
    private JLabel ch6;
    private JTextField ch3Name;
    private JTextField ch4Name;
    private JPasswordField ch5Name;
    private JTextField ch6Name;
    private JTextField ch7Name;
    private JTextField ch8Name;
    private JLabel ID_CH_Code;
    private JLabel ch7;
    private JLabel vh8;
    private JComboBox ageR;
    private JLabel age;
    private JComboBox ch4Age;
    private JComboBox ch5Age;
    private JComboBox ch6Age;
    private JComboBox ch8Age;
    private JComboBox ch7Age;
    private JComboBox ch2Age;
    private JComboBox ch3Age;
    private JLabel gender;
    private JTextField addressR;
    private JLabel jcomp40;
    private JLabel spouse;
    private JTextField spouseR;
    private JLabel jcomp43;
    private JTextField income97;
    private JLabel jcomp45;
    private JTextArea jcomp46;
    private JLabel jcomp47;
    private JLabel jcomp48;
    private JToggleButton employment97;
    private JToggleButton employment98;
    private JToggleButton employment99;
    private JToggleButton employment00;
    private JToggleButton employment01;
    private JTextField income98;
    private JTextField income99;
    private JTextField income00;
    private JTextField income01;
    private JLabel jcomp58;
    private JLabel jcomp59;
    private JLabel jcomp60;
    private JLabel jcomp61;
    private JTextField ch1_code;
    private JTextField ch2_code;
    private JTextField ch3_code;
    private JTextField ch4_code;
    private JTextField ch5_code;
    private JTextField ch6_code;
    private JTextField ch7_code;
    private JTextField ch8_code;
    private JButton submit;
    private JButton reset;
    private JButton mainMenu;
    private JButton search;
    private JButton edit;
    private JLabel must;


    public PeopleGUI() {
        //construct preComponents
        String[] genderRItems = {"مرد", "زن", "سایر"};
        String[] ch1AgeItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
        String[] ageRItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
        String[] ch4AgeItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
        String[] ch5AgeItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
        String[] ch6AgeItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
        String[] ch8AgeItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
        String[] ch7AgeItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
        String[] ch2AgeItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
        String[] ch3AgeItems = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"};
//construct components
        panel = new JPanel();
        must = new JLabel("!لازم برای جستوجو ");
        ID_CH_Code = new JLabel("کد ملی فرزندان");
        alert = new JLabel ("مامور گرامی , لطفا اطلاعات زیر را طیق مستندات ارائه شده تکمیل نمایید");
        jcomp2 = new JLabel ("کد ملی:");
        id_code = new JTextField (1);
        name = new JLabel ("نام و نام خانوادگی :");
        nameR = new JTextField (1);
        carelabel = new JRadioButton ("سرپرست خانوار هستم");
        care_Name = new JLabel ("نام سرپرست خانوار را وارد کنید :");
        care_NameR = new JTextField (5);
        genderR = new JComboBox (genderRItems);
        address = new JLabel ("آدرس محل زندگی  :");
        jcomp11 = new JLabel ("اطلاعات فرزندان");
        ch1 = new JLabel ("فرزند اول :");
        ch1Name = new JTextField (1);
        ch1Age = new JComboBox (ch1AgeItems);
        ch2 = new JLabel ("فرزند دوم :");
        ch3 = new JLabel ("فرزند سوم :");
        ch2Name = new JTextField (1);
        ch4 = new JLabel ("فرزند چهارم :");
        ch5 = new JLabel ("فرزند پنجم :");
        ch6 = new JLabel ("فرزند ششم :");
        ch3Name = new JTextField (1);
        ch4Name = new JTextField (1);
        ch5Name = new JPasswordField (1);
        ch6Name = new JTextField (1);
        ch7Name = new JTextField (1);
        ch8Name = new JTextField (1);
        ch7 = new JLabel ("فرزند هفتم :");
        vh8 = new JLabel ("فرزند هشتم :");
        ageR = new JComboBox (ageRItems);
        age = new JLabel ("سن :");
        ch4Age = new JComboBox (ch4AgeItems);
        ch5Age = new JComboBox (ch5AgeItems);
        ch6Age = new JComboBox (ch6AgeItems);
        ch8Age = new JComboBox (ch8AgeItems);
        ch7Age = new JComboBox (ch7AgeItems);
        ch2Age = new JComboBox (ch2AgeItems);
        ch3Age = new JComboBox (ch3AgeItems);
        gender = new JLabel ("جنسیت :");
        addressR = new JTextField (1);
        jcomp40 = new JLabel ("newLabel");
        spouse = new JLabel ("نام همسر فعلی :");
        spouseR = new JTextField (1);
        jcomp43 = new JLabel ("اطلاعات اشتغال");
        income97 = new JTextField (1);
        jcomp45 = new JLabel ("1397 :");
        jcomp46 = new JTextArea (5, 5);
        jcomp47 = new JLabel ("شاغل ");
        jcomp48 = new JLabel ("درآمد ");
        employment97 = new JToggleButton ("بودم", false);


        employment98 = new JToggleButton ("بودم", false);
        employment99 = new JToggleButton ("بودم", false);
        employment00 = new JToggleButton ("بودم", false);
        employment01 = new JToggleButton ("بودم", false);
        income98 = new JTextField (1);
        income99 = new JTextField (1);
        income00 = new JTextField (1);
        income01 = new JTextField (1);
        jcomp58 = new JLabel ("1398 :");
        jcomp59 = new JLabel ("1399 :");
        jcomp60 = new JLabel ("1400 :");
        jcomp61 = new JLabel ("1401 :");
        ch1_code = new JTextField (1);
        ch2_code = new JTextField (1);
        ch3_code = new JTextField (1);
        ch4_code = new JTextField (1);
        ch5_code = new JTextField (1);
        ch6_code = new JTextField (1);
        ch7_code = new JTextField (1);
        ch8_code = new JTextField (1);
        submit = new JButton ("ثبت");
        reset = new JButton ("حذف همه");
        mainMenu = new JButton("منوی اصلی");
        edit = new JButton("تغییر");
        search = new JButton("جستوجو");


        //adjust size and set layout
       panel.setPreferredSize (new Dimension (944, 827));
       panel.setLayout (null);

//add components
        panel.add (alert);
        panel.add (jcomp2);
        panel.add (id_code);
        panel.add (name);
        panel.add (nameR);
        panel.add (carelabel);
        panel.add (care_Name);
        panel.add (care_NameR);
        panel.add (genderR);
        panel.add (address);
        panel.add (jcomp11);
        panel.add (ch1);
        panel.add (ch1Name);
        panel.add (ch1Age);
        panel.add (ch2);
        panel.add (ch3);
        panel.add (ch2Name);
        panel.add (ch4);
        panel.add (ch5);
        panel.add (ch6);
        panel.add (ch3Name);
        panel.add (ch4Name);
        panel.add (ch5Name);
        panel.add (ch6Name);
        panel.add (ch7Name);
        panel.add (ch8Name);
        panel.add (ch7);
        panel.add (vh8);
        panel.add (ageR);
        panel.add (age);
        panel.add (ch4Age);
        panel.add (ch5Age);
        panel.add (ch6Age);
        panel.add (ch8Age);
        panel.add (ch7Age);
        panel.add (ch2Age);
        panel.add (ch3Age);
        panel.add (gender);
        panel.add (addressR);
        panel.add (jcomp40);
        panel.add (spouse);
        panel.add (spouseR);
        panel.add (jcomp43);
        panel.add (income97);
        panel.add (jcomp45);
        panel.add (jcomp46);
        panel.add (jcomp47);
        panel.add (jcomp48);
        panel.add (employment97);
        panel.add (employment98);
        panel.add (employment99);
        panel.add (employment00);
        panel.add (employment01);
        panel.add (income98);
        panel.add (income99);
        panel.add (income00);
        panel.add (income01);
        panel.add (jcomp58);
        panel.add (jcomp59);
        panel.add (jcomp60);
        panel.add (jcomp61);
        panel.add (ch1_code);
        panel.add (ch2_code);
        panel.add (ch3_code);
        panel.add (ch4_code);
        panel.add (ch5_code);
        panel.add (ch6_code);
        panel.add (ch7_code);
        panel.add (ch8_code);
        panel.add (ID_CH_Code);
        panel.add (submit);
        panel.add (reset);
        panel.add (edit);
        panel.add (search);
        panel.add (mainMenu);
        panel.add (must);



//set component bounds (only needed by Absolute Positioning)
        alert.setBounds (320, 0, 390, 30);
        jcomp2.setBounds (615, 40, 100, 25);
        id_code.setBounds (515, 40, 100, 25);
        must.setBounds(440,40,100,25);
        name.setBounds (320, 35, 100, 25);
        nameR.setBounds (220, 35, 100, 25);
        carelabel.setBounds (520, 75, 120, 25);
        care_Name.setBounds (360, 70, 180, 25);
        care_NameR.setBounds (250, 70, 100, 25);
        genderR.setBounds (255, 115, 100, 25);
        address.setBounds (590, 175, 100, 25);
        jcomp11.setBounds (490, 240, 100, 25);
        ID_CH_Code.setBounds(350,240,100,25);
        ch1.setBounds (630, 270, 100, 25);
        ch1Name.setBounds (530, 270, 100, 25);
        ch1Age.setBounds (425, 270, 100, 25);
        ch2.setBounds (630, 300, 100, 25);
        ch3.setBounds (630, 330, 100, 25);
        ch2Name.setBounds (530, 300, 100, 25);
        ch4.setBounds (630, 360, 100, 25);
        ch5.setBounds (630, 390, 100, 25);
        ch6.setBounds (630, 420, 100, 25);
        ch3Name.setBounds (530, 330, 100, 25);
        ch4Name.setBounds (530, 360, 100, 25);
        ch5Name.setBounds (530, 390, 100, 25);
        ch6Name.setBounds (530, 420, 100, 25);
        ch7Name.setBounds (530, 450, 100, 25);
        ch8Name.setBounds (530, 480, 100, 25);
        ch7.setBounds (630, 450, 100, 25);
        vh8.setBounds (630, 480, 100, 25);
        ageR.setBounds (500, 115, 100, 25);
        age.setBounds (605, 115, 50, 25);
        ch4Age.setBounds (425, 360, 100, 25);
        ch5Age.setBounds (425, 390, 100, 25);
        ch6Age.setBounds (425, 420, 100, 25);
        ch8Age.setBounds (425, 480, 100, 25);
        ch7Age.setBounds (425, 450, 100, 25);
        ch2Age.setBounds (425, 300, 100, 25);
        ch3Age.setBounds (425, 330, 100, 25);
        gender.setBounds (360, 115, 100, 25);
        addressR.setBounds (230, 150, 355, 85);
        spouse.setBounds (555, 530, 100, 25);
        spouseR.setBounds (450, 530, 100, 25);
        jcomp43.setBounds (135, 270, 100, 25);
        income97.setBounds (175, 330, 100, 25);
        jcomp45.setBounds (10, 330, 50, 25);
        //jcomp46.setBounds (395, 455, 30, 325);
        jcomp47.setBounds (125, 300, 100, 25);
        jcomp48.setBounds (235, 300, 35, 25);
        employment97.setBounds (65, 330, 100, 25);
        employment98.setBounds (65, 360, 100, 25);
        employment99.setBounds (65, 390, 100, 25);
        employment00.setBounds (65, 420, 100, 25);
        employment01.setBounds (65, 450, 100, 25);
        income98.setBounds (175, 360, 100, 25);
        income99.setBounds (175, 390, 100, 25);
        income00.setBounds (175, 420, 100, 25);

        income01.setBounds (175, 450, 100, 25);
        jcomp58.setBounds (10, 360, 100, 25);
        jcomp59.setBounds (10, 390, 100, 25);
        jcomp60.setBounds (10, 420, 100, 25);
        jcomp61.setBounds (10, 450, 100, 25);



        ch1_code.setBounds (320, 270, 100, 25);
        ch2_code.setBounds (320, 300, 100, 25);
        ch3_code.setBounds (320, 330, 100, 25);
        ch4_code.setBounds (320, 360, 100, 25);
        ch5_code.setBounds (320, 390, 100, 25);
        ch6_code.setBounds (320, 420, 100, 25);
        ch7_code.setBounds (320, 450, 100, 25);
        ch8_code.setBounds (320, 480, 100, 25);
        submit.setBounds (45, 510, 100, 25);
        reset.setBounds (170, 510, 100, 25);
        search.setBounds(45,540,100,25);
        edit.setBounds(170,540,100,25);
        mainMenu.setBounds(10,10,80,20);


        reset.addActionListener(this);
        mainMenu.addActionListener(this);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reset ) {
            id_code.setText("");
            nameR.setText("");
            ageR.setSelectedIndex(0);
            spouseR.setText("");
            genderR.setSelectedIndex(0);
            carelabel.setSelected(false);
            addressR.setText("");
            care_NameR.setText("");
            spouseR.setText("");

            ch1Name.setText("");
            ch2Name.setText("");
            ch3Name.setText("");
            ch4Name.setText("");
            ch5Name.setText("");
            ch6Name.setText("");
            ch7Name.setText("");
            ch8Name.setText("");

            ch1Age.setSelectedIndex(0);
            ch2Age.setSelectedIndex(0);
            ch3Age.setSelectedIndex(0);
            ch4Age.setSelectedIndex(0);
            ch5Age.setSelectedIndex(0);
            ch6Age.setSelectedIndex(0);
            ch7Age.setSelectedIndex(0);
            ch8Age.setSelectedIndex(0);

            ch1_code.setText("");
            ch2_code.setText("");
            ch3_code.setText("");
            ch4_code.setText("");
            ch5_code.setText("");
            ch6_code.setText("");
            ch7_code.setText("");
            ch8_code.setText("");

            income97.setText("");
            income98.setText("");
            income99.setText("");
            income00.setText("");
            income01.setText("");

            employment97.setSelected(false);
            employment98.setSelected(false);
            employment99.setSelected(false);
            employment00.setSelected(false);
            employment01.setSelected(false);
        }else  if (e.getSource() == mainMenu ){
            dispose();
            MenuGUI gui = new MenuGUI().setLogInUser(user);
            gui.setUser();
        }
    }


    public int getAge(){return ageR.getSelectedIndex();}
    public String getIdCode() {return id_code.getText();}
    public String getName() {return nameR.getText();}
    public String getCrentSpouse_Name(){return  spouseR.getText();}
    public String getCaretaker_name(){return  care_NameR.getText();}
    public char getGender(){return genderR.getSelectedItem().toString().charAt(0);}
    public boolean getCarelabel(){return carelabel.isSelected();}
    public String getAddress(){return addressR.getText();}

    public String getch1(){return ch1Name.getText();}
    public String getch2(){return ch2Name.getText();}
    public String getch3(){return ch3Name.getText();}
    public String getch4(){return ch4Name.getText();}
    public String getch5(){return ch5Name.getText();}
    public String getch6(){return ch6Name.getText();}
    public String getch7(){return ch7Name.getText();}
    public String getch8(){return ch8Name.getText();}

    public int getch1age(){return ch1Age.getSelectedIndex();}
    public int getch2age(){return ch2Age.getSelectedIndex();}
    public int getch3age(){return ch3Age.getSelectedIndex();}
    public int getch4age(){return ch4Age.getSelectedIndex();}
    public int getch5age(){return ch5Age.getSelectedIndex();}
    public int getch6age(){return ch6Age.getSelectedIndex();}
    public int getch7age(){return ch7Age.getSelectedIndex();}
    public int getch8age(){return ch8Age.getSelectedIndex();}

    public String getCH1Id(){return ch1_code.getText();}
    public String getCH2Id(){return ch2_code.getText();}
    public String getCH3Id(){return ch3_code.getText();}
    public String getCH4Id(){return ch4_code.getText();}
    public String getCH5Id(){return ch5_code.getText();}
    public String getCH6Id(){return ch6_code.getText();}
    public String getCH7Id(){return ch7_code.getText();}
    public String getCH8Id(){return ch8_code.getText();}


    public String getIncome1397(){return income97.getText();}
    public String getIncome1398(){return income98.getText();}
    public String getIncome1399(){return income99.getText();}
    public String getIncome1400(){return income00.getText();}
    public String getIncome1401(){return income01.getText();}

    public boolean getemployment97(){return employment97.isSelected();}
    public boolean getemployment98(){return employment98.isSelected();}
    public boolean getemployment99(){return employment99.isSelected();}
    public boolean getemployment00(){return employment00.isSelected();}
    public boolean getemployment01(){return employment01.isSelected();}

    public void setter
            (PeopleEnt ent, PeopleEnt ch1,PeopleEnt ch2,
             PeopleEnt ch3,PeopleEnt ch4,PeopleEnt ch5,
             PeopleEnt ch6,PeopleEnt ch7,PeopleEnt ch8){
        id_code.setText(String.valueOf(ent.getID_Code()));
        nameR.setText(ent.getName());
        ageR.setSelectedIndex(ent.getAge());
        spouseR.setText(ent.getSpouse());
        if(ent.getGender() == 'م'){
        genderR.setSelectedIndex(0);}else if (ent.getGender() == 'ز')
        {genderR.setSelectedIndex(1);}else {genderR.setSelectedIndex(2);}
        if(ent.getCareTaker_Name().equals(ent.getName())){
        carelabel.setSelected(true);
        }else {carelabel.setSelected(false);}
        addressR.setText(ent.getAddress());
        care_NameR.setText(ent.getCareTaker_Name());
        spouseR.setText(ent.getSpouse());

        ch1Name.setText(ent.getCh1());
        ch2Name.setText(ent.getCh2());
        ch3Name.setText(ent.getCh3());
        ch4Name.setText(ent.getCh4());
        ch5Name.setText(ent.getCh5());
        ch6Name.setText(ent.getCh6());
        ch7Name.setText(ent.getCh7());
        ch8Name.setText(ent.getCh8());

        ch1Age.setSelectedIndex(ch1.getAge());
        ch2Age.setSelectedIndex(ch2.getAge());
        ch3Age.setSelectedIndex(ch3.getAge());
        ch4Age.setSelectedIndex(ch4.getAge());
        ch5Age.setSelectedIndex(ch5.getAge());
        ch6Age.setSelectedIndex(ch6.getAge());
        ch7Age.setSelectedIndex(ch7.getAge());
        ch8Age.setSelectedIndex(ch8.getAge());

        ch1_code.setText(String.valueOf(ch1.getID_Code()));
        ch2_code.setText(String.valueOf(ch2.getID_Code()));
        ch3_code.setText(String.valueOf(ch3.getID_Code()));
        ch4_code.setText(String.valueOf(ch4.getID_Code()));
        ch5_code.setText(String.valueOf(ch5.getID_Code()));
        ch6_code.setText(String.valueOf(ch6.getID_Code()));
        ch7_code.setText(String.valueOf(ch7.getID_Code()));
        ch8_code.setText(String.valueOf(ch8.getID_Code()));

        income97.setText(String.valueOf(ent.getIncome_1397()));
        income98.setText(String.valueOf(ent.getIncome_1398()));
        income99.setText(String.valueOf(ent.getIncome_1399()));
        income00.setText(String.valueOf(ent.getIncome_1400()));
        income01.setText(String.valueOf(ent.getIncome_1401()));

        if(Character.valueOf(ent.getEmployment_Status_1397()).equals('u')){
        employment97.setSelected(false);
        } else {employment97.setSelected(true);}
        if(Character.valueOf(ent.getEmployment_Status_1398()).equals('u')){
        employment98.setSelected(false);}
        else {employment98.setSelected(true);}
        if(Character.valueOf(ent.getEmployment_Status_1399()).equals('u')){
        employment99.setSelected(false);}
        else {employment99.setSelected(true);}
        if(Character.valueOf(ent.getEmployment_Status_1400()).equals('u')){
        employment00.setSelected(false);}
        else {employment00.setSelected(true);}
        if(Character.valueOf(ent.getEmployment_Status_1401()).equals('u')){
        employment01.setSelected(false);}
        else {employment01.setSelected(true);}


    }

}