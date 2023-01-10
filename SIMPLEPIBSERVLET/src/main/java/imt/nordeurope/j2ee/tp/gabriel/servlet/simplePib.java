package imt.nordeurope.j2ee.tp.gabriel.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class simplePib
 */
@WebServlet(name = "Simplepid", urlPatterns = { "/SimplePid" })
public class simplePib extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public simplePib() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter(); 
		out.println(generateHTML());
        }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter(); 
		//out.println(request.getParameter("country"));
		out.println(generateHTML(request.getParameter("country")));
	}
	
	protected String generateHTML() {
		return "<html>"
				+ "<body>"
				 + "<form id='pibform' method='POST' action='/SIMPLEPIBSERVLET/SimplePid'>"
				  + "<select name='country' form='pibform'>"
				   + "<option>-- Select a country --</option>"
				   + "<option value='France'>France</option>"
				   + "<option value='Allemagne'>Allemagne</option>"
				   + "<option value='USA'>USA</option>"
				  + "</select><br>"
				   + "<input type='submit' name='refresh'></input>"
				  + "</form"
				 + "</body>"
				+"</html>";
	}
	
	protected String generateHTML(String country) {
		if(country.equals("France")) {
			return "<html>"
					+ "<body>"
					 + "<form id='pibform' method='POST' action='/SIMPLEPIBSERVLET/SimplePid'>"
					  + "<select name='country' form='pibform'>"
					   + "<option value='France'>France</option>"
					   + "<option value='Allemagne'>Allemagne</option>"
					   + "<option value='USA'>USA</option>"
					  + "</select><br>"
					   + "<input type='submit' name='refresh'></input>"
					  + "</form><br><br>"
					  + "<p>Le PIB de la France est de 2,958 Md de $"
					 + "</body>"
					+"</html>";
		}
		else if(country.equals("Allemagne")) {
			return "<html>"
					+ "<body>"
					 + "<form id='pibform' method='POST' action='/SIMPLEPIBSERVLET/SimplePid'>"
					  + "<select name='country' form='pibform'>"
					   + "<option value='Allemagne'>Allemagne</option>"
					   + "<option value='France'>France</option>"
					   + "<option value='USA'>USA</option>"
					  + "</select><br>"
					   + "<input type='submit' name='refresh'></input>"
					  + "</form><br><br>"
					  + "<p>Le PIB de l'Allemagne est de 4,26 Md de $"
					 + "</body>"
					+"</html>";
		}
		else {
			return "<html>"
					+ "<body>"
					 + "<form id='pibform' method='POST' action='/SIMPLEPIBSERVLET/SimplePid'>"
					  + "<select name='country' form='pibform'>"
					   + "<option value='USA'>USA</option>"
					   + "<option value='France'>France</option>"
					   + "<option value='Allemagne'>Allemagne</option>"
					  + "</select><br>"
					   + "<input type='submit' name='refresh'></input>"
					  + "</form><br><br>"
					  + "<p>Le PIB des USA est de 23,32 Md de $"
					 + "</body>"
					+"</html>";
		}
	}

}
