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
 * Servlet implementation class UpdateServlet
 */

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String name = req.getParameter("name");
		String contact = req.getParameter("number");
		String email = req.getParameter("email");
		int age = Integer.parseInt( req.getParameter("age"));
		int id=Integer.parseInt(req.getParameter("id"));
		
		
		
		
		Student student = new Student(id,name , email , contact ,age);
		
		
		StudentDAO dao = new StudentDAO(Dbconn.getConnection());
	
		boolean d = dao.updateStudent(student);
		
		if(d) {
			System.out.print("updated succesfully");
			resp.sendRedirect("/project1/index.jsp"); 
		}
		else {
			System.out.print("fail");
		}
	}

}
