package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		out.print("<!DOCTYPE html>");
		out.print("<html><head>");
		out.print("<title>Index Servlet</title>\r\n"
				+ "		</head>\r\n"
				+ "		<body>\r\n"
				+ "		<h2>this is index page</h2>\r\n"
				+ "		</body>\r\n"
				+ "		</html>");
//		response.sendRedirect("");
	}

}
