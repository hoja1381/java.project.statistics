package com.hoja.services;

import com.hoja.ents.PeopleEnt;
import com.hoja.repo.PeopleRepo;

public class PeopleServ {
    private static PeopleServ peopleServ = new PeopleServ();
    public static PeopleServ getInstance(){
        return peopleServ;
    }


    public void save (PeopleEnt ent) throws Exception {
        try (PeopleRepo repo = new PeopleRepo()){
            repo.insert(ent);
            repo.commit();
        }
    }
    public void edit (PeopleEnt ent)throws Exception {
        try (PeopleRepo repo = new PeopleRepo()){
            repo.update(ent);
            repo.commit();
        }
    }
    public void delete (PeopleEnt ent) throws Exception{
        try(PeopleRepo repo = new PeopleRepo()) {
         repo.delete(ent);
         repo.commit();
        }
    }
    public PeopleEnt report(PeopleEnt ent) throws Exception {
        try (PeopleRepo repo = new PeopleRepo()){
            PeopleEnt resultEnt =repo.select(ent).get(0);
            return resultEnt;
        }
    }
    public PeopleEnt reportName(PeopleEnt ent) throws Exception{
        try (PeopleRepo repo = new PeopleRepo()){
            PeopleEnt resultEnt =repo.selectName(ent).get(0);
            return resultEnt;
        }
    }
}
