package com.vn.appweb.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vn.appweb.modelo.ConsultaSQL;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 1
 */
public class TestConsultaDatosPersona {
    
    public TestConsultaDatosPersona() {
    }
    @Test
    public void testSelectSQL(){
        ConsultaSQL conSQL = new ConsultaSQL();
        
        assertEquals(0, conSQL.leerTabla("Nom*****ba").size());
        assertEquals("Nombre de prueba", conSQL.leerTabla("Nombre de prueba".toUpperCase().trim()).get(0).getNombre());
        
        assertEquals("aaa@bbb.ccc", conSQL.leerTabla("%A%").get(1).getEmail());
    }
}
