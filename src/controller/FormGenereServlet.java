package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Genere;
import service.ServiceFactory;

/**
 * Servlet implementation class FormGenereServlet
 */
@WebServlet("/FormGenereServlet")
public class FormGenereServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormGenereServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/GenereForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Genere genere = new Genere(request.getParameter("nome"));
		ServiceFactory.getGenereService().createGenere(genere);
		request.setAttribute("genere", genere);
		request.getRequestDispatcher("/WEB-INF/CreazioneGenereSuccesso.jsp").forward(request, response);
	}

}
