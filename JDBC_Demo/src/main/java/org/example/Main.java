package org.example;

// importing package
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
            import package(java.sql.*)
            create connection
            create statement
            execute statement
            process the result
            close
        */

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String userName = "postgres";
        String password = "7070";
        String query = "select * from student";

        try {
            // creating connection
            Connection con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection established!");

            // create statement
            Statement st = con.createStatement();

            // execute statement
            ResultSet rs = st.executeQuery(query);
//            rs.next();
//
//            // process result
//            int marks = rs.getInt("marks");
//            System.out.println("Marks of the student is: " + marks);

            // to fetch all data
            while(rs.next()) {
                System.out.print(rs.getInt(1) + " - ");
                System.out.print(rs.getInt(2) + " - ");
                System.out.println(rs.getInt(3));
            }

            // close connection
            con.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.out.println(e);
        }



    }
}