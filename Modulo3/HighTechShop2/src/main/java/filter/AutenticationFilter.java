package filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD}, urlPatterns={"/*"}) //error 404 personalizado também
public class AutenticationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest)request).getSession(false);
		
		if(session != null) { //para nao dar NullPointerException...
			
			User user = (User)session.getAttribute("user");
			String url = ((HttpServletRequest)request).getRequestURI();
					
			if(user != null || url.lastIndexOf("login.jsp") > -1 || url.lastIndexOf("login") > -1) {
				filter.doFilter(request, response); //permite o fluxo da request...
			}
			else {
				((HttpServletResponse)response).sendRedirect("login.jsp"); // send to login screen
			}
		}else {
			((HttpServletResponse)response).sendRedirect("login.jsp"); // send to login screen
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
