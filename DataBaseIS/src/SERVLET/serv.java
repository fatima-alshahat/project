package SERVLET;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.DAO;

@WebServlet("/serv")
public class serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public serv() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/form.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO ex = new DAO ();
		ArrayList result = null;
		try {
			result = ex.getExercies();
			request.setAttribute("IS", result);
			this.getServletContext().getRequestDispatcher("/WEB-INF/list.jsp")
			.forward(request, response);}
		catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
