package com.hoja.services;

import com.hoja.ents.FactoryEnt;
import com.hoja.repo.FactoryRepo;

public class FactoryServ {
    private static FactoryServ FactoryServ = new FactoryServ();
    public static FactoryServ getInstance(){
        return FactoryServ;
    }

    public void save(FactoryEnt ent) throws Exception {
        try (FactoryRepo repo = new FactoryRepo()){
            netCalculator(ent);
            repo.insert(ent);
            repo.commit();
        }
    }
    public void edit (FactoryEnt ent) throws Exception {
        try (FactoryRepo repo = new FactoryRepo()){
            netCalculator(ent);
            repo.update(ent);
            repo.commit();
        }
    }
    public void delete (FactoryEnt ent) throws Exception {
        try (FactoryRepo repo = new FactoryRepo()){
            repo.delete(ent);
            repo.commit();
        }
    }
    public FactoryEnt report (FactoryEnt ent) throws Exception {
        try (FactoryRepo repo = new FactoryRepo()){
            FactoryEnt resultEnt = repo.select(ent).get(0);
            return resultEnt;
        }
    }

    private void netCalculator(FactoryEnt ent) {
        ent.setNet_1397(ent.getIncome_1397() - ent.getExpenses_1397());
        ent.setNet_1398(ent.getIncome_1398() - ent.getExpenses_1398());
        ent.setNet_1399(ent.getIncome_1399() - ent.getExpenses_1399());
        ent.setNet_1400(ent.getIncome_1400() - ent.getExpenses_1400());
        ent.setNet_1401(ent.getIncome_1401() - ent.getExpenses_1401());
    }
}
