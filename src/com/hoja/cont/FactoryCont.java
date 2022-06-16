package com.hoja.cont;

import com.hoja.ents.FactoryEnt;
import com.hoja.services.FactoryServ;
import com.hoja.view.FactoryGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class FactoryCont {
    private FactoryServ serv;
    private FactoryEnt ent;
    private FactoryGUI gui;

    public FactoryCont(FactoryServ serv, FactoryEnt ent, FactoryGUI gui)  {
        this.ent=ent;
        this.gui = gui;
        this.serv = serv;

        this.gui.submitlistener(new addsubmitlistener());
        this.gui.searchListener(new addsearchlistener());
        this.gui.editListener(new addeditlistener());
    }
    class addsubmitlistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           ENTsetter();


            try {

                serv.save(ent);
                FactoryEnt report = serv.report(ent);
                gui.setNET1397(String.valueOf(report.getNet_1397()));
                gui.setNET1398(String.valueOf(report.getNet_1398()));
                gui.setNET1399(String.valueOf(report.getNet_1399()));
                gui.setNET1400(String.valueOf(report.getNet_1400()));
                gui.setNET1401(String.valueOf(report.getNet_1401()));

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
              FactoryEnt report = serv.report(ent
                      .setSubmission_code(Long.parseLong(gui.getSubmission_code())));
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
                gui.errorMassage("تغییرات با موفقیت ثبت شد");

            } catch (Exception ex) {
                ex.printStackTrace();
                gui.errorMassage("تغییر اطلاعات ممکن نیست");
            }
        }


    }
    private void ENTsetter() {
        ent.setSubmission_code(Long.parseLong(gui.getSubmission_code()));
        ent.setAddress(gui.getAddress());
        ent.setName(gui.getFactory_Name());

        ent.setNo_Employers_1397(Integer.parseInt(gui.getNo_Employees1397()));
        ent.setNo_Employers_1398(Integer.parseInt(gui.getNo_Employees1398()));
        ent.setNo_Employers_1399(Integer.parseInt(gui.getNo_Employees1399()));
        ent.setNo_Employers_1400(Integer.parseInt(gui.getNo_Employees1400()));
        ent.setNo_Employers_1401(Integer.parseInt(gui.getNo_Employees1401()));

        ent.setIncome_1397(Long.parseLong(gui.getIncome1397()));
        ent.setIncome_1398(Long.parseLong(gui.getIncome1398()));
        ent.setIncome_1399(Long.parseLong(gui.getIncome1399()));
        ent.setIncome_1400(Long.parseLong(gui.getIncome1400()));
        ent.setIncome_1401(Long.parseLong(gui.getIncome1401()));

        ent.setExpenses_1397(Long.parseLong(gui.getExpense1397()));
        ent.setExpenses_1398(Long.parseLong(gui.getExpense1398()));
        ent.setExpenses_1399(Long.parseLong(gui.getExpense1399()));
        ent.setExpenses_1400(Long.parseLong(gui.getExpense1400()));
        ent.setExpenses_1401(Long.parseLong(gui.getExpense1401()));

        String date = String.valueOf(new Date());
        ent.setLatest_Data_Change_Date_and_Time(date);

    }
}
