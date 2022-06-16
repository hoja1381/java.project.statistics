package com.hoja.services;

import com.hoja.ents.UnemploymentEnt;
import com.hoja.repo.UnemploymentRepo;

public class UnemploymentServ {
    private static UnemploymentServ UnemploymentServ = new UnemploymentServ();

    public static UnemploymentServ getInstance() {
        return UnemploymentServ;
    }

    public void save(UnemploymentEnt ent) throws Exception {
        try (UnemploymentRepo repo = new UnemploymentRepo()) {
            long un = ent.getAmountOfUnemployment();
            long em = ent.getAmountOfEmployment();
            ent.setUnemploymentPercentage((un * 100)
                    / (un + em));
            repo.insert(ent);
            repo.commit();
        }
    }
    public  void update(UnemploymentEnt ent) throws Exception {
        try(UnemploymentRepo repo = new UnemploymentRepo()) {
            long un = ent.getAmountOfUnemployment();
            long em = ent.getAmountOfEmployment();
            ent.setUnemploymentPercentage((un * 100)
                    / (un + em));
            repo.update(ent);
            repo.commit();
        }
    }
    public void delete(UnemploymentEnt ent ) throws Exception {
        try(UnemploymentRepo repo = new UnemploymentRepo()) {
            repo.delete(ent);
            repo.commit();
        }
    }
    public UnemploymentEnt report(UnemploymentEnt ent) throws Exception {
        try (UnemploymentRepo repo = new UnemploymentRepo()){
            UnemploymentEnt resultEnt = repo.select(ent).get(0);
            return resultEnt;
        }
    }

}
