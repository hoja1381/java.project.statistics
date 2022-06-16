package com.hoja.services;

import com.hoja.ents.InflationEnt;
import com.hoja.repo.InflationRepo;


public class InflationServ {
    private static InflationServ InflationServ = new InflationServ();
    public static InflationServ getInstance(){
        return InflationServ;
    }

    public void save (InflationEnt ent) throws Exception{
        try (InflationRepo repo = new InflationRepo()){
            rateCalc(ent);

            repo.insert(ent);
            repo.commit();
        }
    }
    public void edit (InflationEnt ent) throws Exception{
        try (InflationRepo repo = new InflationRepo()){
            rateCalc(ent);

            repo.update(ent);
            repo.commit();
        }
    }
    public void delete (InflationEnt ent) throws Exception {
        try (InflationRepo repo = new InflationRepo()){
            repo.delete(ent);
            repo.commit();
        }
    }
    public InflationEnt report (InflationEnt ent) throws  Exception {
        try (InflationRepo repo = new InflationRepo()){
            InflationEnt resultEnt = repo.select(ent).get(0);
            return resultEnt;
        }
    }

    private void rateCalc(InflationEnt ent) {
        ent.setRate_97_98((double) (ent.getPrice_1398() - ent.getPrice_1397()) / ent.getPrice_1397());
        ent.setRate_98_99((double)(ent.getPrice_1399() - ent.getPrice_1398()) / ent.getPrice_1398());
        ent.setRate_99_1400((double)(ent.getPrice_1400() - ent.getPrice_1399()) / ent.getPrice_1399());
        ent.setRate_1400_1401((double)(ent.getPrice_1401() - ent.getPrice_1400()) / ent.getPrice_1400());
        ent.setAvg_Rate((double)(ent.getPrice_1401() - ent.getPrice_1397()) / ent.getPrice_1397());
    }
}
