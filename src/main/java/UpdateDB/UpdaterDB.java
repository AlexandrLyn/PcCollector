package UpdateDB;

import java.io.IOException;
import java.sql.*;
import java.sql.Connection;

public class UpdaterDB extends Thread {
    private final String URL = "jdbc:mysql://localhost:3306/partspc?useSSL=false";
    private final String LOGIN = "root";
    private final String PASSWORD = "root";
    private String componentId;
    private String UPDATE;
    private String[] newPriceUrl;
    private String column;
    UpdatePrices updatePrices = new UpdatePrices();

    public UpdaterDB(String componentId, String[] newPriceUrl, String column) {
        this.componentId = componentId;
        this.newPriceUrl = newPriceUrl;
        this.column = column;
    }

    public void run(){
        UPDATE = "UPDATE " + column + " SET price = ? WHERE "+componentId+ " = ?";
        registerDriver();
        Connection connection = null;
        PreparedStatement statement = null;
        StorageUrl storageUrl = new StorageUrlGame();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.prepareStatement(UPDATE);
            for (int i = 0; i < newPriceUrl.length; i++) {
                statement.setInt(1, updatePrices.issuingAPrice(newPriceUrl[i]));
                statement.setInt(2,i +1);
                statement.execute();
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }  finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
    private void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

