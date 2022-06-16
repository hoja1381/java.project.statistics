package com.hoja.services;

import com.hoja.ents.AgentEnt;
import com.hoja.repo.AgentRepo;


public class AgentServ {
    private static AgentServ AgentServ = new AgentServ();
    public static AgentServ getInstance() {
        return AgentServ;
    }

    public AgentEnt report(AgentEnt ent) throws Exception {
        try (AgentRepo repo = new AgentRepo()) {
            AgentEnt resultEnt = repo.select(ent).get(0);
            return resultEnt ;
        }
    }

    public void save(AgentEnt ent) throws Exception{
        try(AgentRepo repo = new AgentRepo()) {
            repo.insert(ent);
        }
    }
}
