package com.onlinefacultyapplication.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlinefacultyapplication.model.Teacher;

public class TeacherDAOImpl implements TeacherDAO {
	private final String url;
	private final String username;
	private final String password;

	public TeacherDAOImpl(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public Teacher createTeacher(Teacher teacher) {
		return null;
	}

	@Override
	public Teacher getTeacherById(int id) {
		return null;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return null;
	}

	@Override
	public List<Teacher> getTeachersByDepartment(int departmentId) {
		return null;
	}

	@Override
	public void updateTeacher(Teacher teacher) {
	}

	@Override
	public boolean deleteTeacher(int id) {
		return false;
	}

	@Override
	public List<Teacher> searchTeachersByName(String name) {
		return null;
	}

	@Override
	public List<Teacher> searchTeachersBySubject(String subject) {
		return null;
	}

	private Teacher extractTeacherFromResultSet(ResultSet resultSet) throws SQLException {
		return null;
	}
}
