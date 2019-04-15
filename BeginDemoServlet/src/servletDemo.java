import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servletDemo {

	private String mymsg;
	
	public void init()throws ServletException{
		mymsg="Application Is Running";
	}
	public void doGet(HttpServletRequest request, 
		      HttpServletResponse response)
		      throws ServletException, IOException 
		   {

		      // Setting up the content type of webpage
		      response.setContentType("text/html");

		      // Writing message to the web page
		      PrintWriter out = response.getWriter();
		      out.println("<h1>" + mymsg + "</h1>");
		   }
	public void destrory() {
		///123
	}

}
