package com.hoja.cont;

import com.hoja.ents.AgentEnt;
import com.hoja.ents.InflationEnt;
import com.hoja.services.InflationServ;
import com.hoja.view.InflationGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class InflationCont {
    private InflationEnt ent;
    private InflationServ serv;
    private InflationGUI gui;


    public InflationCont(InflationServ serv, InflationEnt ent, InflationGUI gui){
        this.ent = ent;
        this.serv = serv;
        this.gui = gui;

        this.gui.submitlistener(new addsubmitlistener());
        this.gui.searchListener(new addsearchlistener());
        this.gui.editListener(new addeditlistener());
    }
    class addsubmitlistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           ENTsetter();



            try {

                serv.save(ent);
                InflationEnt report = serv.report(ent);
                gui.setrate_97_98(String.valueOf(report.getRate_97_98()));
                gui.setrate_98_99(String.valueOf(report.getRate_98_99()));
                gui.setrate_99_1400(String.valueOf(report.getRate_99_1400()));
                gui.setrate_1400_1401(String.valueOf(report.getRate_1400_1401()));
                gui.setAvg_Rate(String.valueOf(report.getAvg_Rate()));

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

                InflationEnt report =  serv.report(ent.setProduct_Name(gui.getProduct_Name()));
                gui.setter(report);

            } catch (Exception ex) {
                ex.printStackTrace();
                gui.errorMassage("اطلاعاتی یافت نشد");
            }
        }
    }
    class addeditlistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ENTsetter();
            try {

                serv.edit(ent);
                serv.report(ent);
                gui.setrate_97_98(String.valueOf(ent.getRate_97_98()));
                gui.setrate_98_99(String.valueOf(ent.getRate_98_99()));
                gui.setrate_99_1400(String.valueOf(ent.getRate_99_1400()));
                gui.setrate_1400_1401(String.valueOf(ent.getRate_1400_1401()));
                gui.setAvg_Rate(String.valueOf(ent.getAvg_Rate()));

                gui.errorMassage("تغییرات با موفقیت ثبت شد");

            } catch (Exception ex) {
                ex.printStackTrace();
                gui.errorMassage("تغییر اطلاعات ممکن نیست");
            }
        }

    }
    private void ENTsetter() {
        ent.setProduct_Name(gui.getProduct_Name());
        ent.setCompany_Name(gui.getFactory_Name());

        ent.setPrice_1397(Integer.parseInt(gui.getPrice_1397()));
        ent.setPrice_1398(Integer.parseInt(gui.getPrice_1398()));
        ent.setPrice_1399(Integer.parseInt(gui.getPrice_1399()));
        ent.setPrice_1400(Integer.parseInt(gui.getPrice_1400()));
        ent.setPrice_1401(Integer.parseInt(gui.getPrice_1401()));

        String date = String.valueOf(new Date());
        ent.setLatest_Data_Change_Date_and_Time(date);

        ent.setLatest_Data_Changer(ent.getLatest_Data_Changer());

    }

}
