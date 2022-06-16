package com.hoja.repo;

import com.hoja.ents.InflationEnt;
import com.hoja.ents.PeopleEnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InflationRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public InflationRepo() throws Exception {
        //Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/statistics",
                "hoja","hj123");
        connection.setAutoCommit(false);
    }

    public void insert (InflationEnt ent)throws Exception{
        preparedStatement= connection.prepareStatement(
                "insert into inflation(Company_Name,Product_Name," +
                        "1397_price,1398_price,1399_price,1400_price,1401_price," +
                        "97_98_Rate,98_99_Rate,99_1400_Rate,1400_1401_Rate,avg_Rate," +
                        "latest_Data_Changer,latest_Data_Change_Date_and_Time)" +
                        "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,ent.getCompany_Name());
        preparedStatement.setString(2,ent.getProduct_Name());
        preparedStatement.setInt(3,ent.getPrice_1397());
        preparedStatement.setInt(4,ent.getPrice_1398());
        preparedStatement.setInt(5,ent.getPrice_1399());
        preparedStatement.setInt(6,ent.getPrice_1400());
        preparedStatement.setInt(7,ent.getPrice_1401());
        preparedStatement.setDouble(8,ent.getRate_97_98());
        preparedStatement.setDouble(9,ent.getRate_98_99());
        preparedStatement.setDouble(10,ent.getRate_99_1400());
        preparedStatement.setDouble(11,ent.getRate_1400_1401());
        preparedStatement.setDouble(12,ent.getAvg_Rate());
        preparedStatement.setString(13,ent.getLatest_Data_Changer());
        preparedStatement.setString(14,ent.getLatest_Data_Change_Date_and_Time());
        preparedStatement.executeUpdate();
    }
    public void update (InflationEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "update inflation set Company_Name=?, " +
                        "1397_price=?,1398_price=?,1399_price=?,1400_price=?,1401_price=?," +
                        "97_98_Rate=?,98_99_Rate=?,99_1400_Rate=?,1400_1401_Rate=?,avg_Rate=?," +
                        "latest_Data_Changer=?,latest_Data_Change_Date_and_Time=? where Product_Name=?" );
        preparedStatement.setString(1,ent.getCompany_Name());
        preparedStatement.setInt(2,ent.getPrice_1397());
        preparedStatement.setInt(3,ent.getPrice_1398());
        preparedStatement.setInt(4,ent.getPrice_1399());
        preparedStatement.setInt(5,ent.getPrice_1400());
        preparedStatement.setInt(6,ent.getPrice_1401());
        preparedStatement.setDouble(7,ent.getRate_97_98());
        preparedStatement.setDouble(8,ent.getRate_98_99());
        preparedStatement.setDouble(9,ent.getRate_99_1400());
        preparedStatement.setDouble(10,ent.getRate_1400_1401());
        preparedStatement.setDouble(11,ent.getAvg_Rate());
        preparedStatement.setString(12,ent.getLatest_Data_Changer());
        preparedStatement.setString(13,ent.getLatest_Data_Change_Date_and_Time());
        preparedStatement.setString(14,ent.getProduct_Name());
        preparedStatement.executeUpdate();
    }
    public void delete (InflationEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "delete from inflation where Product_Name=?");
        preparedStatement.setString(1,ent.getProduct_Name());
        preparedStatement.executeUpdate();
    }
    public List<InflationEnt> select(InflationEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "select * from inflation where Product_Name=?");
        preparedStatement.setString(1,ent.getProduct_Name());
        ResultSet resultSet = preparedStatement.executeQuery();
        List<InflationEnt> entList = new ArrayList<>();
        while (resultSet.next()){
            ent.setCompany_Name(resultSet.getString("Company_Name"));
            ent.setProduct_Name(resultSet.getString("Product_Name"));
            ent.setPrice_1397(resultSet.getInt("1397_price"));
            ent.setPrice_1398(resultSet.getInt("1398_price"));
            ent.setPrice_1399(resultSet.getInt("1399_price"));
            ent.setPrice_1400(resultSet.getInt("1400_price"));
            ent.setPrice_1401(resultSet.getInt("1401_price"));
            ent.setRate_97_98(resultSet.getDouble("97_98_Rate"));
            ent.setRate_98_99(resultSet.getDouble("98_99_Rate"));
            ent.setRate_99_1400(resultSet.getDouble("99_1400_Rate"));
            ent.setRate_1400_1401(resultSet.getDouble("1400_1401_Rate"));
            ent.setAvg_Rate(resultSet.getDouble("avg_Rate"));
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
