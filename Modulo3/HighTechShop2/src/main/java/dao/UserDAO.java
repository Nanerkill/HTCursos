package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.User;

public class UserDAO {
	
	Connection con;
	
	public UserDAO() {
		con = ConnectionFactory.getConnection();
	}
	
	public void add(User user) {
		String sql = "INSET INTO users (name,login,password) VALUES(?,?,?)";
		
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, user.getName());
			statement.setString(2, user.getLogin());
			statement.setString(3, user.getPassword());
			statement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public User getById(int id) {
		String sql = "SELECT * FROM users WHERE id=?";
		User user = null;
		
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				user = new User(result.getString("name"), result.getString("login"), result.getString("password"));
				user.setId(result.getInt("id"));
				return user;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User> getAll() {
		String sql = "SELECT * FROM user";
		List<User> array = new ArrayList<>();
		
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				User user = new User(result.getString("name"), result.getString("login"), result.getString("password"));
				user.setId(result.getInt("id"));
				array.add(user);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return array;
	}
	
	public void update(User user) {
		String sql = "UPDATE users SET name=?, login=?, password=? WHERE id=?";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, user.getName());
			statement.setString(2, user.getLogin());
			statement.setString(3, user.getPassword());
			statement.setInt(4, user.getId());
			statement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM user WHERE id=?";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, id);
			statement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public User getByLoginAndPassword(User user) {
		String sql = "SELECT * FROM users WHERE login=? AND password=?";
		User user1 = null;
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, user.getLogin());
			statement.setString(2, user.getPassword());
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				user1 = new User(result.getString("name"), result.getString("login"), result.getString("password"));
				user1.setId(result.getInt("id"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return user1;
	}
	

}
