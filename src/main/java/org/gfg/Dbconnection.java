package org.gfg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl_64","root","");
                                                        // jdbc:subprotocol:subname

        con.createStatement().execute("create table jbdl_64_table1 (name varchar(40) , id int)");
        con.close();
    }
}
