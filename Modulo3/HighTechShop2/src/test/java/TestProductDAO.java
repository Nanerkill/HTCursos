import java.util.Date;
import java.util.List;


import dao.ProductDAO;
import model.Product;

public class TestProductDAO {

	public static void main(String[] args) {
		
		ProductDAO dao = new ProductDAO();
		
		Product newProduct = new Product();
		newProduct.setName("Produto novo 2");
		newProduct.setPrice(5.0);
		newProduct.setBrand("Marca Nova 2");
		newProduct.setValidDate(new Date());
		
		dao.insert(newProduct);
		
		List<Product> products = dao.findAll();
		for(Product product:products){
			System.out.println(product.getName());
		}
		
	/*	Product product = dao.findById(1);
		System.out.println(product.getName())
		;*/
		
//		dao.deletById(1);

	}

}
