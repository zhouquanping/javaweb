package login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import user.Userdao;
import user.User;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Userdao dao=new Userdao();
		try {
			User user=dao.findUserByUsernameAndPassword(username,password);
			//request.setAttribute("userid", "123");
			if(user!=null)
			{
				//request.getSession().setAttribute("userid",user.getId());
				//request.setAttribute("id", user.getId());
				response.getWriter().write("µÇÂ½³É¹¦");
				//request.setAttribute("id", user.getId());
				String x=user.getId();
				String y=user.getUsername();
				response.sendRedirect("/chapter05/list.jsp?userid="+x);
			}
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().write("µÇÂ¼Ê§°Ü");
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
