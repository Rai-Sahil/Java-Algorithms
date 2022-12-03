package JDBC;

import com.mongodb.reactivestreams.client.MongoClient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MongoDB {

    public static void main(String[] args){

        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-video", "root", "Tkdcrc987");

            String connectionString = "jdbc:mysql://localhost:3306/jdbc-video?user=root&password=Tkdcrc987&useUnicode=true&characterEncoding=UTF-8";
            Connection connection = DriverManager.getConnection("jdbc:mysql:://localhost:3306/jdbc-video", "root", "Tkdcrc987");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from people;");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
