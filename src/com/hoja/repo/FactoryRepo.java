package com.hoja.repo;

import com.hoja.ents.FactoryEnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FactoryRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public FactoryRepo() throws Exception {
        //Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/statistics",
                "hoja","hj123");
        connection.setAutoCommit(false);
    }

    public void insert (FactoryEnt ent)throws Exception{
        preparedStatement = connection.prepareStatement(
                "insert into factory(Name,Submission_code," +
                        "No_Employees_1397,No_Employees_1398,No_Employees_1399,No_Employees_1400,No_Employees_1401," +
                        "Expenses_1397,Expenses_1398,Expenses_1399,Expenses_1400,Expenses_1401," +
                        "Income_1397,Income_1398,Income_1399,Income_1400,Income_1401," +
                        "Net_1397,Net_1398,Net_1399,Net_1400,Net_1401," +
                        "address,latest_Data_Changer,latest_Data_Change_Date_and_Time)" +
                        "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setLong(2,ent.getSubmission_code());
        preparedStatement.setString(1,ent.getName());
        preparedStatement.setInt(3,ent.getNo_Employers_1397());
        preparedStatement.setInt(4,ent.getNo_Employers_1398());
        preparedStatement.setInt(5,ent.getNo_Employers_1399());
        preparedStatement.setInt(6,ent.getNo_Employers_1400());
        preparedStatement.setInt(7,ent.getNo_Employers_1401());
        preparedStatement.setLong(8,ent.getExpenses_1397());
        preparedStatement.setLong(9,ent.getExpenses_1398());
        preparedStatement.setLong(10,ent.getExpenses_1399());
        preparedStatement.setLong(11,ent.getExpenses_1400());
        preparedStatement.setLong(12,ent.getExpenses_1401());
        preparedStatement.setLong(13,ent.getIncome_1397());
        preparedStatement.setLong(14,ent.getIncome_1398());
        preparedStatement.setLong(15,ent.getIncome_1399());
        preparedStatement.setLong(16,ent.getIncome_1400());
        preparedStatement.setLong(17,ent.getIncome_1401());
        preparedStatement.setLong(18,ent.getNet_1397());
        preparedStatement.setLong(19,ent.getNet_1398());
        preparedStatement.setLong(20,ent.getNet_1399());
        preparedStatement.setLong(21,ent.getNet_1400());
        preparedStatement.setLong(22,ent.getNet_1401());
        preparedStatement.setString(23,ent.getAddress());
        preparedStatement.setString(24,ent.getLatest_Data_Changer());
        preparedStatement.setString(25,ent.getLatest_Data_Change_Date_and_Time());
        preparedStatement.executeUpdate();
    }
    public void update (FactoryEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "update factory set Name=?," +
                        "No_Employees_1397=?,No_Employees_1398=?,No_Employees_1399=?,No_Employees_1400=?,No_Employees_1401=?," +
                        "Expenses_1397=?,Expenses_1398=?,Expenses_1399=?,Expenses_1400=?,Expenses_1401=?," +
                        "Income_1397=?,Income_1398=?,Income_1399=?,Income_1400=?,Income_1401=?," +
                        "Net_1397=?,Net_1398=?,Net_1399=?,Net_1400=?,Net_1401=?," +
                        "address=?,latest_Data_Changer=?,latest_Data_Change_Date_and_Time=? " +
                        "where Submission_code=?");
        preparedStatement.setString(1,ent.getName());
        preparedStatement.setInt(2,ent.getNo_Employers_1397());
        preparedStatement.setInt(3,ent.getNo_Employers_1398());
        preparedStatement.setInt(4,ent.getNo_Employers_1399());
        preparedStatement.setInt(5,ent.getNo_Employers_1400());
        preparedStatement.setInt(6,ent.getNo_Employers_1401());
        preparedStatement.setLong(7,ent.getExpenses_1397());
        preparedStatement.setLong(8,ent.getExpenses_1398());
        preparedStatement.setLong(9,ent.getExpenses_1399());
        preparedStatement.setLong(10,ent.getExpenses_1400());
        preparedStatement.setLong(11,ent.getExpenses_1401());
        preparedStatement.setLong(12,ent.getIncome_1397());
        preparedStatement.setLong(13,ent.getIncome_1398());
        preparedStatement.setLong(14,ent.getIncome_1399());
        preparedStatement.setLong(15,ent.getIncome_1400());
        preparedStatement.setLong(16,ent.getIncome_1401());
        preparedStatement.setLong(17,ent.getNet_1397());
        preparedStatement.setLong(18,ent.getNet_1398());
        preparedStatement.setLong(19,ent.getNet_1399());
        preparedStatement.setLong(20,ent.getNet_1400());
        preparedStatement.setLong(21,ent.getNet_1401());
        preparedStatement.setString(22,ent.getAddress());
        preparedStatement.setString(23,ent.getLatest_Data_Changer());
        preparedStatement.setString(24,ent.getLatest_Data_Change_Date_and_Time());
        preparedStatement.setLong(25,ent.getSubmission_code());
        preparedStatement.executeUpdate();
    }
    public void delete (FactoryEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "delete from factory where Submission_code=?");
        preparedStatement.setLong(1,ent.getSubmission_code());
        preparedStatement.executeUpdate();
    }
    public List<FactoryEnt> select(FactoryEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "select * from factory where Submission_code=? ");
        preparedStatement.setLong(1,ent.getSubmission_code());
        ResultSet resultSet = preparedStatement.executeQuery();
        List<FactoryEnt> entList = new ArrayList<>();
        while (resultSet.next()){
            ent.setSubmission_code(resultSet.getLong("Submission_code"));
            ent.setName(resultSet.getString("Name"));
            ent.setNo_Employers_1397(resultSet.getInt("No_Employees_1397"));
            ent.setNo_Employers_1398(resultSet.getInt("No_Employees_1398"));
            ent.setNo_Employers_1399(resultSet.getInt("No_Employees_1399"));
            ent.setNo_Employers_1400(resultSet.getInt("No_Employees_1400"));
            ent.setNo_Employers_1401(resultSet.getInt("No_Employees_1401"));
            ent.setExpenses_1397(resultSet.getLong("Expenses_1397"));
            ent.setExpenses_1398(resultSet.getLong("Expenses_1398"));
            ent.setExpenses_1399(resultSet.getLong("Expenses_1399"));
            ent.setExpenses_1400(resultSet.getLong("Expenses_1400"));
            ent.setExpenses_1401(resultSet.getLong("Expenses_1401"));
            ent.setIncome_1397(resultSet.getLong("Income_1397"));
            ent.setIncome_1398(resultSet.getLong("Income_1398"));
            ent.setIncome_1399(resultSet.getLong("Income_1399"));
            ent.setIncome_1400(resultSet.getLong("Income_1400"));
            ent.setIncome_1401(resultSet.getLong("Income_1401"));
            ent.setNet_1397(resultSet.getLong("Net_1397"));
            ent.setNet_1398(resultSet.getLong("Net_1398"));
            ent.setNet_1399(resultSet.getLong("Net_1399"));
            ent.setNet_1400(resultSet.getLong("Net_1400"));
            ent.setNet_1401(resultSet.getLong("Net_1401"));
            ent.setAddress(resultSet.getString("Address"));
            ent.setLatest_Data_Changer(resultSet.getString("latest_Data_Changer"));
            ent.setLatest_Data_Change_Date_and_Time(resultSet.getString("latest_Data_Change_Date_and_Time"));
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
