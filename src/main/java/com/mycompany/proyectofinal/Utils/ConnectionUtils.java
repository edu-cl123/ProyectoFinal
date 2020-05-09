/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinal.Utils;

import com.mycompany.proyectofinal.model.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtils {

    public static java.sql.Connection connect(Connection c) throws ClassNotFoundException, SQLException {
        java.sql.Connection con = null;

        if (c == null) {
            return null;
        }
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://" + c.getHost() + "/" + c.getDb() + "?useLegacyDatetimeCode=false&serverTimezone=UTC", c.getUser(), c.getPassword());

        return con;
    }

}
