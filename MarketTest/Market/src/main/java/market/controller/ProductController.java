package market.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import market.dao.ProductDAO;
import market.models.Market;
import market.models.Product;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	
	ProductDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao = new ProductDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		List<Product> array = dao.findAll();
		req.setAttribute("products", array);
		req.getRequestDispatcher("productlist.jsp").forward(req, resp);
		*/
		
		String action = req.getParameter("action");
		
		if(action != null && action.equals("update")) {
			// send to form.jsp
		}
		else {
			List<Product> array = dao.findAll();
			req.setAttribute("products", array);
			req.getRequestDispatcher("productlist.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String acao = req.getParameter("acao");
		
		switch(acao) {
		
		case "add":
			//if id != null update else create
			try {
				String priceS = req.getParameter("price");
				Double price = Double.parseDouble(priceS);
				String dateS = req.getParameter("date");
				Date date = new Date(Date.parse(dateS));
				String mk_idS = req.getParameter("mk_id");
				int mk_id = Integer.parseInt(mk_idS);
				
				dao.create(new Product(req.getParameter("name"), req.getParameter("brand"), price, date, mk_id));
				resp.getWriter().println("Product added...");
			} catch(RuntimeException e) {
				resp.getWriter().println("Error adding...");
				e.printStackTrace();
			}
			break;
			
		case "delete":
			try {
				String idS = req.getParameter("id");
				int id = Integer.parseInt(idS);
				Product p = new Product();
				p.setId(id);
				dao.delete(p);
				
				resp.getWriter().println("Product deleted...");
			} catch(RuntimeException e) {
				resp.getWriter().println("Error deleting...");
				e.printStackTrace();
			}
			break;
			
		case "update":
			try {
				String priceS = req.getParameter("price");
				Double price = Double.parseDouble(priceS);
				String dateS = req.getParameter("date");
				Date date = new Date(Date.parse(dateS));
				String mk_idS = req.getParameter("mk_id");
				int mk_id = Integer.parseInt(mk_idS);
				String idS = req.getParameter("id");
				int id = Integer.parseInt(idS);
				
				Product p = new Product(req.getParameter("name"), req.getParameter("brand"), price, date, mk_id);
				p.setId(id);
				dao.update(p);
				resp.getWriter().println("Product updated...");
			} catch(RuntimeException e) {
				resp.getWriter().println("Error updating...");
				e.printStackTrace();
			}
			break;
			
		case "findByMarket":
			Market mk = new Market();
			String idS = req.getParameter("id");
			int id = Integer.parseInt(idS);
			mk.setId(id);
			List<Product> array = dao.findAllByMarket(mk);
			String stg = "";
			
			for(Product x: array) {
				stg += x.getName() + "\n";
			}
			resp.getWriter().println(stg);
			break;
			
		case "deleteMany":
			String ids[] =  req.getParameterValues("id");
			for(String x: ids) {
				try {
					Product p = new Product();
					int a = Integer.valueOf(x);
					p.setId(a);
					dao.delete(p);
				} catch(RuntimeException e) {
					resp.getWriter().println("Error deleting many...");
					e.printStackTrace();
				}
				array = dao.findAll();
				req.setAttribute("products", array);
				req.getRequestDispatcher("productlist.jsp").forward(req, resp);
			}
			break;
		}
	}

}
