package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.instrument.Instrumentation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static Instrumentation instrumentation;

       
  
    public Login() {
        super();
       
    }

   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("username");
		String passWord=request.getParameter("password");
		System.out.println(userName);
	    String	mime=request.getContentType();
	
	 
	    
		if("amulya".equals(userName)&& "bujjikanna".equals(passWord)){
			response.sendRedirect("success.html");
			 System.out.println(mime);
			    System.out.println(request.getLocale());
			    System.out.println(request.getContentLength());
		}
		else
		{
			response.sendRedirect("failure.html");
			
		}
		 
		 System.out.println(instrumentation.getObjectSize(userName));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
