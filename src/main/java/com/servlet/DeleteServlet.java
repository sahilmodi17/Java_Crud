package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.conn.Dbconn;
import com.dao.StudentDAO;
import com.entity.Student;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.parseInt(req.getParameter("id"));

		StudentDAO dao = new StudentDAO(Dbconn.getConnection());

		boolean d = dao.deleteStudent(id);

		if (d) {
			System.out.print("deleted succesfully");
			resp.sendRedirect("/project1/index.jsp");
		} else {
			System.out.print("fail");
		}

	}

}
