package com.hoja.cont;

import com.hoja.ents.AgentEnt;
import com.hoja.services.AgentServ;
import com.hoja.view.LogIn;
import com.hoja.view.MenuGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInCont {
    private AgentEnt ent;
    private AgentServ serv;
    private LogIn logIn;

    public LogInCont (AgentServ serv,AgentEnt ent,LogIn logIn){
        this.ent = ent;
        this.serv = serv;
        this.logIn = logIn;

        this.logIn.addLogInListener(new LogInListener());
    }
    class LogInListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String username,pass;
            username = logIn.username();
            pass =String.valueOf(logIn.pass());
            ent.setLogin_ID(username);
            ent.setPassword(pass);
            try {
                if(serv.report(ent).getLogin_ID().equals(username)){
                    if (serv.report(ent).getPassword().equals(pass)){
                        logIn.dispose();
                        MenuGUI menuGUI = new MenuGUI().setLogInUser(ent.getLogin_ID());
                        menuGUI.setUser();
                    }else {
                        logIn.errorMassage("Wrong Username or password");
                    }
                }else {
                    logIn.errorMassage("Wrong Username or password");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                logIn.errorMassage("Wrong Username or password");
            }
        }
    }
}
