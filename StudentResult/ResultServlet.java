/*10.b Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5
through JSP called index.jsp with client sided validation and submit to the servlet called
ResultServlet and process all the fields with server sided validation and display all the data
along with result ( Pass if all subjects greater than 40%) and Average marks through
result.jsp with a link to move to the client side*/

package com.studentresult;


	
	
	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;

	@WebServlet("/ResultServlet")
	public class ResultServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        String rollno = request.getParameter("rollno");
	        String name = request.getParameter("name");

	        int s1 = Integer.parseInt(request.getParameter("sub1"));
	        int s2 = Integer.parseInt(request.getParameter("sub2"));
	        int s3 = Integer.parseInt(request.getParameter("sub3"));
	        int s4 = Integer.parseInt(request.getParameter("sub4"));
	        int s5 = Integer.parseInt(request.getParameter("sub5"));

	        String message;

	        if (rollno == null || rollno.isEmpty() || name == null || name.isEmpty()) {
	            message = "Invalid Input";
	        } else {

	            int total = s1 + s2 + s3 + s4 + s5;
	            double avg = total / 5.0;

	            String result;

	            if (s1 > 40 && s2 > 40 && s3 > 40 && s4 > 40 && s5 > 40) {
	                result = "Pass";
	            } else {
	                result = "Fail";
	            }

	            request.setAttribute("rollno", rollno);
	            request.setAttribute("name", name);
	            request.setAttribute("sub1", s1);
	            request.setAttribute("sub2", s2);
	            request.setAttribute("sub3", s3);
	            request.setAttribute("sub4", s4);
	            request.setAttribute("sub5", s5);
	            request.setAttribute("average", avg);
	            request.setAttribute("result", result);

	            message = "Processed Successfully";
	        }

	        request.setAttribute("message", message);

	        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
	        rd.forward(request, response);
	    }
	}
