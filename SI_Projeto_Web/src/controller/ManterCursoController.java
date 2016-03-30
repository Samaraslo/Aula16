package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelAluno;
import model.ModelArtes;
import model.ModelCurso;
import to.CursoTO;

/**
 * Servlet implementation class ManterCursoController
 */
@WebServlet("/ManterCurso.do")
public class ManterCursoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManterCursoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	
		
		int pId = Integer.parseInt(request.getParameter("idCurso"));
		String pNomeCurso = request.getParameter("nomeCurso");
		String pDataInicio = request.getParameter("dataInicio");
		String pDataTermino = request.getParameter("dataTermino");
		String pHorario = request.getParameter("horario");
		int pNumeroVagas = Integer.parseInt(request.getParameter("numeroVagas"));
		Double pValorCurso = Double.parseDouble(request.getParameter("valorCurso")); 
		String pDescricao = request.getParameter("descricao"); 
		String pLivros = request.getParameter("livros"); 
		String pNumLab = request.getParameter("NumeroLab"); 
			
		String pAcao = request.getParameter("acao");
		
		ModelArtes mdArtes = new ModelArtes(pId, pNomeCurso, pDataInicio,pDataTermino,pHorario,pNumeroVagas,pValorCurso,pDescricao,pLivros,pNumLab);
		
		
		mdArtes.criarArtes();
		mdArtes.atualizarArtes();
		mdArtes.excluirArtes();
	}

}
