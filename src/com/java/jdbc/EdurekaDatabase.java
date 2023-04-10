package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EdurekaDatabase {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Registering the Oracle Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //Connecting to Edureka Database
        Connection con =
                DriverManager.getConnection("jdbc:oracle:thin:@//va33dx14-scan1.wellpoint.com:1525/topod",
                        "topology", "Devtopo#1");

        con.setAutoCommit(false);
        Statement st = con.createStatement();
        System.out.println(">>>>>>>>>>>Connected to the TOPOD Database!!!");
        try {
            String sql = "create table emp_test(empno number, ename varchar2(25), sal number(10,2)," +
                    "CONSTRAINT emp_test_pk PRIMARY KEY(empno))";
            st.execute(sql);
            con.commit();
            System.out.println(">>>>>>>>>>>>>DB Table created");
        } catch(Exception e) {
            System.out.println(">>>>>>>>>>>>>DB Table did not get created");
            System.out.println(e.getMessage());
        } finally {
            st.close();
            con.close();
        }
    }
}
