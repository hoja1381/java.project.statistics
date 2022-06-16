package com.hoja.ents;

public class AgentEnt {
   private String Login_ID;
   private String Password;
   private String Latest_Change_Table;
   private String latest_Data_Change_Date_and_Time;

    public String getLogin_ID() {
        return Login_ID;
    }

    public AgentEnt setLogin_ID(String login_ID) {
        Login_ID = login_ID;
        return this;
    }

    public String getPassword() {
        return Password;
    }

    public AgentEnt setPassword(String password) {
        Password = password;
        return this;
    }

    public String getLatest_Change_Table() {
        return Latest_Change_Table;
    }

    public AgentEnt setLatest_Change_Table(String latest_Change_Table) {
        Latest_Change_Table = latest_Change_Table;
        return this;
    }

    public String getLatest_Data_Change_Date_and_Time() {
        return latest_Data_Change_Date_and_Time;
    }

    public AgentEnt setLatest_Data_Change_Date_and_Time(String latest_Data_Change_Date_and_Time) {
        this.latest_Data_Change_Date_and_Time = latest_Data_Change_Date_and_Time;
        return this;
    }
}
