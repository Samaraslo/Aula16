package model;

import to.CursoTO;
import dao.ArtesDAO;
import dao.InformaticaDAO;
import factory.ConnectionFactory;

public class ModelCurso{
   private int idCurso;
   private String nomeCurso;
   private String dataInicio;
   private String dataTermino;
   private String horario;
   private int numeroVagas;
   private double valorCurso;

//getters e setters
   
   public ModelCurso(){
   
   }

   public void setId(int id){
      this.idCurso = id;
   }

   public int getId(){
      return this.idCurso;
   }

   public void setNomeCurso(String nome){
      this.nomeCurso = nome;
   }

   public String getNomeCurso(){
      return this.nomeCurso;
   }

   public void setDataInicio(String  dataIni ){
      this.dataInicio =  dataIni ;
   }

   public String getDataInicio(){
      return this.dataInicio;
   }
   
   public void setDataTermino(String  dataFim ){
      this.dataTermino =  dataFim ;
   }

   public String getDataTermino(){
      return this.dataTermino;
   }
   
    public void setHorario(String  horario ){
      this.horario =  horario ;
   }

   public String getHorario(){
      return this.horario;
   }
   
    public void setNumeroVagas(int  numero ){
      this.numeroVagas =  numero ;
   }

   public int getNumeroVagas(){
      return this.numeroVagas;
   }
   
    public void setValorCurso(double  valorCurso ){
      this.valorCurso =  valorCurso ;
   }

   public double getValorCurso(){
      return this.valorCurso;
   }
   
   public void criarArtes() {
	   ArtesDAO dao = new ArtesDAO();
	   CursoTO to = new CursoTO();
	   to.setIdCurso(idCurso);
	   to.setNomeCurso(nomeCurso);
	   to.setDataInicio(dataInicio);
	   to.setDataTermino(dataTermino);
	   to.setHorario(horario);
	   to.setNumeroVagas(numeroVagas);
	   to.setValorCurso(valorCurso);
	   try {
		dao.Create(to);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   }
	   public void atualizarArtes() {
       ArtesDAO dao = new ArtesDAO();
	   CursoTO to = new CursoTO();
	   to.setIdCurso(idCurso);
	   to.setNomeCurso(nomeCurso);
	   to.setDataInicio(dataInicio);
	   to.setDataTermino(dataTermino);
	   to.setHorario(horario);
	   to.setNumeroVagas(numeroVagas);
	   to.setValorCurso(valorCurso);
	   try {
		dao.update(to);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   }
	   public void excluirArtes() {
	   ArtesDAO dao = new ArtesDAO();
	   CursoTO to = new CursoTO();
	   to.setIdCurso(idCurso);
	   try {
		dao.delet(to);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   }
	   
	

}//fim da classe Produto