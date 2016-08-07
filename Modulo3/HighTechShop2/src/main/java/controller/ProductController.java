package controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import model.Product;

@WebServlet("/product")
public class ProductController extends HttpServlet{

	ProductDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao = new ProductDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String action = req.getParameter("action");
		
		if(action != null && action.equalsIgnoreCase("update")){
			Integer id = Integer.valueOf(req.getParameter("id"));
			
			Product product = dao.findById(id);
			req.setAttribute("product", product);
			
			req.getRequestDispatcher("WEB-INF/formproduct.jsp").forward(req, resp);
			
		}else{
			ProductDAO dao = new ProductDAO();
			List<Product> products = dao.findAll();
			
			req.setAttribute("products", products);
			
			req.getRequestDispatcher("WEB-INF/productlist.jsp").forward(req, resp);
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		if(action.equalsIgnoreCase("cad")){
			
			Product product = new Product();
			if(req.getParameter("id") != null)
				product.setId(Integer.valueOf(req.getParameter("id")));
			product.setName(req.getParameter("name"));
			product.setPrice(Double.parseDouble(req.getParameter("price")));
			product.setBrand(req.getParameter("brand"));
			product.setValidDate(new Date(Date.parse(req.getParameter("validDate"))));

			if(product.getId() != null && product.getId() > 0){
				//alterar
				dao.update(product);
			}else{
				//salvar
				dao.insert(product);
			}
			List<Product> products = dao.findAll();
			
			req.setAttribute("products", products);
			
			req.getRequestDispatcher("WEB-INF/productlist.jsp").forward(req, resp);

		}else if(action.equalsIgnoreCase("rem")){
			//Remoção
			
			String[] ids = req.getParameterValues("id");
			
			for(String id : ids){
				dao.deletById(Integer.valueOf(id));
			}
			
			ProductDAO dao = new ProductDAO();
			List<Product> products = dao.findAll();
			
			req.setAttribute("products", products);
			
			req.getRequestDispatcher("WEB-INF/productlist.jsp").forward(req, resp);
			
		}
		
				
	}
	
}
