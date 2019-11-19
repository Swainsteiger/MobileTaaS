package com.example.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection
{

    public static void main(String[] args)
    {

        DB_Connection ob = new DB_Connection();
        System.out.println(ob.get_connection());
    }
    public Connection get_connection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MobileTaaS","root",null);
            //System.out.println("firstname:"+obj.firstname);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
