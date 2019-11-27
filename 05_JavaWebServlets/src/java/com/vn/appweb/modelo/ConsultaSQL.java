/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.modelo;

import com.vn.appweb.servlets.ParamServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo 1
 */
public class ConsultaSQL {
    public ConsultaSQL(){
        try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
                
            } catch (Exception ex) {
                Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("no se ha cargado DerbyDB");
                
            }
    }
    
    public List<DatosPersona> leerTabla(String busca){
        ArrayList<DatosPersona> datos = new ArrayList();
        
        try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_prueba", "root","1234")){
            String sqlQuery = "SELECT nombre, email FROM persona WHERE TRIM(UPPER(nombre)) LIKE ?";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, busca);//sustituir el primer interrogante por el contenido del nombre
            ResultSet resultado = sentenciaSQL.executeQuery();
            while(resultado.next()){
                String nombre = resultado.getString(1); //1 nombre 
                String email = resultado.getString("email"); //2 email
                DatosPersona dp = new DatosPersona();
                dp.setNombre(nombre);
                dp.setEmail(email);
                datos.add(dp);
            }
            return datos;
        } catch (SQLException ex) {
            Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
