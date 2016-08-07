package market.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import market.connection.ConnectionFactory;
import market.models.Market;
import market.models.Product;

public class ProductDAO {
	
	Connection con;
	
	public ProductDAO() {
		con = ConnectionFactory.getConnection();
	}
	
	public void create(Product p) {
		
		java.sql.Date dateSql = new java.sql.Date(p.getDate().getYear(), p.getDate().getMonth(), p.getDate().getDate());
		
		String sql = "INSERT INTO product (name,brand,price,date,market_id) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, p.getName());
			statement.setString(2, p.getBrand());
			statement.setDouble(3, p.getPrice());
			statement.setDate(4, dateSql);
			statement.setInt(5, p.getMk_id());
			statement.execute();
		} catch(SQLException e) {
			throw new RuntimeException("Error adding product...", e);
		}
		
	}
	
	public void delete(Product p) {
		
		String sql = "DELETE FROM product WHERE id = ?";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, p.getId());
			statement.execute();
		} catch(SQLException e) {
			throw new RuntimeException("Error deleting product...", e);
		}
		
	}
	
	public void update(Product p) {
		
		java.sql.Date dateSql = new java.sql.Date(p.getDate().getYear(), p.getDate().getMonth(), p.getDate().getDate());
		
		String sql = "UPDATE product SET name = ?, brand = ?, price = ?, date = ?, market_id = ? WHERE id = ?";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, p.getName());
			statement.setString(2, p.getBrand());
			statement.setDouble(3, p.getPrice());
			statement.setDate(4, dateSql);
			statement.setInt(5, p.getMk_id());
			statement.setInt(6, p.getId());
			statement.execute();
		} catch(SQLException e) {
			throw new RuntimeException("Error updating...", e);
		}
		
	}
	
	public List<Product> findAll() {
		
		List<Product> array = new ArrayList<Product>();
		
		String sql = "SELECT * FROM product";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Product p = new Product(result.getString("name"), result.getString("brand"), result.getDouble("price"), result.getDate("date"), result.getInt("market_id"));
				p.setId(result.getInt("id"));
				
				array.add(p);
			}
		} catch(SQLException e) {
			throw new RuntimeException("Error getting all...", e);
		}
		return array;
	}
	
	public List<Product> findAllByMarket(Market mk) {
		
		List<Product> array = new ArrayList<Product>();
		
		String sql = "SELECT * FROM product WHERE market_id = ?";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, mk.getId());
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Product p = new Product(result.getString("name"), result.getString("brand"), result.getDouble("price"), result.getDate("date"), result.getInt("market_id"));
				p.setId(result.getInt("id"));
				
				array.add(p);
			}
		} catch(SQLException e) {
			throw new RuntimeException("Error getting by market...", e);
		}
		return array;
	}

}
