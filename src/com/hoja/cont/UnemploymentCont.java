package com.hoja.cont;

import com.hoja.ents.UnemploymentEnt;
import com.hoja.services.UnemploymentServ;
import com.hoja.view.UnemploymentGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class UnemploymentCont {
    private UnemploymentGUI gui;
    private UnemploymentEnt ent;
    private UnemploymentServ serv;

    public UnemploymentCont(UnemploymentServ serv,UnemploymentEnt ent,UnemploymentGUI gui){
       this.serv = serv;
       this.ent = ent;
       this.gui = gui;

        this.gui.submitlistener(new addsubmitlistener());
        this.gui.searchListener(new addsearchlistener());
        this.gui.editListener(new addeditlistener());

    }
    class addsubmitlistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String date = String.valueOf(new Date());

            UnemploymentEnt ent1397 = new UnemploymentEnt();
            UnemploymentEnt ent1398 = new UnemploymentEnt();
            UnemploymentEnt ent1399 = new UnemploymentEnt();
            UnemploymentEnt ent1400 = new UnemploymentEnt();
            UnemploymentEnt ent1401 = new UnemploymentEnt();

            ent1397.setYear(1397).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1397()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1397()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());

            ent1398.setYear(1398).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1398()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1398()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());

            ent1399.setYear(1399).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1399()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1399()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());

            ent1400.setYear(1400).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1400()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1400()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());

            ent1401.setYear(1401).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1401()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1401()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());

            try {
                serv.save(ent1397);
                serv.save(ent1398);
                serv.save(ent1399);
                serv.save(ent1400);
                serv.save(ent1401);

                UnemploymentEnt report1397 = serv.report(ent1397);
                UnemploymentEnt report1398 = serv.report(ent1398);
                UnemploymentEnt report1399 = serv.report(ent1399);
                UnemploymentEnt report1400 = serv.report(ent1400);
                UnemploymentEnt report1401 = serv.report(ent1401);

                gui.setUnemployment_Percentage1397(String.valueOf(report1397.getUnemploymentPercentage()));
                gui.setUnemployment_Percentage1398(String.valueOf(report1398.getUnemploymentPercentage()));
                gui.setUnemployment_Percentage1399(String.valueOf(report1399.getUnemploymentPercentage()));
                gui.setUnemployment_Percentage1400(String.valueOf(report1400.getUnemploymentPercentage()));
                gui.setUnemployment_Percentage1401(String.valueOf(report1401.getUnemploymentPercentage()));

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

                UnemploymentEnt report1397 = serv.report(new UnemploymentEnt().setYear(1397));
                UnemploymentEnt report1398 = serv.report(new UnemploymentEnt().setYear(1398));
                UnemploymentEnt report1399 = serv.report(new UnemploymentEnt().setYear(1399));
                UnemploymentEnt report1400 = serv.report(new UnemploymentEnt().setYear(1400));
                UnemploymentEnt report1401 = serv.report(new UnemploymentEnt().setYear(1401));

                gui.setter(report1397,report1398,report1399,report1400,report1401);


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

            UnemploymentEnt ent1397 = new UnemploymentEnt();
            UnemploymentEnt ent1398 = new UnemploymentEnt();
            UnemploymentEnt ent1399 = new UnemploymentEnt();
            UnemploymentEnt ent1400 = new UnemploymentEnt();
            UnemploymentEnt ent1401 = new UnemploymentEnt();

            ent1397.setYear(1397).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1397()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1397()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());
            ent1398.setYear(1398).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1398()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1398()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());;
            ent1399.setYear(1399).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1399()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1399()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());;
            ent1400.setYear(1400).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1400()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1400()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());;
            ent1401.setYear(1401).setAmountOfUnemployment(Integer.parseInt(gui.getAmount_Unemployed1401()))
                    .setAmountOfEmployment(Integer.parseInt(gui.getAmount_Employed1401()))
                    .setLatest_Date_Change_Date_and_Time(date).setLatest_Date_Changer(ent.getLatest_Date_Changer());;

            try {

                serv.update(ent1397);
                serv.update(ent1398);
                serv.update(ent1399);
                serv.update(ent1400);
                serv.update(ent1401);
                gui.setter(ent1397,ent1398,ent1399,ent1400,ent1401);

                gui.errorMassage("تغییرات با موفقیت ثبت شد");

            } catch (Exception ex) {
                ex.printStackTrace();
                gui.errorMassage("تغییر اطلاعات ممکن نیست");
            }

        }
    }
}
