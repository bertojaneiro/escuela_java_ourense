/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/** static final de los elementos necesarios para hacer la conexion (url, usuario, contraseña)
 *
 * @author alberto
 */
public class ConexionMySqlDB {

    //private static final String URL = "jdbc:derby://localhost:1527/06_ModeloUsuariosBBDD";
    private static final String URL = "jdbc:mysql://localhost:3306/db_usuarios";
    private static final String USER = "root";
    private static final String PASS = "abc123.";
    private static boolean driversCargados = false;
    
//    public Connection ConexionDerby(){
//        
//    }
    
    public static Connection getConexion() throws ClassNotFoundException, SQLException, Exception{
        Connection con =null;

        if (!driversCargados) {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //crearDBusuarios();
        driversCargados = true;
        }
        con = DriverManager.getConnection(URL, USER, PASS);

        
        return con;
    }
    private static void crearDBusuarios() throws SQLException, Exception {
    	Connection conex = DriverManager.getConnection(URL, USER, PASS);
    	Statement stmt = conex.createStatement();
    	String createTableSQL = "CREATE TABLE usuario (\r\n" + 
    			"	id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY \r\n" + 
    			"		(START WITH 1, INCREMENT BY 1),\r\n" + 
    			"	email VARCHAR(255) NOT NULL,\r\n" + 
    			"	password VARCHAR(50) NOT NULL,\r\n" + 
    			"	nombre VARCHAR(50) NOT NULL,\r\n" + 
    			"	age INTEGER NOT NULL,\r\n" + 
    			"	CONSTRAINT primary_key PRIMARY KEY(id),\r\n" + 
    			"	CONSTRAINT unique_email UNIQUE(email)\r\n" + 
    			")";
    	stmt.executeUpdate(createTableSQL);
    	conex.close();
    }
}
