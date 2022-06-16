package com.hoja.cont;

import com.hoja.ents.PeopleEnt;
import com.hoja.services.PeopleServ;
import com.hoja.view.PeopleGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class peopleCont {
    private PeopleServ serv;
    private PeopleEnt ent;
    private PeopleGUI gui;

    public peopleCont(PeopleServ serv,PeopleEnt ent,PeopleGUI gui){
        this.ent = ent;
        this.serv = serv;
        this.gui = gui;

        this.gui.submitlistener(new addsubmitlistener());
        this.gui.searchListener(new addsearchlistener());
        this.gui.editListener(new addeditlistener());
    }
    class addsubmitlistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String date = String.valueOf(new Date());

            ent.setLatest_Data_Change_Date_and_Time(date);
            ent.setAge(gui.getAge());

            ent.setID_Code(gui.getIdCode());
            ent.setName(gui.getName());
            ent.setAddress(gui.getAddress());
            ent.setGender(gui.getGender());
            ent.setCh1(gui.getch1());
            ent.setCh2(gui.getch2());
            ent.setCh3(gui.getch3());
            ent.setCh4(gui.getch4());
            ent.setCh5(gui.getch5());
            ent.setCh6(gui.getch6());
            ent.setCh7(gui.getch7());
            ent.setCh8(gui.getch8());

            ent.setIncome_1397(Long.parseLong(gui.getIncome1397()));
            ent.setIncome_1398(Long.parseLong(gui.getIncome1398()));
            ent.setIncome_1399(Long.parseLong(gui.getIncome1399()));
            ent.setIncome_1400(Long.parseLong(gui.getIncome1400()));
            ent.setIncome_1401(Long.parseLong(gui.getIncome1401()));

            if(gui.getemployment97()){
                ent.setEmployment_Status_1397('e');
            }else {ent.setEmployment_Status_1397('u');}
            if(gui.getemployment98()){
                ent.setEmployment_Status_1398('e');
            }else {ent.setEmployment_Status_1398('u');}
            if(gui.getemployment99()){
                ent.setEmployment_Status_1399('e');
            }else {ent.setEmployment_Status_1399('u');}
            if(gui.getemployment00()){
                ent.setEmployment_Status_1400('e');
            }else {ent.setEmployment_Status_1400('u');}
            if(gui.getemployment01()){
                ent.setEmployment_Status_1401('e');
            }else {ent.setEmployment_Status_1401('u');}
            if (gui.getCarelabel()){
                ent.setCareTaker_Name(gui.getName());
            }else {
                ent.setCareTaker_Name(gui.getCaretaker_name());
            }
            try {

            PeopleEnt ch1= new PeopleEnt()
                    ,ch2= new PeopleEnt()
                    ,ch3= new PeopleEnt()
                    ,ch4= new PeopleEnt()
                    ,ch5= new PeopleEnt()
                    ,ch6= new PeopleEnt()
                    ,ch7= new PeopleEnt()
                    ,ch8 = new PeopleEnt();



            if(!(ent.getCh1().length() == 0)) {
                ch1 = new PeopleEnt().setID_Code(gui.getCH1Id()).setName(gui.getch1()).setAge(gui.getch1age())
                    .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                serv.save(ch1);
            }
            if(!(ent.getCh2().length() == 0)) {
                ch2 = new PeopleEnt().setID_Code(gui.getCH2Id()).setName(gui.getch2()).setAge(gui.getch2age())
                        .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                serv.save(ch2);
            }
            if(!(ent.getCh3().length() == 0)) {
                ch3 = new PeopleEnt().setID_Code(gui.getCH3Id()).setName(gui.getch3()).setAge(gui.getch3age())
                        .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                serv.save(ch3);
            }
            if(!(ent.getCh4().length() == 0)) {
                ch4 = new PeopleEnt().setID_Code(gui.getCH4Id()).setName(gui.getch4()).setAge(gui.getch4age())
                        .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                serv.save(ch4);
            }
            if(!(ent.getCh5().length() == 0)) {
                 ch5 = new PeopleEnt().setID_Code(gui.getCH5Id()).setName(gui.getch5()).setAge(gui.getch5age())
                         .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                serv.save(ch5);
            }
            if(!(ent.getCh6().length() == 0)) {
                ch6 = new PeopleEnt().setID_Code(gui.getCH6Id()).setName(gui.getch6()).setAge(gui.getch6age())
                        .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                serv.save(ch6);
            }
            if(!(ent.getCh7().length() == 0)) {
                ch7 = new PeopleEnt().setID_Code(gui.getCH7Id()).setName(gui.getch7()).setAge(gui.getch7age())
                        .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                serv.save(ch7);
            }
            if(!(ent.getCh8().length() == 0)) {
                ch8 = new PeopleEnt().setID_Code(gui.getCH8Id()).setName(gui.getch8()).setAge(gui.getch8age())
                        .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                serv.save(ch8);
            }

                serv.save(ent);

                gui.errorMassage("اطلاعات با موفقیت ثبت شد");

            } catch (Exception ex) {
                ex.printStackTrace();
                gui.errorMassage("اطلاعات وارد شده تکراری یا نا معتبر است ");
            }

        }
    }
    class addsearchlistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
              PeopleEnt  reportCh1= new PeopleEnt()
                      ,reportCh2= new PeopleEnt()
                      ,reportCh3= new PeopleEnt()
                      ,reportCh4= new PeopleEnt()
                      , reportCh5= new PeopleEnt()
                      ,reportCh6= new PeopleEnt()
                      ,reportCh7= new PeopleEnt()
                      ,reportCh8 = new PeopleEnt();

            PeopleEnt report = serv.reportName(new PeopleEnt().setName(gui.getName()));

            if (!(report.getCh1() == null)){
                if(!(report.getCh1().isEmpty())) {
                    reportCh1 = serv.reportName(new PeopleEnt().setName(report.getCh1()));
                }
            }
            if (!(report.getCh2()== null)){
             if(!(report.getCh2().equals(""))) {
                 reportCh2 = serv.reportName(new PeopleEnt().setName(report.getCh2()));
             }
            }
            if (!(report.getCh3()== null)) {
                if (!(report.getCh3().equals(""))) {
                    reportCh3 = serv.reportName(new PeopleEnt().setName(report.getCh3()));
                }
            }
            if ( !(report.getCh4()== null)){
                if(!(report.getCh4().equals(""))) {
                    reportCh4 = serv.reportName(new PeopleEnt().setName(report.getCh4()));
                }
            }
            if ( !(report.getCh5()== null)) {
                if (!(report.getCh5().equals(""))) {
                    reportCh5 = serv.reportName(new PeopleEnt().setName(report.getCh5()));
                }
            }
            if (!(report.getCh6()== null)) {
                if (!(report.getCh6().equals(""))) {
                    reportCh6 = serv.reportName(new PeopleEnt().setName(report.getCh6()));
                }
            }
            if (!(report.getCh7()== null)) {
                if (!(report.getCh7().equals(""))) {
                    reportCh7 = serv.reportName(new PeopleEnt().setName(report.getCh7()));
                }
            }
            if (!(report.getCh8()== null)) {
                if (!(report.getCh8().equals(""))) {
                    reportCh8 = serv.reportName(new PeopleEnt().setName(report.getCh8()));
                }
            }

                gui.setter(report,reportCh1,reportCh2,reportCh3,reportCh4,
                                  reportCh5,reportCh6,reportCh7,reportCh8);

            } catch (Exception ex) {
                ex.printStackTrace();
                gui.errorMassage("اطلاعاتی یافت نشد");
            }
        }
    }
    class addeditlistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String date = String.valueOf(new Date());

            ent.setLatest_Data_Change_Date_and_Time(date);
            ent.setAge(gui.getAge());
            ent.setSpouse(gui.getCrentSpouse_Name());

            ent.setID_Code(gui.getIdCode());
            ent.setName(gui.getName());
            ent.setAddress(gui.getAddress());
            ent.setGender(gui.getGender());
            ent.setCh1(gui.getch1());
            ent.setCh2(gui.getch2());
            ent.setCh3(gui.getch3());
            ent.setCh4(gui.getch4());
            ent.setCh5(gui.getch5());
            ent.setCh6(gui.getch6());
            ent.setCh7(gui.getch7());
            ent.setCh8(gui.getch8());

            ent.setIncome_1397(Long.parseLong(gui.getIncome1397()));
            ent.setIncome_1398(Long.parseLong(gui.getIncome1398()));
            ent.setIncome_1399(Long.parseLong(gui.getIncome1399()));
            ent.setIncome_1400(Long.parseLong(gui.getIncome1400()));
            ent.setIncome_1401(Long.parseLong(gui.getIncome1401()));

            if(gui.getemployment97()){
                ent.setEmployment_Status_1397('e');
            }else {ent.setEmployment_Status_1397('u');}
            if(gui.getemployment98()){
                ent.setEmployment_Status_1398('e');
            }else {ent.setEmployment_Status_1398('u');}
            if(gui.getemployment99()){
                ent.setEmployment_Status_1399('e');
            }else {ent.setEmployment_Status_1399('u');}
            if(gui.getemployment00()){
                ent.setEmployment_Status_1400('e');
            }else {ent.setEmployment_Status_1400('u');}
            if(gui.getemployment01()){
                ent.setEmployment_Status_1401('e');
            }else {ent.setEmployment_Status_1401('u');}


            if (gui.getCarelabel()){
                ent.setCareTaker_Name(gui.getName());
            }else {
                ent.setCareTaker_Name(gui.getCaretaker_name());
            }
            try {

                PeopleEnt ch1= new PeopleEnt()
                        ,ch2= new PeopleEnt()
                        ,ch3= new PeopleEnt()
                        ,ch4= new PeopleEnt()
                        ,ch5= new PeopleEnt()
                        ,ch6= new PeopleEnt()
                        ,ch7= new PeopleEnt()
                        ,ch8 = new PeopleEnt();



                if(!(ent.getCh1().length() == 0)) {
                    ch1 = new PeopleEnt().setID_Code(gui.getCH1Id()).setName(gui.getch1()).setAge(gui.getch1age())
                            .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                    serv.edit(ch1);
                }
                if(!(ent.getCh2().length() == 0)) {
                    ch2 = new PeopleEnt().setID_Code(gui.getCH2Id()).setName(gui.getch2()).setAge(gui.getch2age())
                            .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                    serv.edit(ch2);
                }
                if(!(ent.getCh3().length() == 0)) {
                    ch3 = new PeopleEnt().setID_Code(gui.getCH3Id()).setName(gui.getch3()).setAge(gui.getch3age())
                            .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                    serv.edit(ch3);
                }
                if(!(ent.getCh4().length() == 0)) {
                    ch4 = new PeopleEnt().setID_Code(gui.getCH4Id()).setName(gui.getch4()).setAge(gui.getch4age())
                            .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                    serv.edit(ch4);
                }
                if(!(ent.getCh5().length() == 0)) {
                    ch5 = new PeopleEnt().setID_Code(gui.getCH5Id()).setName(gui.getch5()).setAge(gui.getch5age())
                            .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                    serv.edit(ch5);
                }
                if(!(ent.getCh6().length() == 0)) {
                    ch6 = new PeopleEnt().setID_Code(gui.getCH6Id()).setName(gui.getch6()).setAge(gui.getch6age())
                            .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                    serv.edit(ch6);
                }
                if(!(ent.getCh7().length() == 0)) {
                    ch7 = new PeopleEnt().setID_Code(gui.getCH7Id()).setName(gui.getch7()).setAge(gui.getch7age())
                            .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                    serv.edit(ch7);
                }
                if(!(ent.getCh8().length() == 0)) {
                    ch8 = new PeopleEnt().setID_Code(gui.getCH8Id()).setName(gui.getch8()).setAge(gui.getch8age())
                            .setCareTaker_Name(ent.getCareTaker_Name()).setLatest_Data_Change_Date_and_Time(date).setLatest_Data_Changer(ent.getLatest_Data_Changer());
                    serv.edit(ch8);
                }

                serv.edit(ent);

                gui.errorMassage("تغییرات با موفقیت ثبت شد");


            } catch (Exception ex) {
                ex.printStackTrace();
                gui.errorMassage("تغییر اطلاعات ممکن نیست");
            }


        }
    }


}
