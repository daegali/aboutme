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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 : HH시:mm분:ss초");
		String format_time = sdf.format(System.currentTimeMillis());
		response.setContentType("text/html; charset=UTF-8");	
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현재시간</title></head>");
		out.println("<body>");
		out.println("<a href='index.html'>메인으로</a>");
		out.println("<h1 style='text-align:center; padding-top:250px'>현재 시간은 ");
		out.println(format_time);
		out.println("입니다</h1>");
		out.println("</body></html>");
		out.close();
		
	}

}
