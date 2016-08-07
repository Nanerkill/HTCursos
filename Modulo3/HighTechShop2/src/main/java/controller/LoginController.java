package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import model.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = new User();
		user.setLogin(req.getParameter("login"));
		user.setPassword(req.getParameter("password"));
		
		UserDAO dao = new UserDAO();
		User userFound = dao.getByLoginAndPassword(user);
		
		if(userFound != null) {
			System.out.println("Autenticado");
			HttpSession session = req.getSession();
			session.setAttribute("user", userFound);
			session.setMaxInactiveInterval(30); //segundos inativo...
			req.getRequestDispatcher("WEB-INF/index.jsp").forward(req, resp);
		}
		else {
			System.out.println("User not found...");
			resp.getWriter().print("<script>alert('User not found'); history.go(-1)</script>");
		}
		//System.out.println((user2 != null) ? "Autenticado" : "Usuario nao encontrado");
		
	}

}
