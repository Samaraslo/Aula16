package model;

import dao.AlunosDAO;
import dao.MatriculasDAO;
import to.AlunoTO;
import to.MatriculasTO;

public class ModelMatricula {
	private String nomeAluno;
	private String dataMatricula;
	private String valor;
	private String statusPagamento;
	private String statusMatricula;
	private String cursosArtes;
	private String cursosInfo;
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	public String getStatusMatricula() {
		return statusMatricula;
	}
	public void setStatusMatricula(String statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
	public String getCursosArtes() {
		return cursosArtes;
	}
	public void setCursosArtes(String cursosArtes) {
		this.cursosArtes = cursosArtes;
	}
	public String getCursosInfo() {
		return cursosInfo;
	}
	public void setCursosInfo(String cursosInfo) {
		this.cursosInfo = cursosInfo;
	}
	
	public void criar() {
		   MatriculasDAO dao = new MatriculasDAO();
		   MatriculasTO to = new MatriculasTO();
		   to.setNomeAluno(nomeAluno);
		   to.setDataMatricula(dataMatricula);
		   to.setValor(valor);
		   to.setStatusPagamento(statusPagamento);
		   to.setStatusMatricula(statusMatricula);
		   to.setCursosArtes(cursosArtes);
		   to.setCursosInfo(cursosInfo);
		   try {
			dao.Create(to);
		} catch (Exception e) {
			e.printStackTrace();
		}
		   }
		   public void atualizar() {
			   MatriculasDAO dao = new MatriculasDAO();
			   MatriculasTO to = new MatriculasTO();
			   to.setNomeAluno(nomeAluno);
			   to.setDataMatricula(dataMatricula);
			   to.setValor(valor);
			   to.setStatusPagamento(statusPagamento);
			   to.setStatusMatricula(statusMatricula);
			   to.setCursosArtes(cursosArtes);
			   to.setCursosInfo(cursosInfo);
		   try {
			dao.update(to);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   }
		   public void excluir() {
			   MatriculasDAO dao = new MatriculasDAO();
			   MatriculasTO to = new MatriculasTO();
		   to.setNomeAluno(nomeAluno);
		   try {
			dao.delet(nomeAluno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   }
}
