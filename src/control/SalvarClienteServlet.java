package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import model.ClienteBean;

@WebServlet("/SalvarCliente")
public class SalvarClienteServlet extends HttpServlet {
	
    public SalvarClienteServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		
		ClienteBean cliente = new ClienteBean();
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		
		
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.inserir(cliente);
		
		
		response.sendRedirect("sucesso.jsp?nome=" + nome + "&telefone=" + telefone + "&email=" + email);		
	}

}
