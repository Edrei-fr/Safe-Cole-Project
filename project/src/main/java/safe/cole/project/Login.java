package safe.cole.project;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/user-page")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cuenta = request.getParameter("cuenta");
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("project");
		EntityManager em = factoria.createEntityManager();
		TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre='"+usuario+"'", Usuario.class);
		Usuario u=query.getSingleResult();
		if(u.getPassword().equals(pass)&&cuenta.equals("fam")) {
			RequestDispatcher rd = request.getRequestDispatcher("/familiar.jsp");
			rd.forward(request, response);
		}else if(u.getPassword().equals(pass)&&cuenta.equals("dir")) {
			RequestDispatcher rd = request.getRequestDispatcher("/direccion.jsp");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("/direccion.jsp");
			rd.include(request, response);
		}
	}

}
