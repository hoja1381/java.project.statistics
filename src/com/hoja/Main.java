package com.hoja;

import com.hoja.cont.*;
import com.hoja.ents.*;
import com.hoja.services.*;
import com.hoja.view.*;

import java.awt.*;

public class Main
    {
        public static void main(String[] args)  {
          AgentServ serv = new AgentServ();
          AgentEnt ent = new AgentEnt();
          LogIn logIn = new LogIn();
          logIn.setLocation(670,350);

          LogInCont cont = new LogInCont(serv,ent,logIn);
          logIn.setVisible(true);
        }
    }


