package tommy.spring.polymorphism;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloSpring extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloSpring() {
        super();
        System.out.println("HelloServlet 객체 생성");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 메서드 호출");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
