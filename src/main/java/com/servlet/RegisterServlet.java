package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.conn.Dbconn;
import com.dao.StudentDAO;
import com.entity.Student;

@WebServlet("/register")

public class RegisterServlet extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);

		String name = req.getParameter("name");
		String contact = req.getParameter("number");
		String email = req.getParameter("email");
		int age = Integer.parseInt(req.getParameter("age"));
		

		Student student = new Student(name, email, contact, age);

		System.out.print(student);

		StudentDAO dao = new StudentDAO(Dbconn.getConnection());

		boolean d = dao.addStudent(student);

		if (d) {
			System.out.print("registerd succesfully");
			resp.sendRedirect("/project1/index.jsp");
		} else {
			System.out.print("fail");
		}
	}

}
