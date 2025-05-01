package com.onlinefacultyapplication.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlinefacultyapplication.model.Department;
import com.onlinefacultyapplication.model.Teacher;

public class DepartmentDAOImpl implements DepartmentDAO {
	private final String url;
	private final String username;
	private final String password;

	public DepartmentDAOImpl(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public Department createDepartment(Department department) {
		return null;
	}

	@Override
	public Department getDepartmentById(int id) {
		return null;
	}

	@Override
	public List<Department> getAllDepartments() {
		return null;
	}

	@Override
	public void updateDepartment(Department department) {
	}

	@Override
	public boolean deleteDepartment(int id) {
		return false;
	}

	@Override
	public List<Department> searchDepartmentsByName(String name) {
		return null;
	}

	private Department extractDepartmentFromResultSet(ResultSet resultSet) throws SQLException {
		return null;
	}

}
