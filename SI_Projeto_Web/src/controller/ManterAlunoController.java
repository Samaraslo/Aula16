package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelAluno;

/**
 * Servlet implementation class ManterAlunoController
 */
@WebServlet("/ManterAluno.do")
public class ManterAlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManterAlunoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
				
				//nomeAluno, endereco, telefone, email, rg,cpf
				
				String pNomeAluno = request.getParameter("nome");
				String pEndereco = request.getParameter("endereco");
				String pTelefone = request.getParameter("telefone");
				String pEmail = request.getParameter("email");
				String pRg = request.getParameter("rg"); 
				int pCpf = Integer.parseInt(request.getParameter("cpf"));
					
				String pAcao = request.getParameter("acao");
				
				ModelAluno mdAluno = new ModelAluno(pNomeAluno, pEndereco, pTelefone,pEmail,pRg,pCpf);
				
				
				mdAluno.criar();
				mdAluno.atualizar();
	}

}
