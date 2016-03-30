package model;

import dao.ArtesDAO;
import to.CursoTO;

public class ModelArtes extends ModelCurso{
   private String descricaoMaterial;
   private String nomeDosLivros;

//getters e setters

   public ModelArtes(){
     
   }
   public ModelArtes(int pId, String pNomeCurso, String pDataInicio, String pDataTermino, String pHorario,
		int pNumeroVagas, Double pValorCurso, String pDescricao, String pLivros, String pNumLab) {
	   
	// TODO Auto-generated constructor stub
}
public void setDescricaoMaterial(String descricaoMaterial){
      this.descricaoMaterial = descricaoMaterial;
   }

   public String getDescricaoMaterial(){
      return this.descricaoMaterial;
   }
   
    public void setNomeDosLivros(String nomeDosLivros){
      this.nomeDosLivros = nomeDosLivros;
   }

   public String getNomeDosLivros(){
      return this.nomeDosLivros;
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
	   to.setDescricao(descricaoMaterial);
       to.setLivros(nomeDosLivros);
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