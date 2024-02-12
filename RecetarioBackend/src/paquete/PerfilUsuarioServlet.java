package paquete;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PerfilUsuarioServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//obtener el id de usuario desde la sesion
		int IDUsuario = (int) request.getSession().getAttribute("IDUsuario");
		
		//obtener el perfil del usuario desde la base de datos
		PerfilUsuarioDAO perfilUsuarioDAO = new PerfilUsuarioDAO();
		Usuarios usuario = perfilUsuarioDAO.obtenerPerfilUsuario(IDUsuario);
		
		//enviar la informacion del usuario a la pagina de perfil
		request.setAttribute("usuario", usuario);
		request.getRequestDispatcher("perfil.jsp").forward(request, response);
	}
}
