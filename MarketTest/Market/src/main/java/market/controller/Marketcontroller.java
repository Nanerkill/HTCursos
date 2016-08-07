package market.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import market.dao.MarketDAO;
import market.models.Market;

@WebServlet("/market")
public class Marketcontroller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Market> array = new MarketDAO().findAll();
		String stg = "";
		for(Market x: array) {
			stg += x.getName() + "\n";
		}
		resp.getWriter().println(stg);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("acao");
		
		switch(action) {
		
		case "add":
			try {
				new MarketDAO().create(new Market(req.getParameter("name")));
				resp.getWriter().println("Market added...");
			} catch(RuntimeException e) {
				resp.getWriter().println("Error adding...");
				e.printStackTrace();
			}
			break;
			
		case "delete":
			try {
				new MarketDAO().delete(new Market(req.getParameter("name")));
				resp.getWriter().println("Market deleted...");
			} catch(RuntimeException e) {
				resp.getWriter().println("Error deleting...");
				e.printStackTrace();
			}
			break;
			
		case "update":
			try {
				Market mk = new Market(req.getParameter("name"));
				String idS = req.getParameter("id");
				int id = Integer.parseInt(idS);
				mk.setId(id);
				new MarketDAO().update(mk);
				resp.getWriter().println("Market updated...");
			} catch(RuntimeException e) {
				resp.getWriter().println("Error updating...");
				e.printStackTrace();
			}
			break;
			
		default :
			resp.getWriter().println("No such action...");
			break;
			
		}
		
	}
	
}
