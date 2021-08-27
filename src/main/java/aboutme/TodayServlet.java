package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� : HH��:mm��:ss��");
		String format_time = sdf.format(System.currentTimeMillis());
		response.setContentType("text/html; charset=UTF-8");	
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>����ð�</title></head>");
		out.println("<body>");
		out.println("<a href='index.html'>��������</a>");
		out.println("<h1 style='text-align:center; padding-top:250px'>���� �ð��� ");
		out.println(format_time);
		out.println("�Դϴ�</h1>");
		out.println("</body></html>");
		out.close();
		
	}

}
