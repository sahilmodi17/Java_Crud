package com.dao;


import java.sql.*;
import java.util.*;


import com.entity.Student;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class StudentDAO {
	
	private Connection conn;

	public StudentDAO(Connection conn) {
		// TODO Auto-generated constructor stub
		
		super();
		
		this.conn= conn;
	}
	
	public boolean addStudent(Student student) {
		boolean f = false;
		try {
			String sql = "insert into student_details(name,email,contact,age) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,student.getFullName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getContact());
			ps.setInt(4, student.getAge());
			
			int i = ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	public List<Student> getAllStudent(){
		List <Student> list = new ArrayList<Student>();
		Student s =null;
		
		try {			
			String sql = "select * from student_details";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				s= new Student();
				s.setId(rs.getInt(1));
				s.setFullName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setContact(rs.getString(4));
				s.setAge(rs.getInt(5));
				list.add(s);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public Student getStudentById(int id) {
		Student s=null;
		
		try {			
			String sql = "select * from student_details where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				s= new Student();
				s.setId(rs.getInt(1));
				s.setFullName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setContact(rs.getString(4));
				s.setAge(rs.getInt(5));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public boolean updateStudent(Student student) {
		boolean f = false;
		try {
			String sql = "update  student_details set name=?,email=?,contact=?,age=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,student.getFullName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getContact());
			ps.setInt(4, student.getAge());
			ps.setInt(5,student.getId());
			
			int i = ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	public boolean deleteStudent(int id) {
		boolean f = false;
		
		try {
			String sql = "delete from student_details where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1,id);
			
	int i = ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
