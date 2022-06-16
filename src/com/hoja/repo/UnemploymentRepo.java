package com.hoja.repo;

import com.hoja.ents.UnemploymentEnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UnemploymentRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UnemploymentRepo() throws Exception {
        //Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/statistics",
                "hoja","hj123");
        connection.setAutoCommit(false);
    }
    public void insert(UnemploymentEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "insert into unemployment(Year,Amount_Unemployed,Amount_Employed,Unemployment_Percentage,latest_Data_Changer,latest_Data_Change_Date_and_Time)" +
                        "values (?,?,?,?,?,?)");
        preparedStatement.setInt(1,ent.getYear());
        preparedStatement.setInt(2,ent.getAmountOfUnemployment());
        preparedStatement.setInt(3,ent.getAmountOfEmployment());
        preparedStatement.setDouble(4,ent.getUnemploymentPercentage());
        preparedStatement.setString(5,ent.getLatest_Date_Changer());
        preparedStatement.setString(6,ent.getLatest_Date_Change_Date_and_Time());
        preparedStatement.executeUpdate();
    }
    public void update(UnemploymentEnt ent) throws Exception {
        preparedStatement = connection.prepareStatement(
                "update unemployment set Amount_Unemployed=?,Amount_Employed=?,Unemployment_Percentage=?,latest_Data_Changer=?,latest_Data_Change_Date_and_Time=? where Year=? ");
        preparedStatement.setInt(1,ent.getAmountOfUnemployment());
        preparedStatement.setInt(2,ent.getAmountOfEmployment());
        preparedStatement.setDouble(3,ent.getUnemploymentPercentage());
        preparedStatement.setString(4,ent.getLatest_Date_Changer());
        preparedStatement.setString(5,ent.getLatest_Date_Change_Date_and_Time());
        preparedStatement.setInt(6,ent.getYear());
        preparedStatement.executeUpdate();
    }
    public void delete(UnemploymentEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "delete from unemployment where Year=?");
        preparedStatement.setInt(1,ent.getYear());
        preparedStatement.executeUpdate();
    }
    public List<UnemploymentEnt> select(UnemploymentEnt ent) throws Exception {
        preparedStatement = connection.prepareStatement(
                "select * from unemployment where Year=?");
        preparedStatement.setInt(1,ent.getYear());
        ResultSet resultSet = preparedStatement.executeQuery();
        List<UnemploymentEnt> entList = new ArrayList<>();
        while (resultSet.next()){
            ent.setYear(resultSet.getInt("Year"));
            ent.setAmountOfUnemployment(resultSet.getInt("Amount_Unemployed"));
            ent.setAmountOfEmployment(resultSet.getInt("Amount_Employed"));
            ent.setUnemploymentPercentage(resultSet.getDouble("Unemployment_Percentage"));
            ent.setLatest_Date_Changer(resultSet.getString("latest_Data_Changer"));
            ent.setLatest_Date_Change_Date_and_Time(resultSet.getString("latest_Data_Change_Date_and_Time"));
            entList.add(ent);
        }
        return  entList;
    }


    public void commit () throws Exception {
        connection.commit();
    }
    public void  rollback() throws Exception{
        connection.rollback();
    }
    public void close () throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
