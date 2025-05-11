package org.example;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/devready";
    private static final String USER = "larisa_user";
    private static final String PASSWORD = "parola";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            stmt = conn.createStatement();

            String sqlSelect = "SELECT id, name, age FROM person";
            String sqlInsert = "INSERT INTO person values (6, 'Sergiu2 Boss', 29, 'sergiu2.bossu@yahoo.com')";
            rs = stmt.executeQuery(sqlSelect);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nume = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Nume: " + nume + "Varsta: " + age);
            }
            int count = stmt.executeUpdate(sqlInsert);
            System.out.println(count + " rows affected");

        } catch (SQLException e) {
            System.out.println("eroareee sql");
            e.printStackTrace();
        } finally {
            try {
                //if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.out.println("eroareee sql");
            }
        }
    }
}
