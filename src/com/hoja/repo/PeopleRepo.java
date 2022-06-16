package com.hoja.repo;
import com.hoja.ents.PeopleEnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PeopleRepo implements AutoCloseable {
private Connection connection;
private PreparedStatement preparedStatement;

   public PeopleRepo() throws Exception {
       //Class.forName("com.mysql.jdbc.Driver");
     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/statistics",
             "hoja","hj123");
     connection.setAutoCommit(false);
   }
   public void insert (PeopleEnt ent)throws Exception {
       preparedStatement = connection.prepareStatement(
               "INSERT INTO people(ID_Code,Name,CareTaker_Name,Gender,age,Address,spouse,Ch1,Ch2,Ch3,Ch4,Ch5,Ch6,Ch7,Ch8,Income_1397,Income_1398,Income_1399,Income_1400,Income_1401,Employment_Status_1397,Employment_Status_1398,Employment_Status_1399,Employment_Status_1400,Employment_Status_1401,latest_Data_Changer,latest_Data_Change_Date_and_Time) " +
                       "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
       preparedStatement.setInt(1, ent.getID_Code());
       preparedStatement.setString(2,ent.getName());
       preparedStatement.setString(3, ent.getCareTaker_Name());
       preparedStatement.setString(4, String.valueOf(ent.getGender()));
       preparedStatement.setInt(5,ent.getAge());
       preparedStatement.setString(6, ent.getAddress());
       preparedStatement.setString(7, ent.getSpouse());
       preparedStatement.setString(8,ent.getCh1());
       preparedStatement.setString(9,ent.getCh2());
       preparedStatement.setString(10,ent.getCh3());
       preparedStatement.setString(11,ent.getCh4());
       preparedStatement.setString(12,ent.getCh5());
       preparedStatement.setString(13,ent.getCh6());
       preparedStatement.setString(14,ent.getCh7());
       preparedStatement.setString(15,ent.getCh8());
       preparedStatement.setLong(16, ent.getIncome_1397());
       preparedStatement.setLong(17, ent.getIncome_1398());
       preparedStatement.setLong(18, ent.getIncome_1399());
       preparedStatement.setLong(19, ent.getIncome_1400());
       preparedStatement.setLong(20, ent.getIncome_1401());
       preparedStatement.setString(21, String.valueOf(ent.getEmployment_Status_1397()));
       preparedStatement.setString(22, String.valueOf(ent.getEmployment_Status_1398()));
       preparedStatement.setString(23, String.valueOf(ent.getEmployment_Status_1399()));
       preparedStatement.setString(24, String.valueOf(ent.getEmployment_Status_1400()));
       preparedStatement.setString(25, String.valueOf(ent.getEmployment_Status_1401()));
       preparedStatement.setString(26,ent.getLatest_Data_Changer());
       preparedStatement.setString(27,ent.getLatest_Data_Change_Date_and_Time());
       preparedStatement.executeUpdate();
   }
  public void update (PeopleEnt ent) throws Exception{
      preparedStatement = connection.prepareStatement(
              "UPDATE people SET Name=? ,CareTaker_Name=?,Gender=?,age=?,Address=?,spouse=?,Ch1=?,Ch2=?,Ch3=?,Ch4=?,Ch5=?,Ch6=?,Ch7=?,Ch8=?,Income_1397=?,Income_1398=?,Income_1399=?,Income_1400=?,Income_1401=?,Employment_Status_1397=?,Employment_Status_1398=?,Employment_Status_1399=?,Employment_Status_1400=?,Employment_Status_1401=?,latest_Data_Changer=?,latest_Data_Change_Date_and_Time=? WHERE ID_Code=?");
      preparedStatement.setString(1,ent.getName());
      preparedStatement.setString(2, ent.getCareTaker_Name());
      preparedStatement.setString(3, String.valueOf(ent.getGender()));
      preparedStatement.setInt(4,ent.getAge());
      preparedStatement.setString(5, ent.getAddress());
      preparedStatement.setString(6, ent.getSpouse());
      preparedStatement.setString(7,ent.getCh1());
      preparedStatement.setString(8,ent.getCh2());
      preparedStatement.setString(9,ent.getCh3());
      preparedStatement.setString(10,ent.getCh4());
      preparedStatement.setString(11,ent.getCh5());
      preparedStatement.setString(12,ent.getCh6());
      preparedStatement.setString(13,ent.getCh7());
      preparedStatement.setString(14,ent.getCh8());
      preparedStatement.setLong(15, ent.getIncome_1397());
      preparedStatement.setLong(16, ent.getIncome_1398());
      preparedStatement.setLong(17, ent.getIncome_1399());
      preparedStatement.setLong(18, ent.getIncome_1400());
      preparedStatement.setLong(19, ent.getIncome_1401());
      preparedStatement.setString(20, String.valueOf(ent.getEmployment_Status_1397()));
      preparedStatement.setString(21, String.valueOf(ent.getEmployment_Status_1398()));
      preparedStatement.setString(22, String.valueOf(ent.getEmployment_Status_1399()));
      preparedStatement.setString(23, String.valueOf(ent.getEmployment_Status_1400()));
      preparedStatement.setString(24, String.valueOf(ent.getEmployment_Status_1401()));
      preparedStatement.setString(25,ent.getLatest_Data_Changer());
      preparedStatement.setString(26,ent.getLatest_Data_Change_Date_and_Time());
      preparedStatement.setInt(27, ent.getID_Code());
      preparedStatement.executeUpdate();
  }
  public void delete (PeopleEnt ent) throws Exception {
      preparedStatement = connection.prepareStatement(
              "DELETE FROM PEOPLE WHERE ID_Code=?");
      preparedStatement.setLong(1,ent.getID_Code());
      preparedStatement.executeUpdate();
  }
  public List<PeopleEnt> select(PeopleEnt ent) throws Exception{
      preparedStatement = connection.prepareStatement(
              "SELECT * FROM people where ID_Code=? ");
      preparedStatement.setInt(1,ent.getID_Code());
      ResultSet resultSet = preparedStatement.executeQuery();
      List<PeopleEnt> entList = new ArrayList<>();
      while (resultSet.next()){
          ent.setID_Code(resultSet.getString("ID_Code"));
          ent.setName(resultSet.getString("NAME"));
          ent.setCareTaker_Name(resultSet.getString("CareTaker_Name"));
          ent.setGender(resultSet.getString("Gender").charAt(0));
          ent.setAge(resultSet.getInt("age"));
          ent.setAddress(resultSet.getString("Address"));
          ent.setSpouse(resultSet.getString("Spouse"));
          ent.setCh1(resultSet.getString("Ch1"));
          ent.setCh2(resultSet.getString("Ch2"));
          ent.setCh3(resultSet.getString("Ch3"));
          ent.setCh4(resultSet.getString("Ch4"));
          ent.setCh5(resultSet.getString("Ch5"));
          ent.setCh6(resultSet.getString("Ch6"));
          ent.setCh7(resultSet.getString("Ch7"));
          ent.setCh8(resultSet.getString("Ch8"));
          ent.setIncome_1397(resultSet.getLong("Income_1397"));
          ent.setIncome_1398(resultSet.getLong("Income_1398"));
          ent.setIncome_1399(resultSet.getLong("Income_1399"));
          ent.setIncome_1400(resultSet.getLong("Income_1400"));
          ent.setIncome_1401(resultSet.getLong("Income_1401"));
          entList.add(ent);
      }
      return entList;
  }
    public List<PeopleEnt> selectName(PeopleEnt ent) throws Exception{
        preparedStatement = connection.prepareStatement(
                "SELECT * FROM people where  Name=?");
        preparedStatement.setString(1,ent.getName());
        ResultSet resultSet = preparedStatement.executeQuery();
        List<PeopleEnt> entList = new ArrayList<>();
        while (resultSet.next()){
            ent.setID_Code(resultSet.getString("ID_Code"));
            ent.setName(resultSet.getString("NAME"));
            ent.setCareTaker_Name(resultSet.getString("CareTaker_Name"));
            ent.setGender(resultSet.getString("Gender").charAt(0));
            ent.setAge(resultSet.getInt("age"));
            ent.setAddress(resultSet.getString("Address"));
            ent.setSpouse(resultSet.getString("Spouse"));
            ent.setCh1(resultSet.getString("Ch1"));
            ent.setCh2(resultSet.getString("Ch2"));
            ent.setCh3(resultSet.getString("Ch3"));
            ent.setCh4(resultSet.getString("Ch4"));
            ent.setCh5(resultSet.getString("Ch5"));
            ent.setCh6(resultSet.getString("Ch6"));
            ent.setCh7(resultSet.getString("Ch7"));
            ent.setCh8(resultSet.getString("Ch8"));
            ent.setIncome_1397(resultSet.getLong("Income_1397"));
            ent.setIncome_1398(resultSet.getLong("Income_1398"));
            ent.setIncome_1399(resultSet.getLong("Income_1399"));
            ent.setIncome_1400(resultSet.getLong("Income_1400"));
            ent.setIncome_1401(resultSet.getLong("Income_1401"));
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