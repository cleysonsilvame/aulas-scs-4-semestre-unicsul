package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;

import java.io.IOException;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/controller", "/main" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAO con;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		con = new DAO();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		con.testeConexao();

		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

}
