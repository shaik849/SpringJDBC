package com.spring.db.SpringTestDb.studentDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.db.SpringTestDb.entity.Student;

public class StudentDaoClass implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		 String query = "insert into Student(id, name, city) values(?, ?, ?) ";
		 int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		 return result;	 
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoClass(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		String query = "update Student set name=? ,city=? where id =?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;	
	}

	@Override
	public int delete(Student student) {
		// TODO Auto-generated method stub
		String query = "delete from Student where id =?";
		int result = this.jdbcTemplate.update(query, student.getId());
		return result;	
	}

}
