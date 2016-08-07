package market.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import market.connection.ConnectionFactory;
import market.models.Market;

public class MarketDAO {
	
	Connection con;
	
	public MarketDAO() {
		con = ConnectionFactory.getConnection();
	}
	
	public void create(Market mk) {
		
		String sql = "INSERT INTO market (name) VALUES(?)";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, mk.getName());
			statement.execute();
		} catch(SQLException e) {
			throw new RuntimeException("Error adding to database...", e);
		}
		
	}
	
	public void delete(Market mk) {
		
		String sql = "DELETE FROM market WHERE name = ?";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, mk.getName());
			statement.execute();
		} catch(SQLException e) {
			throw new RuntimeException("Error deleting...", e);
		}
		
	}
	
	public void update(Market mk) {
		
		String sql = "UPDATE market SET name = ? WHERE id = ?";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, mk.getName());
			statement.setInt(2, mk.getId());
			statement.execute();
		} catch(SQLException e) {
			throw new RuntimeException("Error updating...", e);
		}
		
	}
	
	public List<Market> findAll() {
		
		List<Market> array = new ArrayList<Market>();
		
		String sql = "SELECT * FROM market";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Market mk = new Market(result.getString("name"));
				mk.setId(result.getInt("id"));
				
				array.add(mk);
			}
		} catch(SQLException e) {
			throw new RuntimeException("Error getting all...", e);
		}
		
		return array;
	}

}
