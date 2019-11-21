
package com.vn.appweb.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**Servlet que genera una respuesta en formato html
 * 
 * @author Equipo 1
 */
public class HolaHtmlServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp) throws IOException{
        //definimos el tipo de contenido segun los tipos mime
        //eran los formatos de ficheros para el envio de emails
        respuestaHttp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter salida = respuestaHttp.getWriter())
        {
            salida.print("<html>");
            salida.print("<head>");
            salida.print("<title>Web HTML desde servlet</title>");
            salida.print("<link rel=\"stylesheet\" href=\"./hola.css\"/>");
            salida.print("</head>");
            salida.print("<body>");
            salida.print("<h1>Web html desde servlet</h1>");
            salida.print("<h2 class='color-rojo'>Hola que pasa</h2>");
            salida.print("<ul>");
            for (int i = 0; i < 10; i++) {
                salida.print("<li id=\"li"+i+"\">Iteracion"+i+"</li>");
            }
            salida.print("</ul>");
            salida.println("<br>Ruta;"+ peticionHttp.getContextPath());
            salida.println("<br>Salida;"+ peticionHttp.getMethod());
            salida.print("</body>");
            salida.print("</html>");
        }
    }

}
