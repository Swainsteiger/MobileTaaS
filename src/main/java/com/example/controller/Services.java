package com.example.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Services
{
    public void create_data(int user_id,String firstname,String lastname,String email,String password){
        DB_Connection obj_DB_Connection=new DB_Connection();
        Connection connection=obj_DB_Connection.get_connection();
        PreparedStatement ps=null;
        System.out.println(password);
        try {
            String query="insert into User(user_id,firstname,lastname,email,password) values (?,?,?,?,?)";
            ps=connection.prepareStatement(query);
            ps.setInt(1, user_id);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.setString(4, email);
            ps.setString(5, password);
            System.out.println(ps);
            System.out.println (ps.executeUpdate());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        Services obj = new Services();
        //obj.create_data(100,"Animesh","Swain","animesh.swain@sjsu.edu","password123");
    }
}
