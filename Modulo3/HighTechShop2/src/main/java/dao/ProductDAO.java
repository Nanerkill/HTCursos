package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.Product;

public class ProductDAO {

	Connection con = ConnectionFactory.getConnection();

	// inserção
	public void insert(Product product) {
		
		@SuppressWarnings("deprecation")
		Date date = new Date(product.getValidDate().getYear(), product.getValidDate().getMonth(),
				product.getValidDate().getDate());
		
		try {
			PreparedStatement statement = con
					.prepareStatement("insert into product (name,price,brand,valid_date) values(?,?,?,?)");
			statement.setString(1, product.getName());
			statement.setDouble(2, product.getPrice());
			statement.setString(3, product.getBrand());
			statement.setDate(4, date);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// buscar todos
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement statement = con.prepareStatement("select * from product");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Product product = new Product();
				product.setId(result.getInt("id"));
				product.setName(result.getString("name"));
				product.setPrice(result.getDouble("price"));
				product.setBrand(result.getString("brand"));
				product.setValidDate(result.getDate("valid_date"));

				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	// buscar por id
	public Product findById(Integer id) {
		Product product = null;
		try {
			PreparedStatement statement = con.prepareStatement("select * from product where id=?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				product = new Product();
				product.setId(result.getInt("id"));
				product.setName(result.getString("name"));
				product.setPrice(result.getDouble("price"));
				product.setBrand(result.getString("brand"));
				product.setValidDate(result.getDate("valid_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	// remover
	public void deletById(Integer id) {
		try {
			PreparedStatement statement = con.prepareStatement("delete from product where id=?");
			statement.setInt(1, id);
			statement.execute();
			System.out.println("Deletado com sucesso!!!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;
	}

	// alterar
	public void update(Product product) {

		@SuppressWarnings("deprecation")
		Date date = new Date(product.getValidDate().getYear(), product.getValidDate().getMonth(),
				product.getValidDate().getDate());

		try {
			PreparedStatement statement = con
					.prepareStatement("update product set name=?, price=?, brand=?, valid_date=? where id=?");
			statement.setString(1, product.getName());
			statement.setDouble(2, product.getPrice());
			statement.setString(3, product.getBrand());
			statement.setDate(4, date);
			statement.setInt(5, product.getId());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
