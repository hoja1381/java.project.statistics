package com.hoja.repo;

import com.hoja.ents.AgentEnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AgentRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public AgentRepo() throws Exception {
        //Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/statistics",
                "hoja","hj123");
        connection.setAutoCommit(false);
    }

    public void insert (AgentEnt ent)throws Exception{
        preparedStatement = connection.prepareStatement(
                "insert into agent(Login_ID,Password) values (?,?)");
        preparedStatement.setString(1,ent.getLogin_ID());
        preparedStatement.setString(2,ent.getPassword());
        preparedStatement.executeUpdate();
    }
    public void updatePass(AgentEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "update agent set Password= ? where Login_ID=?");
        preparedStatement.setString(1,ent.getPassword());
        preparedStatement.setString(2, ent.getLogin_ID());
        preparedStatement.executeUpdate();
    }
    public void updateChanges (AgentEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "update agent set Latest_Change_Table=?,latest_Data_Change_Date_and_Time=? where Login_ID=?");
        preparedStatement.setString(1,ent.getLatest_Change_Table());
        preparedStatement.setString(2, ent.getLatest_Data_Change_Date_and_Time());
        preparedStatement.setString(3,ent.getLogin_ID());
        preparedStatement.executeUpdate();
    }
    public void delete (AgentEnt ent) throws Exception {
        preparedStatement = connection.prepareStatement(
                "delete from agent where Login_ID=?");
        preparedStatement.setString(1,ent.getLogin_ID());
        preparedStatement.executeUpdate();
    }
     public List<AgentEnt> select (AgentEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "select * from agent where Login_ID = ?");
        preparedStatement.setString(1,ent.getLogin_ID());
        ResultSet resultSet = preparedStatement.executeQuery();
        List<AgentEnt> entList = new ArrayList<>();
        while (resultSet.next()){
            ent.setLogin_ID(resultSet.getString("Login_ID"));
            ent.setPassword(resultSet.getString("Password"));
            ent.setLatest_Change_Table(resultSet.getString("Latest_Change_Table"));
            ent.setLatest_Data_Change_Date_and_Time(resultSet.getString("Latest_Data_Change_Date_and_Time"));
            entList.add(ent);
        }
        return entList;
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

