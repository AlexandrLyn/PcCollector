package ChoiceComponents;

import UpdateDB.StorageUrlGame;
import UpdateDB.UpdatePrices;

import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinPriceComponent {
    private final String URL = "jdbc:mysql://localhost:3306/partspc?useSSL=false";
    private final String LOGIN = "root";
    private final String PASSWORD = "root";

    public int minPrice(String table, String objectChoice, String model){
        registerDriver();
        Connection connection = null;
        Statement statement = null;
        int min = -1;

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT price FROM " + table + " WHERE " + objectChoice + " =  " + model);
            List<Price> list = new ArrayList<>();
            while (resultSet.next()){
                int priceComonent = resultSet.getInt(1);
                Price price = new Price(priceComonent);
                list.add(price);
            }
            int[] price = new int[list.size()];
            for ( int i = 0; i < list.size(); i++) {
                price[i] = list.get(i).getPriceComponent();
            }
            Arrays.sort(price);
            for ( int i = 0; i < price.length; i++ ) {
                if ( price[i] > 0) {
                    min = price[i];
                    break;
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return min;
    }
    public int minPriceInt(String table, String objectChoice, int model){
        registerDriver();
        Connection connection = null;
        Statement statement = null;
        int min = -1;

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT price FROM " + table + " WHERE " + objectChoice + " =  " + model);
            List<Price> list = new ArrayList<>();
            while (resultSet.next()){
                int priceComonent = resultSet.getInt(1);
                Price price = new Price(priceComonent);
                list.add(price);
            }
            int[] price = new int[list.size()];
            for ( int i = 0; i < list.size(); i++) {
                price[i] = list.get(i).getPriceComponent();
            }
            Arrays.sort(price);
            for ( int i = 0; i < price.length; i++ ) {
                if ( price[i] > 0) {
                    min = price[i];
                    break;
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return min;
    }
    private static void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}