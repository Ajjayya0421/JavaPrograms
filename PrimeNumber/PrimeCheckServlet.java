
/*6c. Build a servlet program to check the given number is prime number or not using HTML with step by
step procedure.*/











package com.primeservlet;

	


	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/PrimeCheckServlet")
	public class PrimeCheckServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        String numStr = request.getParameter("number");

	        out.println("<html>");
	        out.println("<head><title>Prime Number Check</title></head>");
	        out.println("<body>");

	        if (numStr != null) {
	            int num = Integer.parseInt(numStr);
	            boolean isPrime = true;

	            if (num <= 1) {
	                isPrime = false;
	            } else {
	                for (int i = 2; i <= num / 2; i++) {
	                    if (num % i == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }
	            }

	            if (isPrime) {
	                out.println("<h2 style='color:green;'>" + num + " is a Prime Number</h2>");
	            } else {
	                out.println("<h2 style='color:red;'>" + num + " is Not a Prime Number</h2>");
	            }
	        }

	        out.println("<form action='PrimeCheckServlet' method='get'>");
	        out.println("Enter Number: <input type='text' name='number'>");
	        out.println("<input type='submit' value='Check'>");
	        out.println("</form>");

	        out.println("</body></html>");
	    }
	}
