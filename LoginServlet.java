package com.in28minute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
		/*PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Heloo its my new webpage</title>");  to create the html file without jsp 
		out.println("</head>");										And it create the Static webProject
		out.println("<body>");
		out.print("<h1>google</h1>");
		out.print("<h3>email</h3>");
		out.println("</body>");
		out.println("</html>");
		*/
		
		// To create the link between the JSP fILE AND Servlet Class
		//System.out.println(req.getParameter("name"));  parameters
		
		req.setAttribute("name", req.getParameter("name")); //parameter req
		req.setAttribute("password", req.getParameter("password")); //same parameter req
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);  //link created
		
	}
	
	//make new jsp file for Post method
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
		
		req.getRequestDispatcher("/WEB-INF/views/Post.jsp").forward(req, resp); 
	}
	
	
}
