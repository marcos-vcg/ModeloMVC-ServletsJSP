package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.SessaoDao;
import model.ClienteBean;
import model.Sessao;


@WebServlet("/SalvarSessao")
public class SalvarSessaoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		String filme = request.getParameter("filme");
		String data = request.getParameter("data");
		String inicio = request.getParameter("inicio");
		String termino = request.getParameter("termino");
		int sala = Integer.parseInt(request.getParameter("sala"));
		
		
		// Compara String termino com inicio, se ela for maior entra no bloco 
		if(termino.compareTo(inicio) > 0) {

			// Cria uma nova Sessao
			Sessao sessao = new Sessao();
			sessao.setFilme(filme);
			sessao.setData(data);
			sessao.setInicio(inicio);
			sessao.setTermino(termino);
			sessao.setSala(sala);
			
			// Adiciona a Sessao ao BD
			SessaoDao sessaoDao = new SessaoDao();
			sessaoDao.inserir(sessao);
			
			// Redireciona para a página de sucesso passando como parâmetros os atributos cadastrados
			response.sendRedirect("sucessoCadSessao.jsp?filme="+filme+"&data="+data+"&inicio="+inicio+"&termino="+termino+"&sala="+sala);		
		} else {
			
			// Caso contrario não adiciona a sessão e encaminha para a pagina de erro para corrigir o cadastro
			response.sendRedirect("erroCadSessao.jsp?filme="+filme+"&data="+data+"&inicio="+inicio+"&termino="+termino+"&sala="+sala);		
		}
		
	}

}
