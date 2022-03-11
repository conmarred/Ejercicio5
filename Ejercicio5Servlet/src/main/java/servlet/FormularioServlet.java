package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Usuario;

/**
 * Servlet implementation class principal
 */
@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		Usuario usuario1 = new Usuario("Conce", "pass");
		Usuario usuario2 = new Usuario("CarolC", "pass4word");
		Usuario usuario3 = new Usuario("Pablo", "password");
		
		List<Usuario> lsUsuario = new ArrayList<Usuario>();
		lsUsuario.add(usuario1);
		lsUsuario.add(usuario2);
		lsUsuario.add(usuario3);
		
		
		boolean usuarioCorrecto = false;
		for(int i = 0; i<lsUsuario.size(); i++) {
			String u = lsUsuario.get(i).getUsuario();
			String c = lsUsuario.get(i).getPassword();
			if(u.equals(usuario) && c.equals(password)) {
				usuarioCorrecto = true;
			}
		}
		if(usuarioCorrecto) {
			RequestDispatcher rd = request.getRequestDispatcher("bienvenida.jsp");
			request.setAttribute("usuario", usuario);
			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			request.setAttribute("usuario", usuario);
			rd.forward(request, response);

		}
		
	}
}	
