/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Equipo 1
 */
public class HolaCSSServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp) throws IOException{
        respuestaHttp.setContentType("text/css");
        try(PrintWriter salida = respuestaHttp.getWriter())
        {
            salida.print(".color-rojo{color:red;}");
            for (int i = 0; i < 10; i++) {
                salida.print("#li"+i+"{font-size:"+(i*2+8)+";}");
            }
        }
    }
}
