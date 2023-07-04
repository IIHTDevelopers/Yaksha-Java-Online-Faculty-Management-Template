package com.onlinefacultyapplication;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.jboss.jandex.Main;

import com.onlinefacultyapplication.model.Department;
import com.onlinefacultyapplication.model.Teacher;
import com.onlinefacultyapplication.repository.DepartmentDAO;
import com.onlinefacultyapplication.repository.TeacherDAO;

public class OnlineFacultyApplication {
	private static DepartmentDAO departmentDAO;
	private static TeacherDAO teacherDAO;
	private static Scanner scanner;

	public static void main(String[] args) {
		Properties properties = new Properties();

		try (InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("application.properties")) {
			properties.load(inputStream);

			String url = properties.getProperty("jdbc.url");
			String username = properties.getProperty("jdbc.username");
			String password = properties.getProperty("jdbc.password");

			createDatabaseIfNotExists(properties);
			createTablesIfNotExists(properties);

			// write your logic to add options here
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static int getUserChoice() {
		return 0;
	}

	private static void printMenu() {
	}

	public static void createDatabaseIfNotExists(Properties properties) {
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
		String databaseName = properties.getProperty("jdbc.database");

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement()) {
			String createDatabaseSql = "CREATE DATABASE IF NOT EXISTS " + databaseName;
			statement.executeUpdate(createDatabaseSql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void createTablesIfNotExists(Properties properties) {
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
		String databaseName = properties.getProperty("jdbc.database");

		String connectionString = url + "/" + databaseName;

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement()) {

			String createDatabaseSql = "CREATE DATABASE IF NOT EXISTS " + databaseName;
			statement.executeUpdate(createDatabaseSql);

			String useDatabaseSql = "USE " + databaseName;
			statement.executeUpdate(useDatabaseSql);

			String createDepartmentTableSql = "CREATE TABLE IF NOT EXISTS department ("
					+ "id INT PRIMARY KEY AUTO_INCREMENT," + "name VARCHAR(10) NOT NULL)";

			statement.executeUpdate(createDepartmentTableSql);

			String createTeacherTableSql = "CREATE TABLE IF NOT EXISTS teacher (" + "id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(10) NOT NULL," + "subject VARCHAR(255) NOT NULL,"
					+ "designation VARCHAR(20) NOT NULL," + "department_id INT NOT NULL,"
					+ "FOREIGN KEY (department_id) REFERENCES department(id))";

			statement.executeUpdate(createTeacherTableSql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private static void createDepartment(Scanner scanner) {
	}

	private static void createTeacher(Scanner scanner) {
	}

	private static void getDepartmentById(Scanner scanner) {
	}

	private static void getTeacherById(Scanner scanner) {
	}

	private static void getAllDepartments() {
	}

	private static void getAllTeachers() {
	}

	private static void updateDepartment(Scanner scanner) {
	}

	private static void updateTeacher(Scanner scanner) {
	}

	private static void deleteDepartment(Scanner scanner) {
	}

	private static void deleteTeacher(Scanner scanner) {
	}

	private static List<Teacher> searchTeachersByName(Scanner scanner) {
		return null;
	}

	private static List<Teacher> searchTeachersBySubject(Scanner scanner) {
		return null;
	}

	private static List<Department> searchDepartmentsByName(Scanner scanner) {
		return null;
	}
}
