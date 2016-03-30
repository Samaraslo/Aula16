package model;



public class ModelInformatica extends ModelCurso{
   private String descricaoSoftware;
    private int numeroLaboratorios;

    /*
    public ModelInformatica(int idCurso, String nomeCurso,String dataInicio, String dataTermino, String horario, int numeroVagas, double valorCurso, String descricaoSoftware, int numeroLaboratorios ){
    	this.descricaoSoftware=descricaoSoftware;
    	this.numeroLaboratorios=numeroLaboratorios;
    }
     */
//getters e setters
   public void setDescricaoSoftware(String descricaoSoftware){
      this.descricaoSoftware = descricaoSoftware;
   }

   public String getDescricaoSoftware(){
      return this.descricaoSoftware;
   }
   
    public void setNumeroLaboratorios(int numeros){
      this.numeroLaboratorios = numeros;
   }

   public int getNumeroLaboratorios(){
      return this.numeroLaboratorios;
   }
}//fim da classe Produto