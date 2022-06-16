package com.hoja.ents;

public class UnemploymentEnt {
    private int year;
    private int amountOfUnemployment;
    private int amountOfEmployment;
    private double unemploymentPercentage;
    private String latest_Date_Changer;
    private String Latest_Date_Change_Date_and_Time;
    private String logInUser;
    public String getLogInUser() {
        return logInUser;
    }
    public UnemploymentEnt setLogInUser(String logInUser) {
        this.logInUser = logInUser;
        return this;
    }

    public int getYear() {
        return year;
    }

    public UnemploymentEnt setYear(int year) {
        this.year = year;
        return this;
    }

    public int getAmountOfUnemployment() {
        return amountOfUnemployment;
    }

    public UnemploymentEnt setAmountOfUnemployment(int amountOfUnemployment) {
        this.amountOfUnemployment = amountOfUnemployment;
        return this;
    }

    public int getAmountOfEmployment() {
        return amountOfEmployment;
    }

    public UnemploymentEnt setAmountOfEmployment(int amountOfEmployment) {
        this.amountOfEmployment = amountOfEmployment;
        return this;
    }

    public double getUnemploymentPercentage() {
        return unemploymentPercentage;
    }

    public UnemploymentEnt setUnemploymentPercentage(double unemploymentPercentage) {
        this.unemploymentPercentage = unemploymentPercentage;
        return this;
    }

    public String getLatest_Date_Changer() {
        return latest_Date_Changer;
    }

    public UnemploymentEnt setLatest_Date_Changer(String latest_Date_Changer) {
        this.latest_Date_Changer = latest_Date_Changer;
        return this;
    }

    public String getLatest_Date_Change_Date_and_Time() {
        return Latest_Date_Change_Date_and_Time;
    }

    public UnemploymentEnt setLatest_Date_Change_Date_and_Time(String latest_Date_Change_Date_and_Time) {
        this.Latest_Date_Change_Date_and_Time = latest_Date_Change_Date_and_Time;
        return this;
    }
}
