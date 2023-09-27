package aula2709;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dados")
public class Dados extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		try {
			
			String nome = request.getParameter("nome");
			String estado = request.getParameter("estadocivil");
			String idade = request.getParameter("idade");
		
			PrintWriter writer = response.getWriter();
			
			writer.append("<HTML><BODY>");
			writer.append("Seu nome é: "+ nome+" você é "+estado+" e tem "+idade);
			
			
			
			writer.append( "</BODY>  </HTML>" );

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
