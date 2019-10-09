/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in10s.home;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class SingleDB {
    
    static {
        
    }
    
    public static Connection getConnection(){
        Connection con=null;
        try {
            Class.forName("");
            con=DriverManager.getConnection("","","");
        } catch (Exception e) {
        }
        return con;
    }
    
}
